package com.bronyst.compose_starter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bronyst.compose_starter.ui.theme.Compose_starterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_starterTheme {
//                var count by remember {
//                    mutableStateOf(0)
//                }
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier.fillMaxSize()
//                ) {
//                    Text(text = count.toString())
//                    Button(onClick = {
//                        count++
//                    }) {
//                        Text(text = "Click me")
//                    }
//                }
                var name by remember {
                    mutableStateOf("")
                }

                var namesList by remember {
                    mutableStateOf(listOf<String>())
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        OutlinedTextField(value = name, onValueChange = {text -> name = text}, modifier = Modifier.weight(1f).border(1.dp, Color.Blue) )
                        Spacer(modifier = Modifier.size(16.dp))
                        Button(onClick = {
                            if(name.isNotBlank()){
                                namesList = namesList + name
                                name = ""
                            }
                        }) {
                            Text(text = "Add")
                        }
                    }

//                    list of names added
                    LazyColumn(
                        modifier = Modifier.fillMaxSize()
                    ){
                        items(namesList){ currentName ->
                            Text(
                                text = currentName,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .fillMaxWidth()
                            )

                            Divider(modifier = Modifier.background(Color.Blue))
                        }
                    }
                }


            }
        }
    }
}



//@Composable
//fun Greeting(name: String) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 30.sp,
//        )
//        Text(
//            text = "Some other text",
//            color = Color.Red,
//            fontSize = 30.sp,
//        )
//        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null, modifier = Modifier.background(Color.Black)  )
//        for (i in 1..50){
//            Icon(imageVector = Icons.Default.AccountBox, contentDescription = null, modifier = Modifier.padding(8.dp) )
//        }
//    }
//    Column(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        LazyRow(
//            modifier = Modifier.fillMaxWidth().background(Color.Blue)
//        ){
//            items(20){ it ->
//                Icon(imageVector = Icons.Default.Add, contentDescription = null, modifier = Modifier
//                    .padding(8.dp)
//                    .size(100.dp) )
//            }
//        }
//
//        LazyColumn(
//            modifier = Modifier.fillMaxSize().background(Color.Green)
//        ){
//            items(50){
//                Icon(imageVector = Icons.Default.AccountBox, contentDescription = null, modifier = Modifier
//                    .padding(8.dp)
//                    .size(100.dp) )
//            }
//        }
//    }
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    Compose_starterTheme {
//        Greeting("Android")
//    }
//}