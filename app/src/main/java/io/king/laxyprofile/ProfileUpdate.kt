package io.king.laxyprofile

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProfileUpdate : ComponentActivity() {

    private val dataSet: Data by lazy {
        intent?.getSerializableExtra(DATA_ID) as Data
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(data = dataSet)
        }
    }

    companion object{
        private const val DATA_ID = "data_id"
        fun newIntent(context: Context, data: Data) =
            Intent(context, ProfileUpdate::class.java).apply {
                putExtra(DATA_ID, data)
            }
    }
}