package glass_website.panes

import glass_website.components.CardComponent
import react.FC
import react.Props
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.input

val GamesPane = FC<Props> {
    div {
        // Status
        div {
            h1 { +"Active Games" }
            input { type = InputType.text }
        }
        // Cards
        CardComponent {
            imgSrc = "images/assassins.png"
            gameName = "Assassins Creed"
            gameVersion = "PS5 Version"
            percentage = 60
        }
        CardComponent {
            imgSrc = "images/assassins.png"
            gameName = "Assassins Creed"
            gameVersion = "PS5 Version"
            percentage = 60
        }
        CardComponent {
            imgSrc = "images/assassins.png"
            gameName = "Assassins Creed"
            gameVersion = "PS5 Version"
            percentage = 60
        }
    }
}