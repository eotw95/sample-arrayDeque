package com.example.samplearraudeque

class Root(name: String): Tag() {
    override fun createChild(name: String): Tag {
        return when(name) {
            "Rss" -> RssTag(name)
            "Rdf" -> RdfTag(name)
            else -> OtherTag(name)
        }
    }
}