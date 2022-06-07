package glass_website

import csstype.*
import emotion.react.css
import react.PropsWithClassName

fun PropsWithClassName.mainCss() = css {
    minHeight = 100.vh
    val color1 = stop(Color("#65dfc9"), 30.pct)
    val color2 = stop(Color("#6cdbeb"), 80.pct)
    background = linearGradient(45.deg, color1, color2)
    display = Display.flex
    alignItems = AlignItems.center
    justifyContent = JustifyContent.center
}


fun PropsWithClassName.glassCss() = css {
    background = NamedColor.white
    minHeight = 85.vh
    width = 80.vw
    val color1 = stop(
        rgba(255, 255, 255, .7),
        30.vw
    )
    val color2 = stop(
        rgba(255, 255, 255, .3),
        80.vw
    )
    background = linearGradient(135.deg, color1, color2)
    borderRadius = 2.rem
    backdropFilter = blur(2.rem)
    zIndex = integer(3)
}

fun PropsWithClassName.circleCss(
    builder: PropertiesBuilder.() -> Unit = {}
) = css {
    background = NamedColor.white
    val color1 = stop(
        rgba(255, 255, 255, .8),
        40.pct
    )
    val color2 = stop(
        rgba(255, 255, 255, .2),
        80.pct
    )
    background = linearGradient(135.deg, color1, color2)
    height = 15.rem
    width = 15.rem
    borderRadius = 50.pct
    position = Position.absolute
    builder()
}