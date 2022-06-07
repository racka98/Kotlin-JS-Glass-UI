package glass_website.components

import react.FC
import react.Props
import react.dom.html.ReactHTML

external interface CardProps: Props {
    var imgSrc: String
    var percentage: Int
    var gameName: String
    var gameVersion: String
    var progressBarValue: Float
}

val CardComponent = FC<CardProps> { props ->
    ReactHTML.div {
        ReactHTML.img { src = props.imgSrc }
        // Info
        ReactHTML.div {
            ReactHTML.h2 { +props.gameName}
            ReactHTML.p { +props.gameVersion }
            // Progress Bar
            ReactHTML.div {}
        }
        ReactHTML.h2 { +"${props.percentage}%" }
    }
}