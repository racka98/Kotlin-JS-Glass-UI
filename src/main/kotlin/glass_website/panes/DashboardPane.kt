package glass_website.panes

import glass_website.components.LinksComponent
import glass_website.components.ProComponent
import glass_website.components.UserComponent
import react.FC
import react.Props
import react.dom.html.ReactHTML.div

val DashboardPane = FC<Props> {
    div {
        UserComponent()
        LinksComponent()
        ProComponent()
    }
}