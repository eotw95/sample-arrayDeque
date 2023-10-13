package com.example.samplearraudeque

class RssTag(name: String): Tag() {
    override fun createChild(name: String): Tag {
        println("called createChild $name in RssTag")
        return OtherTag(name)
    }

    override fun handleChildTagEnd() {
        println("called handledChildTagEnd in RssTag")
    }
}