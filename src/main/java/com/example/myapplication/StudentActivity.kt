package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class StudentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Student()

        }
    }
}

@Composable
fun Student(){
    Column {
        Box {
            Image(painterResource(id = R.drawable.mailbox),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Text("Name : Amara Malli")
            Spacer(modifier = Modifier.height(10.dp))

            Text("Age : 7")
            Spacer(modifier = Modifier.height(10.dp))

            Text("Gender : Female")
            Spacer(modifier = Modifier.height(10.dp))

            Text("Class : Grade 2")
            Spacer(modifier = Modifier.height(10.dp))

            Text("Class Teacher : Peninah Njoroge")
            Spacer(modifier = Modifier.height(10.dp))

            Text("Co-cirricular Activities : French, Swimming")
            Spacer(modifier = Modifier.height(10.dp))

            Text("Clubs Attending : Debate & Chess")
            Spacer(modifier = Modifier.height(10.dp))

            Text("Games Attending : Football & Basketball")
            Spacer(modifier = Modifier.height(10.dp))

        }
    }
}


@Preview(showBackground = true)
@Composable
fun StudentPreview(){
    Student()
}
