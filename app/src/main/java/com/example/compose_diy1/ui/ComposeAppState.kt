package com.example.compose_diy1.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun rememberComposeAppState(
    navController: NavHostController = rememberNavController()
): ComposeAppState{

    return remember(
        navController
    ){
        ComposeAppState(
            navController = navController
        )
    }
}

class ComposeAppState(
    val navController: NavController
){

}