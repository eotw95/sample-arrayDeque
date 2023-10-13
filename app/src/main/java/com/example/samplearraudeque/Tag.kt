package com.example.samplearraudeque

abstract class Tag {
    open fun createChild(name: String): Tag = OtherTag(name)
    open fun handleChildTagEnd() {}
}