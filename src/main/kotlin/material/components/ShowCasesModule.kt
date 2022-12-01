package material.components

import material.entities.Showcases
import material.hooks.useShowcases
import react.FC
import react.PropsWithChildren
import react.createContext

val ShowCasesContext = createContext<Showcases>()

val ShowcasesModule = FC<PropsWithChildren> { props ->
    val users = useShowcases()

    ShowCasesContext(users) {
        +props.children
    }
}