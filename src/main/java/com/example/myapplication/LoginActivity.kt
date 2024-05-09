package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class EveActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            leggo()

        }
    }
}






@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun leggo() {

//    val uu = AnnotatedString("yy")
//    val ii = LocalContext.current
//
//    ClickableText(text = uu, onClick = {
//
//        ii.startActivity(Intent(ii, EveActivity::class.java))

//    } )

    Column (
        Modifier
            .fillMaxSize()
            .padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }


        var age by remember {
            mutableStateOf(TextFieldValue(""))
        }
        
        Image(painter = painterResource(id = R.drawable.arrowicon), contentDescription = null)

        OutlinedTextField(value = name, onValueChange = {
            name = it
        }, label = {
            Text("Username")
        })

         Spacer(modifier = Modifier.height(10.dp) )

         OutlinedTextField(value = age , onValueChange = {
             age = it
         }, placeholder = {
             Text("Password")
         })

        Spacer(modifier = Modifier.height(10.dp) )

        Button(onClick = { /*TODO*/ }) {

            Text("Login")
        }

        val ii = LocalContext.current

        Text("No Account yet? Register Here", Modifier.clickable {
            ii.startActivity(Intent(ii, RegisterActivity::class.java))

        })







    }





}