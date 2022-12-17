package material.projects.album

import csstype.Color
import csstype.px
import material.common.Themes
import material.common.color
import material.components.ThemeContext
import material.components.ThemeModule
import mui.icons.material.Brightness4
import mui.icons.material.Brightness7
import mui.icons.material.PhotoCamera
import mui.material.*
import mui.material.styles.TypographyVariant
import mui.system.Box
import mui.system.PropsWithSx
import mui.system.sx
import react.*
import react.dom.aria.ariaLabel
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.main
import react.dom.html.ReactHTML.p
import kotlin.js.Date

val AlbumApp = FC<Props> {
    ThemeModule { albumContents() }
}

private val albumContents = FC<Props> {
    val theme by useContext(ThemeContext)
    header()
    main {
        AlbumComponents()
    }
    Box {
        sx {
            backgroundColor = Color(theme.palette.background.paper)
            padding = 6.px
        }
        component = footer
        Typography {
            variant = TypographyVariant.h6
            align = TypographyAlign.center
            gutterBottom = true
            +"Footer"
        }
        Typography {
            variant = TypographyVariant.h6
            align = TypographyAlign.center
            gutterBottom = true
            sx { color = theme.palette.text.secondary }
            component = p
            +"Something of purpose for Footer"
        }
        Copyright()
    }
}

private val header = FC<Props> {
    var theme by useContext(ThemeContext)
    AppBar {
        position = AppBarPosition.absolute
        Toolbar {
            PhotoCamera { sx { marginRight = 16.px } }
            Typography {
                variant = TypographyVariant.h6
                color = "inherit"
                noWrap = true
                +"Album Layout"
            }
            Tooltip {
                title = ReactNode("Theme")
                Switch {
                    icon = Brightness7.create()
                    checkedIcon = Brightness4.create()
                    checked = theme == Themes.Dark
                    ariaLabel = "theme"

                    onChange = { _, checked ->
                        theme = if (checked) Themes.Dark else Themes.Light
                    }
                }
            }
        }
    }
}

val Copyright = FC<PropsWithSx> { props ->
    Typography {
        sx = props.sx
        variant = TypographyVariant.body2
        color = "text.secondary"
        align = TypographyAlign.center
        +"Copyright "
        Link {
            color = "inherit"
            href = "https://mui.com/"

            +"My Website"
        }

        +" ${Date().getFullYear()}."
    }
}