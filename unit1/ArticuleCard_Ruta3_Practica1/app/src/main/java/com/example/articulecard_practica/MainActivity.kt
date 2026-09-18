package com.example.articulecard_practica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulecard_practica.ui.theme.ArticuleCard_PracticaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticuleCard_PracticaTheme {
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/

                Surface(modifier = Modifier.fillMaxSize(), color= MaterialTheme.colorScheme.background){
                    ComposeArticuleApp()
                }
            }
        }
    }
}

@Composable
private fun ComposeArticuleApp() {
ArticuleCard(title= stringResource(R.string.title),
    shortDescription=stringResource(R.string.shortDescription),
    longDescription=stringResource(R.string.longDescription),
    imagePainter= painterResource(R.drawable.bg_compose_background)
)
}

@Composable
fun ArticuleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier= Modifier
) {
Column(modifier=modifier){
    Image(painter=imagePainter,contentDescription = null)
    Text(
        text=title,
        modifier=Modifier.padding(16.dp),
        fontSize = 24.sp
    )
    Text(
        text=shortDescription,
        modifier=Modifier.padding(start=16.dp,end=16.dp),
        textAlign= TextAlign.Justify
    )
    Text(
        text=longDescription,
        modifier=Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}
}


/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
*/
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticuleCard_PracticaTheme {
       // Greeting("Android")
        ComposeArticuleApp()
    }
}


