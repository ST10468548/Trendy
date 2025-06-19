package com.example.trendy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.trendy.ui.theme.TrendyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrendyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Trendy",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Trendy" +
                "main screen first screen" +
                "val 1 what if rap song by yanga" +
                "val 2 all of the lights rnb song by Kanye West" +
                "val 3 hey hey gqom by Shado M" +
                "val 4 bow down Gospel song by Benjamin Dube" +
                "second screen first button" +
                "Rating what if 8" +
                "all of the lights 8" +
                "hey hey 4" +
                "bow down 8" +
                "Exit button" +
                "return button" +
                "ratings are for all four songs = 28",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    }
}