package io.king.laxyprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun Active(data: Data, navigateToProfile: (Data) -> Unit) {
    Column(modifier = Modifier
        .fillMaxWidth().clickable { navigateToProfile(data) }
        .background(
            if (isSystemInDarkTheme()) {
            Color.Black
            } else {
                Color.White
            })
        .padding(vertical = 5.dp)) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 5.dp)
        ) {
            Image(
                painter = painterResource(id = data.profPic),
                contentDescription = null,
                modifier = Modifier
                    .padding(vertical = 5.dp, horizontal = 0.dp)
                    .size(50.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillBounds
            )
            Column(verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.Start, modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 5.dp)
                .padding(horizontal = 10.dp)) {
                Text(
                    text = data.name, fontWeight = FontWeight.ExtraBold, fontSize = 22.sp,
                    color = if (isSystemInDarkTheme()) {Color.White} else Color.Black,
                )
                Row(horizontalArrangement = Arrangement.Start) {
                    Text(text = data.times, color = if (isSystemInDarkTheme()) {Color.White} else Color.Black
                    )
                    Icon(painter = painterResource(id = R.drawable.globe), tint = Color.DarkGray, contentDescription = null, modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .size(15.dp))
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth(), verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.End) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painter = painterResource(id = R.drawable.more), contentDescription = null, modifier = Modifier.size(30.dp), tint = Color.DarkGray)
                }
            }
        }
        Text(text = data.message, fontSize = 18.sp, maxLines = 5, modifier = Modifier
            .padding(vertical = 10.dp)
            .padding(horizontal = 5.dp), color = if (isSystemInDarkTheme()) {Color.White} else Color.Black)
        Image(modifier = Modifier
            .fillMaxWidth(),painter = painterResource(id = data.pictures), contentDescription = null, contentScale = ContentScale.FillWidth)
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 5.dp, vertical = 5.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "${data.comments} Comments", color = if (isSystemInDarkTheme()) {Color.LightGray} else Color.DarkGray, modifier = Modifier.fillMaxWidth(.5f), textAlign = TextAlign.Left)
            Text(text = "${data.views} Views", color = if (isSystemInDarkTheme()) {Color.LightGray} else Color.DarkGray, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Right)
        }
        Divider()
        Row(modifier = Modifier.height(30.dp),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
            Row(modifier = Modifier.weight(1f).fillMaxHeight().clickable {  /*TODO*/  }, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                Icon(modifier = Modifier.size(18.dp), painter = painterResource(id = R.drawable.like), contentDescription = null, tint = Color.Gray)
                Text(text = " Like", color = if (isSystemInDarkTheme()) {Color.LightGray} else Color.DarkGray)
            }
            Row(modifier = Modifier.weight(1f).fillMaxHeight().clickable {  /*TODO*/  }, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                Icon(modifier = Modifier.size(18.dp), painter = painterResource(id = R.drawable.comment), contentDescription = null, tint = Color.Gray)
                Text(text = " Comment", color = if (isSystemInDarkTheme()) {Color.LightGray} else Color.DarkGray)
            }
            Row(modifier = Modifier.weight(1f).fillMaxHeight().clickable {  /*TODO*/  }, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Icon(modifier = Modifier.size(18.dp), painter = painterResource(id = R.drawable.arrow), contentDescription = null, tint = Color.Gray)
                Text(text = " Share", color = if (isSystemInDarkTheme()) {Color.LightGray} else Color.DarkGray)
            }
        }
    }
}