package io.king.laxyprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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