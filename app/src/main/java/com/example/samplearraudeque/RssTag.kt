package com.example.samplearraudeque

class RssTag(name: String): Tag() {
    override fun createChild(name: String) {
        println("called createChild $name in RssTag")
    }

    override fun handleChildTagEnd() {
        println("called handledChildTagEnd in RssTag")
    }
}