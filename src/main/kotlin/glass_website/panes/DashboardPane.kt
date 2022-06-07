package glass_website.panes

import csstype.*
import emotion.react.css
import glass_website.components.LinksComponent
import glass_website.components.ProComponent
import glass_website.components.UserComponent
import react.FC
import react.Props
import react.PropsWithClassName
import react.dom.html.ReactHTML.div

val DashboardPane = FC<Props> {
    div {
        dashboardPaneCss()
        UserComponent()
        LinksComponent()
        ProComponent()
    }
}

fun PropsWithClassName.dashboardPaneCss() = css {
    flex = number(1.0)
    display = Display.flex
    flexDirection = FlexDirection.column
    alignItems = AlignItems.center
    justifyContent = JustifyContent.spaceEvenly
    textAlign = TextAlign.center
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
    padding = Padding(2.rem, 1.rem)
}