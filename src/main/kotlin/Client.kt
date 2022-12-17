import browser.document
import dom.html.HTML.div
import dom.html.createElement
import material.projects.pricing.PricingApp
import react.create
import react.dom.client.createRoot

fun main() {
    val container = document.createElement(div)
        .also { document.body.appendChild(it) }

    createRoot(container).render(PricingApp.create())
}