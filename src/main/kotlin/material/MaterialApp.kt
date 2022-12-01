package material

import csstype.Auto
import csstype.Display
import csstype.GridTemplateAreas
import csstype.array
import material.common.Area
import material.common.Sizes
import material.components.*
import mui.material.useMediaQuery
import mui.system.Box
import mui.system.sx
import react.FC
import react.Props
import react.router.dom.HashRouter

val MaterialApp = FC<Props> {
    val mobileNode = useMediaQuery("(max-width:960px)")

    HashRouter {
        ShowcasesModule {
            ThemeModule {
                Box {
                    sx {
                        display = Display.grid
                        gridTemplateRows = array(Sizes.Header.Height, Auto.auto)
                        gridTemplateColumns = array(Sizes.Sidebar.Width, Auto.auto)
                        gridTemplateAreas = GridTemplateAreas(
                            array(Area.Header, Area.Header),
                            if (mobileNode) array(Area.Content, Area.Content)
                            else array(Area.Sidebar, Area.Content)
                        )
                    }
                    
                    Header()
                    if (mobileNode) Menu() else Sidebar()
                    Content()
                }
            }
        }
    }
}