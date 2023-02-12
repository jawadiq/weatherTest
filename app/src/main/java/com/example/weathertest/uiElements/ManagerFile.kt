package com.example.weathertest.uiElements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.weathertest.R


@Composable
    fun ManagerVieww() {
        Surface(
            modifier = Modifier
                .wrapContentSize()
                .padding(5.dp),
            shape = RoundedCornerShape(80.dp, 50.dp, 15.dp, 80.dp)
            , border = BorderStroke(5.dp, Color(0xFF7BC6D8)), elevation = 20.dp
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()) {
                Image(
                    painter = painterResource(id = R.drawable.jawad),
                    contentDescription = "",
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp), Alignment.CenterStart
                )


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

