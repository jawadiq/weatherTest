package com.example.weathertest.uiElements


import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ConsultantCard() {
    val myContext = LocalContext.current
    val goog = UiEl()
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .padding(5.dp), elevation = 80.dp , backgroundColor = Color.LightGray, shape = RoundedCornerShape( 10.dp,20.dp,5.dp,50.dp),
        border = BorderStroke(1.dp,Color.Gray), onClick = {Toast.makeText(myContext,"Details Page",Toast.LENGTH_LONG).show() } ) {
Row(modifier = Modifier
    .fillMaxWidth()
    .wrapContentHeight(), verticalAlignment = Alignment.Top) {
    goog.googl()
    Divider(modifier = Modifier
        .fillMaxHeight()
        .width(1.dp), color = Color.Gray)
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()) {
        Text(text = "This is some dummy text head" , modifier = Modifier.padding(2.dp))
        Divider(thickness = 1.dp, color = Color.Gray)
        Text(text = "This is some dummy text descritiopn" , modifier = Modifier.padding(2.dp))
        Divider(thickness = 1.dp, color = Color.Gray)
        Row(modifier = Modifier.wrapContentSize()) {
            Text(text = "Status" , modifier = Modifier.padding(2.dp))
            Divider(modifier = Modifier
                .fillMaxHeight()
                .width(1.dp), color = Color.Black)
            Text(text = "This" , modifier = Modifier.padding(2.dp))
        }


    }


}

     }


    }


@Preview(showBackground = true)
@Composable
fun myPreview() {
   ConsultantCard()

}