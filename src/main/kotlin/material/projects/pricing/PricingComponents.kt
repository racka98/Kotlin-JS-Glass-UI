package material.projects.pricing

import csstype.*
import material.common.*
import material.components.ThemeContext
import mui.icons.material.Star
import mui.material.*
import mui.material.styles.TypographyVariant
import mui.system.Breakpoint
import mui.system.responsive
import mui.system.sx
import react.*
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.main
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.ul

val PricingComponents = FC<Props> {
    topLayout()
    bottomLayout()
}

private val topLayout = FC<Props> {
    Container {
        disableGutters = true
        maxWidth = Breakpoint.sm
        component = main
        sx { paddingTop = 16.px; paddingBottom = 8.px }

        Typography {
            component = h1
            variant = TypographyVariant.h2
            align = TypographyAlign.center
            color = "text.primary"
            gutterBottom = true
            +"Pricing"
        }
        Typography {
            component = p
            variant = TypographyVariant.h5
            align = TypographyAlign.center
            color = "text.secondary"
            +"""
                Quickly build an effective pricing table for your potential customers with
                this layout. It's built with default MUI components with little
                customization.
            """.trimIndent()
        }
    }
}

private val bottomLayout = FC<Props> {
    val theme by useContext(ThemeContext)
    Container {
        component = main
        maxWidth = Breakpoint.md
        Grid {
            container = true
            spacing = responsive(5)
            sx { alignItems = AlignItems.flexEnd }

            for (tier in tiers) {
                Grid {
                    item = true
                    key = tier.title
                    xs = 12
                    sm = if (tier.title == "Pro") 12 else 6
                    md = 4

                    Card {
                        CardHeader {
                            title = ReactNode(tier.title)
                            subheader = ReactNode("This is a subheader")
                            titleTypographyProps = titleTypographyProps?.apply {
                                align = TypographyAlign.center
                            }
                            subheaderTypographyProps = subheaderTypographyProps?.apply {
                                align = TypographyAlign.center
                            }
                            action = if (tier.title == "Pro") Star.create() else null
                            sx {
                                val grey1 = theme.palette.grey[200].toString()
                                val grey2 = theme.palette.grey[700].toString()
                                backgroundColor = if (theme == Themes.Light) Color(grey1) else Color(grey2)
                            }
                        }
                        CardContent {
                            Box {
                                sx {
                                    display = Display.flex
                                    justifyContent = JustifyContent.center
                                    alignItems = AlignItems.center
                                    marginBottom = 8.px
                                }
                                Typography {
                                    component = h2
                                    variant = TypographyVariant.h3
                                    sx { color = theme.palette.text.primary }
                                    +tier.price
                                }
                                Typography {
                                    variant = TypographyVariant.h6
                                    sx { color = theme.palette.text.secondary }
                                    +"/mo"
                                }
                            }

                            ul {
                                for (desc in tier.description) {
                                    Typography {
                                        component = li
                                        variant = TypographyVariant.subtitle1
                                        align = TypographyAlign.center
                                        key = desc
                                        +desc
                                    }
                                }
                            }
                            CardActions {
                                Button {
                                    variant = tier.buttonVariant
                                    fullWidth = true
                                    +tier.buttonText
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}