package glass_website.components

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.img

val LinksComponent = FC<Props> {
    div {
        div {
            img { src = "./images/twitch.png" }
            h2 { +"Streams" }
        }
        div {
            img { src = "./images/steam.png" }
            h2 { +"Games" }
        }
        div {
            img { src = "./images/upcoming.png" }
            h2 { +"New" }
        }
        div {
            img { src = "./images/library.png" }
            h2 { +"Library" }
        }
    }
}