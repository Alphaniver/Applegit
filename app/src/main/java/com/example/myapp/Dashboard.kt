package com.example.myapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.MyAppTheme

class Dashboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen()

                }
            }
        }
    }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.pexel),
            contentDescription = "Image",
            contentScale = ContentScale.FillBounds
        )
    }
    Column() {
        TopAppBar(
            title = { Text(text = "Justice with Judy") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "home",
                        tint = Color.DarkGray
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Gray,
                titleContentColor = Color.DarkGray,
                navigationIconContentColor = Color.LightGray
            ),
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Person, contentDescription = "person")

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "search")

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu")

                }
            }

        )
        Row(modifier = Modifier.wrapContentWidth()) {
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.wave),
                        contentDescription = "Image",

                    )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "CASE STUDY")

                    }

                }







            }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.wave),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "LIVE SESSIONS" +
                                    "")

                    }

                }








            }

        }

        Row(modifier = Modifier.wrapContentWidth()) {
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.wave),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "LIVE SESSIONS" +
                                    "")

                    }

                }








            }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.wave),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "LIVE SESSIONS" +
                                    "")

                    }

                }








            }

        }

    }



}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    MyAppTheme {
        HomeScreen()
    }
}