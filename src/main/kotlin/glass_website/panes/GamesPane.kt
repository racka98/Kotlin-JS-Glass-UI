package glass_website.panes

import csstype.*
import emotion.react.css
import glass_website.components.CardComponent
import react.FC
import react.Props
import react.PropsWithClassName
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.input

val GamesPane = FC<Props> {
    div {
        gamesPaneCss()
        // Status
        div {
            h1 { +"Active Games" }
            input { type = InputType.text }
        }
        // Cards
        CardComponent {
            imgSrc = "images/assassins.png"
            gameName = "Assassins Creed: Valhala"
            gameVersion = "PS5 Version"
            percentage = 20
        }
        CardComponent {
            imgSrc = "images/assassins.png"
            gameName = "Assassins Creed: Valhala"
            gameVersion = "PS5 Version"
            percentage = 60
        }
        CardComponent {
            imgSrc = "images/assassins.png"
            gameName = "Assassins Creed: Valhala"
            gameVersion = "PS5 Version"
            percentage = 80
        }
    }
}

fun PropsWithClassName.gamesPaneCss() = css {
    flex = number(2.0)
    margin = Margin(3.rem, 3.rem)
    display = Display.flex
    flexDirection = FlexDirection.column
    justifyContent = JustifyContent.spaceEvenly

    input {
        val color1 = stop(
            rgba(255, 255, 255, .7),
            30.vw
        )
        val color2 = stop(
            rgba(255, 255, 255, .3),
            80.vw
        )
        background = linearGradient(135.deg, color1, color2)
        border = None.none
        borderRadius = 1.rem
        width = 60.pct
        padding = 0.5.rem
    }
}