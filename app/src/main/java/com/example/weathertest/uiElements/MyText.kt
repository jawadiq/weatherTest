package com.example.weathertest.uiElements


import android.graphics.Typeface
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.weathertest.navigation.Screenenums


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ConsultantCard(navController: NavController) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .padding(5.dp),
        elevation = 20.dp,
        backgroundColor = Color(0xFFF5F9FC),
        shape = RoundedCornerShape(80.dp, 15.dp, 15.dp, 80.dp),
        border = BorderStroke(1.dp, color = Color(0xFFD1DBEC)),
        onClick = {navController.navigate(route = Screenenums.MyScreens.DetailsScreen.name)}) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(), verticalAlignment = Alignment.Top
        ) {
            TeamMemerAvatar()
            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(1.dp), color = Color(0xFFAAC7F5)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Text(text = "This is some dummy text head", modifier = Modifier.padding(2.dp), textAlign = TextAlign.End,
                   fontFamily = FontFamily.Monospace )
                Divider(thickness = 1.dp, color = Color(0xFFAAC7F5))
                Text(
                    text = "This is some dummy text descritiopn",
                    modifier = Modifier.padding(2.dp)
                )
                Divider(thickness = 1.dp, color =  Color(0xFFAAC7F5))
                Row(modifier = Modifier.wrapContentSize()) {
                    Text(text = "Status", modifier = Modifier.padding(2.dp))
                    Divider(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(1.dp), color = Color(0xFFAAC7F5)
                    )
                    Text(text = "This", modifier = Modifier.padding(2.dp))
                }


            }


        }

    }


}


//@Preview(showBackground = true)
//@Composable
//fun myPreview() {
//    ConsultantCard(navController = NavController)
//
//}