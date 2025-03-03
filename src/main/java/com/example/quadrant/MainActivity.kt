package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantTheme {
                    Greeting()
                }
            }
        }

}

@Composable
fun Greeting() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            GreetingText1(modifier = Modifier.weight(1f))
            GreetingText2(modifier = Modifier.weight(1f))
        }
        Row(modifier = Modifier.weight(1f)) {
            GreetingText3(modifier = Modifier.weight(1f))
            GreetingText4(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun GreetingText1(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(Color(0xFFEADDFF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Text composable",
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Displays text and follows the recommended Material Design guidelines.",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun GreetingText2(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(Color(0xFFD0BCFF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Image composable",
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Creates a composable that lays out and draws a given Painter class object.",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun GreetingText3(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(Color(0xFFB69DF8)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Row composable",
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "A layout composable that places its children in a horizontal sequence.",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun GreetingText4(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(Color(0xFFF6EDFF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Column composable",
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "A layout composable that places its children in a vertical sequence.",
            modifier = Modifier.padding(16.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        Greeting()

    }
}

