val kotlinVersion = "1.7.20"
val serializationVersion = "1.4.1"
val reactVersion = "18.0.0-pre.332-kotlin-1.6.21"
val kotlinEmotion = "11.9.0-pre.332-kotlin-1.6.21"
val coroutinesVersion = "1.6.4"
val reactYtLiteVersion = "1.0.4"
val reactShareVersion = "4.4.0"
val kotlinStyleVersion = "5.3.5-pre.341-compat"
val kotlinWrappersBomVersion = "1.0.0-pre.454"

plugins {
    kotlin("js") version "1.7.20"
    kotlin("plugin.serialization") version "1.7.20"
}

group = "work.racka"
version = "1.0-alpha01"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(enforcedPlatform(kotlinw("wrappers-bom:$kotlinWrappersBomVersion")))
    implementation(kotlinw("emotion"))
    implementation(kotlinw("react"))
    implementation(kotlinw("react-dom"))
    implementation(kotlinw("react-router-dom"))

    implementation(kotlinw("emotion"))
    implementation(kotlinw("mui"))
    implementation(kotlinw("mui-icons"))

    implementation(npm("date-fns", "2.29.3"))
    implementation(npm("@date-io/date-fns", "2.16.0"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion")
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            runTask {
                dependsOn(":developmentExecutableCompileSync")
            }
            commonWebpackConfig {
                // cssSupport.enabled = true
            }
        }
    }
}

rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
    versions.webpackCli.version = "4.10.0"
}

tasks.create("stage") {
    dependsOn(tasks.getByName("build"))
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"
