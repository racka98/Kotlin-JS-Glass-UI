import glass_website.GlassApMain
import browser.document
import dom.html.HTML.div
import dom.html.createElement
import material.MaterialApp
import react.create
import react.dom.client.createRoot

fun main() {
    val container = document.createElement(div)
        .also { document.body.appendChild(it) }

    createRoot(container).render(MaterialApp.create())
}