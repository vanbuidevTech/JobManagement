package com.example.jobmanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobmanagement.ui.theme.JobManagementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JobManagementTheme {
                // A surface container using the 'background' color from the theme
                Surface {

                    Common()
                }
            }
        }

    }
}

@Composable
fun Common() {
    GreetingImage(
        h1 = "All tasks completed",
        h2 = "Nice work!",
        imgPainter = painterResource(id = R.drawable.ic_task_completed),
    )
}

@Composable
fun GreetingText(h1: String, h2: String, modifier: Modifier = Modifier) {

    Text(
        text = h1,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(top = 24.dp, bottom = 8.dp)
    )
    Text(
        text = h2,
        fontSize = 16.sp,
        modifier = modifier
    )
}

@Composable
fun GreetingImage(h1: String, h2: String, imgPainter: Painter, modifier: Modifier = Modifier) {
    val imgPainter = painterResource(id = R.drawable.ic_task_completed)

    Column(
        modifier = Modifier.fillMaxSize(),// Thành phần Column chiếm toàn bộ kích thước của vùng chứa
        horizontalAlignment = Alignment.CenterHorizontally, // Căn giữa theo chiều ngang
        verticalArrangement = Arrangement.Center // Căn giữa theo chiều dọc
    ) {
        Image(
            painter = imgPainter, contentDescription = null, modifier = modifier
        )
        GreetingText(h1, h2, modifier)
    }
}

@Preview
@Composable
fun showPre() {
    Common()
}