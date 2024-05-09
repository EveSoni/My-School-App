package com.example.myapplication

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.ui.platform.LocalContext


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Chester()

            Kwanza()

        }
    }
}

@Composable
fun Chester(){
    LazyColumn(){
        item{
            Column(modifier= Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                Box{
                    Image(painter = painterResource(id = R.drawable.schlogo),
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        contentDescription = null)
                    }
                }

            Spacer(modifier = Modifier.height(20.dp) )

            Row( modifier = Modifier.padding(start=10.dp, end=10.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.book_icon ) ,
                        contentDescription = null)

                    val aa = LocalContext.current
                    Text("School Info", Modifier.clickable {
                        aa.startActivity(Intent(aa, SchoolActivity::class.java))
                    })
                }

                Spacer(modifier = Modifier.width(20.dp))

                        Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.page_icon ) ,
                        contentDescription = null)

                            val bb = LocalContext.current
                            Text("Student Info", Modifier.clickable {
                                bb.startActivity(Intent(bb, StudentActivity::class.java))
                            })
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.academics ) ,
                        contentDescription = null)

                    val cc = LocalContext.current
                    Text("Academics", Modifier.clickable {
                        cc.startActivity(Intent(cc, RegisterActivity::class.java))
                    })
                }
            }

            Spacer(modifier = Modifier.height(5.dp) )

            Row( modifier = Modifier.padding(start=10.dp, end=10.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.attendance ) ,
                        contentDescription = null)

                    val dd = LocalContext.current
                    Text("Attendance", Modifier.clickable {
                        dd.startActivity(Intent(dd, RegisterActivity::class.java))
                    })
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.activity_icon ) ,
                        contentDescription = null)

                    val ee = LocalContext.current
                    Text("Activities", Modifier.clickable {
                        ee.startActivity(Intent(ee, RegisterActivity::class.java))
                    })
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.bus ) ,
                        contentDescription = null)

                    val ff = LocalContext.current
                    Text("transport", Modifier.clickable {
                        ff.startActivity(Intent(ff, RegisterActivity::class.java))
                    })
                }
            }

            Spacer(modifier = Modifier.height(5.dp) )

            Row( modifier = Modifier.padding(start=20.dp, end=20.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.fees_icon ) ,
                        contentDescription = null)

                    val gg = LocalContext.current
                    Text("Fees", Modifier.clickable {
                        gg.startActivity(Intent(gg, RegisterActivity::class.java))
                    })
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.shopping_icon ) ,
                        contentDescription = null)

                    val hh = LocalContext.current
                    Text("Shopping", Modifier.clickable {
                        hh.startActivity(Intent(hh, RegisterActivity::class.java))
                    })
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.records_icon ) ,
                        contentDescription = null)

                    val ii = LocalContext.current
                    Text("Records", Modifier.clickable {
                        ii.startActivity(Intent(ii, RegisterActivity::class.java))
                    })
                }
            }

        }
    }
}
@Composable
fun Kwanza() {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(horizontal = 15.dp, vertical = 10.dp)
                        .clip(MaterialTheme.shapes.large)
                ) {
                    Image(
                        painter = painterResource(R.drawable.bus),
                        contentDescription = "home_screen_bg",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Text(
                    "Home Screen",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(vertical = 20.dp)
                )
            }
        }

}


@Preview(showBackground = true)
@Composable
fun ChesterPreview(){
    Chester()
}
