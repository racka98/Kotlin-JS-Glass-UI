package glass_website

import csstype.*
import emotion.react.css
import react.PropsWithClassName

val PropsWithClassName.mainCss
    get() = css {
        minHeight = 100.vh
        val color1 = stop(Color("#65dfc9"), 30.vw)
        val color2 = stop(Color("#6cdbeb"), 80.vw)
        background = linearGradient(45.deg, color1, color2)
        display = Display.flex
        alignItems = AlignItems.center
        justifyContent = JustifyContent.center
    }


val PropsWithClassName.glassCss
    get() = css {
        background = NamedColor.white
        minHeight = 80.vh
        width = 60.pct
        val color1 = stop(
            rgba(255, 255, 255, .7),
            10.vw
        )
        val color2 = stop(
            rgba(255, 255, 255, .3),
            80.vw
        )
        background = linearGradient(135.deg, color1, color2)
    }