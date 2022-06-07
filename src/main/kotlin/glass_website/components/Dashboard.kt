package glass_website.components

import react.FC
import react.Props
import react.dom.html.ReactHTML.div

val Dashboard = FC<Props> {
    div {
        UserComponent()
        LinksComponent()
        ProComponent()
        GamesComponent()
    }
}