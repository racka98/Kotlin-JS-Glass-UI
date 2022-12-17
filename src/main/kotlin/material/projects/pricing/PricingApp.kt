package material.projects.pricing

import csstype.*
import material.common.color
import material.common.sm
import material.common.xs
import material.components.ThemeContext
import material.components.ThemeModule
import material.projects.album.Copyright
import mui.material.*
import mui.material.styles.TypographyVariant
import mui.system.Breakpoint
import mui.system.responsive
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.useContext

val PricingApp = FC<Props> {
    ThemeModule {
        header()
        PricingComponents()
        appFooter()
        Copyright { sx { marginTop = 5.px } }
    }
}

private val header = FC<Props> {
    val theme by useContext(ThemeContext)
    AppBar {
        position = AppBarPosition.static
        color = AppBarColor.primary
        elevation = 0
        sx { borderBottom = Border(1.px, LineStyle.solid, Color(theme.palette.divider.toString())) }
        Toolbar {
            sx { flexWrap = FlexWrap.wrap }
            Typography {
                variant = TypographyVariant.h6
                color = "inherit"
                noWrap = true
                sx { flexGrow = number(1.0) }
                +"Company Name"
            }
            nav {
                Link {
                    variant = "button".asDynamic()
                    sx {
                        color = theme.palette.primary.contrastText
                        margin = Margin(1.px, 8.px)
                    }
                    href = "#"
                    +"Features"
                }
                Link {
                    variant = "button".asDynamic()
                    sx {
                        color = theme.palette.primary.contrastText
                        margin = Margin(1.px, 8.px)
                    }
                    href = "#"
                    +"Enterprise"
                }
                Link {
                    variant = "button".asDynamic()
                    sx {
                        color = theme.palette.primary.contrastText
                        margin = Margin(1.px, 8.px)
                    }
                    href = "#"
                    +"Support"
                }
            }
            Button {
                variant = ButtonVariant.contained
                href = "#"
                color = ButtonColor.success
                sx { margin = Margin(1.px, 8.px) }
                +"Login"
            }
        }
    }
}

private val appFooter = FC<Props> {
    val theme by useContext(ThemeContext)
    Container {
        maxWidth = Breakpoint.sm
        component = footer
        sx {
            borderTop = Border(1.px, LineStyle.solid, Color(theme.palette.divider.toString()))
            marginTop = 8.px
            paddingTop = 3.px
            paddingBottom = 6.px
        }

        Grid {
            container = true
            spacing = responsive(4)
            sx { justifyContent = JustifyContent.spaceEvenly }

            for (footer in footers) {
                Grid {
                    item = true; sm = 3; xs = 6; key = footer.title
                    Typography {
                        variant = TypographyVariant.h6; gutterBottom = true
                        sx { color = theme.palette.text.primary }
                        +footer.title
                    }
                    ul {
                        for (description in footer.description) {
                            li {
                                key = description
                                Link {
                                    href = "#"
                                    variant = "subtitle".asDynamic()
                                    sx { color = theme.palette.text.secondary }
                                    +description
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

data class FooterData(
    val title: String,
    val description: List<String>
)

val footers = listOf(
    FooterData("Company", listOf("Team", "History", "Contact us", "Location")),
    FooterData(
        "Features",
        listOf("Cool Stuff", "Random Feature", "Team Feature", "Developer Stuff", "Another one")
    ),
    FooterData(
        "Resources",
        listOf("Resource", "Resource name", "Another resource", "Final resource")
    ),
    FooterData("Legal", listOf("Privacy Policy", "Terms of use"))
)
