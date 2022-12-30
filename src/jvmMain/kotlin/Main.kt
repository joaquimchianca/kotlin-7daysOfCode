// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    //var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Pulp Fiction: Tempo de violência (1994)")
            Image(
                painter = painterResource("pulp-fiction.png"),
                contentDescription = "Pulp Fiction",
                modifier = Modifier.requiredSize(350.dp).padding(8.dp),

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