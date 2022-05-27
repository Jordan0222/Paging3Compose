package com.jordan.paging3compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jordan.paging3compose.presentation.home_screen.HomeScreen
import com.jordan.paging3compose.presentation.search_screen.SearchScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Search.route){
            SearchScreen(navController = navController)
        }
    }
}
