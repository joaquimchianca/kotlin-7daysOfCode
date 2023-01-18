// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import extensions.loadImageToBitMap
import java.net.URL


@Composable
@Preview
fun App() {
    val imageURL = "https://m.media-amazon.com/images/M/MV5BNGNhMDIzZTUtNTBlZi00MTRlLWFjM2ItYzViMjE3YzI5MjljXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SY1000_CR0,0,686,1000_AL_.jpg"

    MaterialTheme(
        colors = darkColors()
    ) {
        Surface(
            elevation = 4.dp
        ) {
            Box(modifier = Modifier.fillMaxSize()){
                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        bitmap = imageURL.loadImageToBitMap(),
                        contentDescription = "capa do filme",
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(4.dp))
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                top = 8.dp,
                                start = 8.dp,
                                end = 8.dp
                            ),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Row(verticalAlignment = Alignment.CenterVertically){
                            Icon(
                                Icons.Filled.Star,
                                contentDescription = "ícone de nota para filme",
                                modifier = Modifier.height(16.dp),
                                tint = Color.Yellow
                            )
                            Text("8.9",
                                modifier = Modifier.padding(start = 2.dp),
                                color = Color(0xffeeeeee),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text(
                            "1994",
                            fontSize = 14.sp,
                            color = Color(0xffeeeeee)
                        )
                    }
                    Text("Pulp Fiction",
                        modifier = Modifier.padding(
                            start = 16.dp,
                            top = 8.dp,
                            end = 16.dp
                        ),
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication,
            title = "IMDB") {
        App()
    }
}
