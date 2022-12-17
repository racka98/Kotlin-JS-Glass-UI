package material.projects.album

import csstype.*
import material.common.md
import material.common.sm
import material.common.xs
import material.components.ThemeContext
import mui.material.*
import mui.material.Size
import mui.material.Stack
import mui.material.styles.TypographyVariant
import mui.system.Box
import mui.system.Breakpoint
import mui.system.Container
import mui.system.responsive
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.img
import react.useContext

private val cards = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

val AlbumComponents = FC<Props> {
    topLayout()
    albumLayout()
}

private val topLayout = FC<Props> {
    val theme by useContext(ThemeContext)
    Box {
        sx {
            println("Bg color: ${theme.palette.background.default}")
            backgroundColor = Color(theme.palette.background.paper)
            paddingTop = 8.px
            paddingBottom = 9.px
        }

        Container {
            maxWidth = Breakpoint.sm
            Typography {
                component = h1
                variant = TypographyVariant.h2
                align = TypographyAlign.center
                gutterBottom = true
                sx { color = theme.palette.text.primary }
                +"Album Layout"
            }
            Typography {
                variant = TypographyVariant.h5
                align = TypographyAlign.center
                paragraph = true
                sx { color = theme.palette.text.secondary }
                +"""
                    Something short and leading about the collection below—its contents,
                    the creator, etc. Make it short and sweet, but not too short so folks
                    don&apos;t simply skip over it entirely.
                """.trimIndent()
            }
            Stack {
                sx {
                    paddingTop = 4.px
                    justifyContent = JustifyContent.center
                }
                direction = responsive(StackDirection.row)
                spacing = responsive(2)

                Button {
                    variant = ButtonVariant.contained
                    +"Main Call to Action"
                }
                Button {
                    variant = ButtonVariant.outlined
                    +"Secondary Action"
                }
            }
        }
    }
}

private val albumLayout = FC<Props> {
    val theme by useContext(ThemeContext)
    Container {
        sx {
            paddingTop = 8.px
            paddingBottom = 8.px
            backgroundColor = Color(theme.palette.background.default)
        }
        maxWidth = Breakpoint.sm
        Grid {
            container = true
            spacing = responsive(4)
            for (card in cards) {
                Grid {
                    item = true
                    key = card.toString()
                    xs = 12
                    sm = 6
                    md = 4

                    Card {
                        sx {
                            height = 100.pct
                            display = Display.flex
                            flexDirection = FlexDirection.column
                        }
                        CardMedia {
                            component = img
                            sx { paddingTop = 56.25.pct /* 16:9 */ }
                            image = "https://source.unsplash.com/random"
                        }
                        CardContent {
                            sx { flexGrow = number(1.0) }
                            Typography {
                                gutterBottom = true
                                variant = TypographyVariant.h5
                                component = h2
                                +"Heading"
                            }
                            Typography { +"This is a media card. Description goes here" }
                        }
                        CardActions {
                            Button { size = Size.small; +"View"; }
                            Button { size = Size.small; +"Edit"; }
                        }
                    }
                }
            }
        }
    }
}