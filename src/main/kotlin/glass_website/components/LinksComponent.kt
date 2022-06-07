package glass_website.components

import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.PropsWithClassName
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.img

val LinksComponent = FC<Props> {
    div {
        div {
        linkCss()
            img { src = "./images/twitch.png" }
            h2 { +"Streams" }
        }
        div {
            linkCss()
            img { src = "./images/steam.png" }
            h2 { +"Games" }
        }
        div {
            linkCss()
            img { src = "./images/upcoming.png" }
            h2 { +"New" }
        }
        div {
            linkCss()
            img { src = "./images/library.png" }
            h2 { +"Library" }
        }
    }
}

fun PropsWithClassName.linkCss() = css {
    display = Display.flex
    margin = Margin(1.rem, 0.rem)
    padding = Padding(1.rem, 2.rem)
    alignItems = AlignItems.center

    h2 {
        padding = Padding(0.rem, 1.rem)
    }

    img {
        height = 2.rem
        width = 2.rem
    }
}