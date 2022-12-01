package material.components

import csstype.Color
import csstype.None
import emotion.react.css
import material.common.Area
import material.common.Sizes
import mui.material.*
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.nav
import react.router.dom.NavLink
import react.router.useLocation
import react.useContext

val Sidebar = FC<Props> {
    val showcases = useContext(ShowCasesContext)
    val lastPathname = useLocation().pathname.substringAfterLast("/")

    Box {
        component = nav
        sx { gridArea = Area.Sidebar }

        Drawer {
            variant = DrawerVariant.permanent
            anchor = DrawerAnchor.left


            Box {
                Toolbar()

                List {
                    sx { width = Sizes.Sidebar.Width }

                    for ((key, name) in showcases) {
                        NavLink {
                            to = key

                            css {
                                textDecoration = None.none
                                color = Color.currentcolor
                            }

                            ListItemButton {
                                selected = lastPathname == key

                                ListItemText {
                                    primary = ReactNode(name)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}