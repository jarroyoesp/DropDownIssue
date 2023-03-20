package com.jarroyo.dropdownissue.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jarroyo.dropdownissue.ui.screens.DropDownIssueScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.DropDownIssue.route,
        builder = {
            addComposableDestinations()
        }
    )
}

fun NavGraphBuilder.addComposableDestinations() {
    val destination = Screens.DropDownIssue.route
    composable(destination) { DropDownIssueScreen() }
}