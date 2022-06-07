package glass_website

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.main
import react.dom.html.ReactHTML.section

val GlassApMain = FC<Props> {
    main {
        mainCss
        //Glass
        section {
            glassCss
        }
    }
    div {
        // Circle1
    }

    div {
        // Circle2
    }
}

