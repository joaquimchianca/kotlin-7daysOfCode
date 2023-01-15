// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import extensions.loadImageToBitMap
import java.net.URL


@Composable
@Preview
fun App() {
    val imageURL = "https://m.media-amazon.com/images/M/MV5BNGNhMDIzZTUtNTBlZi00MTRlLWFjM2ItYzViMjE3YzI5MjljXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SY1000_CR0,0,686,1000_AL_.jpg"
    MaterialTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Pulp Fiction: Tempo de violência (1994)")
            Image(
                bitmap = imageURL.loadImageToBitMap(),
                contentDescription = "Pulp Fiction",
                modifier = Modifier.requiredSize(250.dp).padding(8.dp)
            )
            Text("Nota: 8.9/10")
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication,
            title = "IMDB") {
        App()
    }
}
