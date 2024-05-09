package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer as ModifierLocalScrollableContainerProvider

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Nav()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Nav() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
    ) {
        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }

        var age by remember {
            mutableStateOf(TextFieldValue(""))
        }

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }

        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }


        OutlinedTextField(value = name , onValueChange = {
            name = it
        }, label = {
            Text("Enter Name")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))

        ModifierLocalScrollableContainerProvider(modifier = Modifier.height(10.dp) )

        OutlinedTextField(value = age , onValueChange = {
            age = it
        }, label = {
            Text("Enter Age")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

        ModifierLocalScrollableContainerProvider(modifier = Modifier.height(10.dp) )

        OutlinedTextField(value = email , onValueChange = {
            email = it
        }, label = {
            Text("Email")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        ModifierLocalScrollableContainerProvider(modifier = Modifier.height(10.dp) )

        OutlinedTextField(value = password , onValueChange = {
            password = it
        }, label = {
            Text("Enter Password")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))

        ModifierLocalScrollableContainerProvider(modifier = Modifier.height(10.dp) )

        OutlinedTextField(value = password , onValueChange = {
            password = it
        }, label = {
            Text("Confirm Password")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))

        ModifierLocalScrollableContainerProvider(modifier = Modifier.height(10.dp) )

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            border = BorderStroke(1.dp, Color.Blue),
            shape = RectangleShape,
        ) {
            Text("Register",
                color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NavPreview() {
    Nav()

    }