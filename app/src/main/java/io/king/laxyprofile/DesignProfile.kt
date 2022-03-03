package io.king.laxyprofile

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Greeting(data: Data) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = if (isSystemInDarkTheme()) {
                    Color.Black
                } else Color.White
            )
            .padding(10.dp).verticalScroll(scrollState)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = data.profPic), contentScale = ContentScale.Crop, contentDescription = null, modifier = Modifier
                .size(200.dp)
                .clip(
                    CircleShape
                )
                .border(
                    color = if (isSystemInDarkTheme()) {
                        Color.LightGray
                    } else {
                        Color.DarkGray
                    }, width = 6.dp
                )
            )
        }
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            text = data.name, fontWeight = FontWeight.ExtraBold, fontSize = 26.sp,
            color = if (isSystemInDarkTheme()) {
                Color.White} else Color.Black,
            textAlign = TextAlign.Center
        )
        Text(
            text = data.message, textAlign = TextAlign.Justify, fontSize = 19.sp, maxLines = 5, modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .padding(horizontal = 5.dp), color = if (isSystemInDarkTheme()) {
                Color.White} else Color.Black)
        Image(modifier = Modifier
            .fillMaxWidth(),painter = painterResource(id = data.pictures), contentDescription = null, contentScale = ContentScale.FillWidth)
    }
}
