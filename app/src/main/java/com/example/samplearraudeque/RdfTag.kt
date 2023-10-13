package com.example.samplearraudeque

class RdfTag(name: String): Tag() {
    override fun createChild(name: String) {
        println("called createChild $name in RdfTag")
    }

    override fun handleChildTagEnd() {
        println("called handledChildTagEnd in RdfTag")
    }
}