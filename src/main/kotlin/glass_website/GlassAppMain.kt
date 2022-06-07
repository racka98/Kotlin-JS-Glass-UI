package glass_website

import csstype.integer
import csstype.pct
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.main
import react.dom.html.ReactHTML.section

val GlassApMain = FC<Props> {
    main {
        mainCss()
        //Glass
        section {
            glassCss()
        }
    }
    div {
        // Circle1
        circleCss {
            zIndex = integer(1)
            top = 2.pct
            right = 5.pct
        }
    }

    div {
        // Circle2
        circleCss {
            zIndex = integer(2)
            bottom = 2.pct
            left = 5.pct
        }
    }
}

