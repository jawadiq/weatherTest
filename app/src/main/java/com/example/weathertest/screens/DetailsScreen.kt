package com.example.weathertest.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp

@Composable
    fun DetailProfileScreen() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(5.dp),
            elevation = 20.dp,
            backgroundColor = Color(0xFFBCDAF3),
            shape = RoundedCornerShape(15.dp),
            border = BorderStroke(1.dp, color = Color(0xFF7FADF7)),
        ) {

            Column {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .height(72.dp)
                        .padding(start = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Miniatura
                    Box(
                        modifier = Modifier
                            .background(color = Color.LightGray, shape = CircleShape)
                            .size(40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                    Image(
                        painter = painterResource(com.example.weathertest.R.drawable.ic_launcher_foreground),
                        contentDescription = null
                    )
                    }

                    Spacer(modifier = Modifier.width(32.dp))

                    Column(Modifier.fillMaxWidth()) {
                        // Encabezado
                        Text(text = "Título", style = MaterialTheme.typography.h6)

                        // Subtítulo
                        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                            Text(text = "Texto secundario", style = MaterialTheme.typography.body1)
                        }
                    }
                }

//                 Multimedia
            Image(
                painter = painterResource(id = com.example.weathertest.R.drawable.jawad),
                contentDescription = "Multimedia de tarjeta",
                Modifier
                    .background(color = Color(0xFFBCDAF3))
                    .fillMaxWidth()
                    .height(194.dp).clip(CircleShape)
            )

                Row(Modifier.padding(start = 16.dp, end = 24.dp, top = 16.dp)) {

                    // Texto de ayuda
                    CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                        Text(
                            text = LoremIpsum(50).values.take(10).joinToString(separator = " "),
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                            style = MaterialTheme.typography.body2,
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {

                    Box(
                        Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        // Botones
                        Row(modifier = Modifier.align(Alignment.CenterStart)) {

                            TextButton(onClick = { /*TODO*/ }) {
                                Text(text = "ACCIÓN 1")
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            TextButton(onClick = { /*TODO*/ }) {
                                Text(text = "ACCIÓN 2")
                            }
                        }

                        // Iconos
                        Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Default.AccountBox, contentDescription = null)

                            }

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Default.AccountCircle, contentDescription = null)
                            }
                        }
                    }
                }
            }
        }
    }
@Preview
@Composable
fun MyPreview(){
   DetailProfileScreen()

}



