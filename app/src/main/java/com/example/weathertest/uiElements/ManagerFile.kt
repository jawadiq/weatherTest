package com.example.weathertest.uiElements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.weathertest.R


@Composable
    fun ManagerVieww() {
        Surface(
            modifier = Modifier
                .height(200.dp)
                .padding(70.dp, .0.dp, 70.dp),
            shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp)
            , border = BorderStroke(2.dp, Color(0xFF7BC6D8)), elevation = 5.dp,
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.jawad),
                    contentDescription = "",
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp),
                )
Text(text = stringResource(id = R.string.manager_avatar), textAlign = TextAlign.End)

            }

        }

    }

//    @Preview(showBackground = true)
//    @Composable
//    fun myPreviewd() {
//        ManagerVieww(navController = NavController)
//    }

    @Composable
    fun managerDetail(modifier: Modifier = Modifier) {
        Surface() {
        }

    }

