package com.example.retofinal_ruta3

import com.example.retofinal_ruta3.ui.theme.RetoFinal_Ruta3Theme



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetoFinal_Ruta3Theme {
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/



                MyCardComposable()
            }
        }
    }

}

@Composable
private fun DatosContactoComposable() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(24.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        /*Icon(
            imageVector = Icons.Outlined.Home,
            contentDescription = "Inicio"
        )*/

        val image1 = painterResource(R.drawable.phone_24dp_1f1f1f)
        val image2 = painterResource(R.drawable.email_24dp_1f1f1f)
        val image3 = painterResource(R.drawable.home_24dp_1f1f1f)


        TipoContactoComposable(icono=image1, texto=stringResource(R.string.telefono))
        TipoContactoComposable(icono=image2, texto=stringResource(R.string.email))
        TipoContactoComposable(icono=image3, texto=stringResource(R.string.home_direccion))

    }

}
@Composable
private fun TipoContactoComposable(
    icono: Painter,
    texto: String
) {

    Row(modifier=Modifier.fillMaxWidth()){
        Image(painter = icono, contentDescription = null)

        Text(
            text = texto,
           // modifier = Modifier.padding(bottom = 10.dp),
           // fontWeight = FontWeight.Bold

        )

    }
}

@Composable
private fun logotipo_composable(
    image: Painter,
    fullName: String,
    title: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = image, contentDescription = null)

        Text(
            text = fullName,
            modifier = Modifier.padding(bottom = 10.dp),
            fontWeight = FontWeight.Bold

        )
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 10.dp),
            fontSize = 16.sp
        )
    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RetoFinal_Ruta3Theme {
        //Greeting("Android")
        MyCardComposable()

    }
}

@Composable
fun MyCardComposable() {
    val image = painterResource(R.drawable.android_logo)
    Column(
        Modifier
            .fillMaxWidth()
            .background(color = Color.Gray)
    ) {
        Row(Modifier.weight(0.75f)) {
            logotipo_composable(
                image = image, fullName = stringResource(R.string.FullName),
                title = stringResource(R.string.Title)
            )
        }
        Row(Modifier.weight(0.25f)) {
            DatosContactoComposable()
        }

    }
}

/*import android.os.Bundle
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
import com.example.retofinal_ruta3.ui.theme.RetoFinal_Ruta3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetoFinal_Ruta3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
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
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RetoFinal_Ruta3Theme {
        Greeting("Android")
    }
}*/