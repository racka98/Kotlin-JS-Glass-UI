package material.components

import csstype.px
import material.common.Area
import mui.material.Typography
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML.main
import react.router.Outlet
import react.router.Route
import react.router.Routes
import react.useContext

private val DEFAULT_PADDING = 30.px

val Content = FC<Props> {
    val showcases = useContext(ShowCasesContext)

    Routes {
        Route {
            path = "/"
            element = Box.create {
                component = main
                sx {
                    gridArea = Area.Content
                    padding = DEFAULT_PADDING
                }

                Outlet()
            }

            showcases.forEachIndexed { i, showcase ->
                Route {
                    index = i == 0
                    path = showcase.key
                    element = showcase.component.create()
                }
            }

            Route {
                path = "*"
                element = Typography.create { +"404 Page Not Found" }
            }
        }
    }
}