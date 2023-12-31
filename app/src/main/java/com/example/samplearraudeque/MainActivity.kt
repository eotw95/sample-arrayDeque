package com.example.samplearraudeque

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplearraudeque.ui.theme.SampleArrauDequeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main()
    }

    private fun main() {
        val rss = "Rss"
        val rdf = "Rdf"
        val stack = ArrayDeque<Tag>(listOf(Root(rss)))
        val child = stack.last().createChild(rss)
        child.handleChildTagEnd()
    }
}