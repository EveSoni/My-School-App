package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class FeesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Fees()
        }
    }
}

@Composable
fun Fees(){
    Column {
        Row {
            Text("Below find attached Fees Structure and Uniform sets structure PDF." +
                    "Click to download",
                fontSize = 10.sp,
                color = Color.Black,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = RoundedCornerShape(3.dp)
        ) {
            Image(painterResource(id = R.drawable.pdf),
                contentDescription = null)
            Text("Fee Structure",
                fontSize = 10.sp,
                color = Color.Black,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FeesPreview(){
    Fees()
}