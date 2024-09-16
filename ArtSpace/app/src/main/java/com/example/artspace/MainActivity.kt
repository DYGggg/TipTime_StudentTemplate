package com.example.artspace

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                TextDisplay(title = "Hi", author = "Hello")
            }
        }
    }
}

@Composable
fun TextDisplay(title: String, author: String, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = title)
        Text(text = author)
    }
}

//@Composable
//fun ImageDisplay() {
//    var count by remember { mutableIntStateOf(1) }
//    var image = when (count) {
//        1 -> R.drawable
//        else -> R.drawable
//    }
//}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ArtSpacePreview() {
    ArtSpaceTheme {
        TextDisplay(title = "Hi", author = "Hello")
    }
}