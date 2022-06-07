package glass_website.components

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.img

val ProComponent = FC<Props> {
    div {
        h2 { +"Join Pro for free Games" }
        img { src = "./images/controller.png" }
    }
}