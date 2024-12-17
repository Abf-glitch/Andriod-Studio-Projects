package com.example.android2.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.empty.R
import com.example.myandroidapplication.data.AuthViewModel
import com.google.firebase.auth.FirebaseAuth

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoard(navController: NavHostController) {

    val user = FirebaseAuth.getInstance().currentUser
    val username = user?.displayName ?: "UnKnown"

    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "DashBoard Background",
            contentScale = ContentScale.FillBounds)
    }
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        TopAppBar(
            title = { Text(text = "User:$username") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.Home, contentDescription = "Home")
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.LightGray,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.Black
            ),
            actions = {
                IconButton(onClick = {TODO()}) {
                    Icon(imageVector = Icons.Filled.Person, contentDescription = "My Profile")
                }
                IconButton(onClick = {TODO()}) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "Search Here")
                }
                IconButton(onClick = {TODO()}) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                }
                IconButton(onClick = {
                    val authRepository = AuthViewModel()
                    authRepository.logout(navController, context)
                }) { }
                IconButton(onClick = {TODO()}) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "logout")
                }
            })
        Row (modifier = Modifier.wrapContentWidth()) {
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(65.dp)){
                    Image(painter = painterResource(id = R.drawable.logo), contentDescription = "New Client")
                    Box(modifier = Modifier.matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.BottomCenter){
                        Text(color = Color.DarkGray,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "New Client")
                    }
                }
            }

            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(65.dp)){
                    Image(painter = painterResource(id = R.drawable.growloanlimit), contentDescription = "Grow Loan")
                    Box(modifier = Modifier.matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.BottomCenter){
                        Text(color = Color.Yellow,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "Grow Loan")
                    }
                }
            }

            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(65.dp)){
                    Image(painter = painterResource(id = R.drawable.sendmoney), contentDescription = "Send")
                    Box(modifier = Modifier.matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.BottomCenter){
                        Text(color = Color.White,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "Send Money")
                    }
                }
            }
        }

        Row (modifier = Modifier.wrapContentWidth()) {
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(65.dp)){
                    Image(painter = painterResource(id = R.drawable.request), contentDescription = "Request")
                    Box(modifier = Modifier.matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.BottomCenter){
                        Text(color = Color.White,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "Request Money")
                    }
                }
            }

            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(65.dp)){
                    Image(painter = painterResource(id = R.drawable.withdraw), contentDescription = "Withdraw")
                    Box(modifier = Modifier.matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.BottomCenter){
                        Text(color = Color.White,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "Withdraw Cash")
                    }
                }
            }

            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(65.dp)){
                    Image(painter = painterResource(id = R.drawable.atmcard), contentDescription = "My Card")
                    Box(modifier = Modifier.matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.BottomCenter){
                        Text(color = Color.White,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "My Card")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashBoardPreview(){
    DashBoard(rememberNavController())
}