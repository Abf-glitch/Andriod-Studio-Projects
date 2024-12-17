package com.example.empty.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import com.example.empty.R

@Composable
fun SplashScreen(onNavigateToNext: () -> Unit){

    val splashScreenDuration = 3000L
    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        onNavigateToNext()
    }
    Box (modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.Center){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(R.drawable.logo), contentDescription = "App logo", modifier = Modifier.size(128.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Welcome to Equity App")
        }
    }
}