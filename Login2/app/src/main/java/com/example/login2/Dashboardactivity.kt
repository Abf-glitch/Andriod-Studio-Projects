package com.example.login2

import android.view.Menu
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.LoginTheme

class Dashboardactivity : androidx.activity.ComponentActivity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            com.example.login.ui.theme.LoginTheme {
                Dashboard()
            }
        }
    }
}

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@androidx.compose.runtime.Composable
fun Dashboard() {
    androidx.compose.foundation.layout.Box() {
        androidx.compose.foundation.Image(
            painter = androidx.compose.ui.res.painterResource(id = com.example.login.R.drawable.background),
            contentDescription = "dashboard background",
            contentScale = androidx.compose.ui.layout.ContentScale.FillBounds
        )
    }
    androidx.compose.foundation.layout.Column(
        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        androidx.compose.material3.TopAppBar(
            title = { androidx.compose.material3.Text(text = "Equity Bank") },
            navigationIcon = {
                androidx.compose.material3.IconButton(onClick = {}) {
                    androidx.compose.material3.Icon(
                        imageVector = androidx.compose.material.icons.Icons.Filled.Home,
                        contentDescription = "Home"
                    )
                }
            },
            colors = androidx.compose.material3.TopAppBarDefaults.topAppBarColors(
                containerColor = androidx.compose.ui.graphics.Color.Cyan,
                titleContentColor = androidx.compose.ui.graphics.Color.Blue,
                navigationIconContentColor = androidx.compose.ui.graphics.Color.Red
            ),
            actions = {
                androidx.compose.material3.IconButton(onClick = { kotlin.TODO() }) {
                    androidx.compose.material3.Icon(
                        imageVector = androidx.compose.material.icons.Icons.Filled.Search,
                        contentDescription = "Search Here"
                    )
                }
                androidx.compose.material3.IconButton(onClick = { kotlin.TODO() }) {
                    androidx.compose.material3.Icon(
                        imageVector = androidx.compose.material.icons.Icons.Filled.Person,
                        contentDescription = "My profile"
                    )
                }
                androidx.compose.material3.IconButton(onClick = { kotlin.TODO() }) {
                    androidx.compose.material3.Icon(
                        imageVector = androidx.compose.material.icons.Icons.Filled.Menu,
                        contentDescription = "Menu"
                    )
                }
            })
        androidx.compose.foundation.layout.Row() {
            androidx.compose.material3.Card(
                modifier = androidx.compose.ui.Modifier.padding(10.dp),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp),
                elevation = androidx.compose.material3.CardDefaults.cardElevation(10.dp)
            ) {
                androidx.compose.foundation.layout.Box() {
                    androidx.compose.foundation.Image(
                        painter = androidx.compose.ui.res.painterResource(id = com.example.login.R.drawable.bank),
                        contentDescription = "New Client"
                    )
                    androidx.compose.foundation.layout.Box(
                        modifier = androidx.compose.ui.Modifier.height(
                            70.dp
                        )
                    ) {
                        androidx.compose.material3.Text(
                            color = androidx.compose.ui.graphics.Color.Blue,
                            fontStyle = androidx.compose.ui.text.font.FontStyle.Normal,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "New Client"
                        )
                    }
                }
            }


        }

    }
}
@androidx.compose.ui.tooling.preview.Preview(showBackground = true, showSystemUi = true)
@androidx.compose.runtime.Composable
fun DashboardPreview() {
    Dashboard()
}