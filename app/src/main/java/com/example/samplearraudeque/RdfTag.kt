package com.example.samplearraudeque

class RdfTag(name: String): Tag() {
    override fun createChild(name: String): Tag {
        println("called createChild $name in RdfTag")
        return OtherTag(name)
    }

    override fun handleChildTagEnd() {
        println("called handledChildTagEnd in RdfTag")
    }
}