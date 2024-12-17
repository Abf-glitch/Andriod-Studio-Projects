package com.example.android2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android2.ui.theme.screens.client.AddClientScreen
import com.example.android2.ui.theme.screens.client.ViewClients
import com.example.android2.ui.theme.screens.dashboard.DashBoard
import com.example.empty.navigation.ROUTE_ADD_CLIENT
import com.example.empty.navigation.ROUTE_HOME
import com.example.empty.navigation.ROUTE_LOGIN
import com.example.empty.navigation.ROUTE_REGISTER
import com.example.empty.navigation.ROUTE_SPLASH
import com.example.empty.navigation.ROUTE_UPDATE_CLIENT
import com.example.empty.navigation.ROUTE_VIEW_CLIENTS
import com.example.empty.ui.theme.screen.SplashScreen
import com.example.empty.ui.theme.screen.client.UpdatedClientScreen
import com.example.empty.ui.theme.screen.signup.SignupScreen
import com.example.myapp.ui.theme.screen.login.LoginScreen

@Composable
fun AppNavHost(
    navController:NavHostController = rememberNavController(),
    startDestination:String = ROUTE_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination) {
        composable(ROUTE_HOME){ SplashScreen {
            navController.navigate(ROUTE_REGISTER){
                popUpTo(ROUTE_SPLASH){inclusive = true}
            }
        } }
        composable(ROUTE_REGISTER) { SignupScreen(navController) }
        composable(ROUTE_LOGIN) { LoginScreen(navController) }
        composable(ROUTE_HOME) { DashBoard(navController) }
        composable(ROUTE_ADD_CLIENT) { AddClientScreen(navController) }
        composable(ROUTE_VIEW_CLIENTS) { ViewClients(navController) }
        composable("$ROUTE_UPDATE_CLIENT/{id}"){
            passedData -> UpdatedClientScreen(
            navController
        )
        }
    }
}

