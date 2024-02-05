package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                GreetingPreview()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
 ConstraintLayout(modifier = Modifier.fillMaxSize()) {
    val (text,button,image) = createRefs()

        Button(onClick = {}, Modifier.constrainAs(button){
            bottom.linkTo(parent.bottom, 16.dp)
            end.linkTo(parent.end,16.dp)
        }) {
            Text(text = "Click me")
        }
 }
}