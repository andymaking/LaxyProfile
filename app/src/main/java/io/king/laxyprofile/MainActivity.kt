package io.king.laxyprofile

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import io.king.laxyprofile.ui.theme.LaxyProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaxyProfileTheme {
                Redo{
                    startActivity(ProfileUpdate.newIntent(this,it))
                }
            }
        }
    }
}

@Composable
fun Redo(navigateToProfile: (Data) -> Unit) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(
                if (isSystemInDarkTheme()) {
                    Color.DarkGray
                } else {
                    Color.LightGray
                }
            ),
        content = {
            Post(navigateToProfile = navigateToProfile)
        }
    )

}