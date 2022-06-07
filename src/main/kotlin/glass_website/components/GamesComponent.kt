package glass_website.components

import react.FC
import react.Props
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.p

val GamesComponent = FC<Props> {
    div {
        // Status
        div {
            h1 { +"Active Games" }
            input { type = InputType.text }
        }
        // Cards
        CardComponent {
            imgSrc = "./images/assassins.png"
            gameName = "Assassins Creed"
            gameVersion = "PS5 Version"
            percentage = 60
        }
        CardComponent {
            imgSrc = "./images/assassins.png"
            gameName = "Assassins Creed"
            gameVersion = "PS5 Version"
            percentage = 60
        }
        CardComponent {
            imgSrc = "./images/assassins.png"
            gameName = "Assassins Creed"
            gameVersion = "PS5 Version"
            percentage = 60
        }
    }
}

external interface CardProps: Props {
    var imgSrc: String
    var percentage: Int
    var gameName: String
    var gameVersion: String
    var progressBarValue: Float
}

val CardComponent = FC<CardProps> { props ->
    div {
        img { src = props.imgSrc }
        // Info
        div {
            h2 { +props.gameName}
            p { +props.gameVersion }
            // Progress Bar
            div {}
        }
        h2 { +"${props.percentage}%" }
    }
}