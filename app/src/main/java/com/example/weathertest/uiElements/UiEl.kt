package com.example.weathertest.uiElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weathertest.R

class UiEl {

    @Composable
    fun googl() {
        Surface(shape = CircleShape, modifier = Modifier.padding(5.dp), elevation = 5.dp) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = ""
            )

        }
    }

}