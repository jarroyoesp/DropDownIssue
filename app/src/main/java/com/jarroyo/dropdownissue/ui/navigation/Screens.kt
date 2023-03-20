package com.jarroyo.dropdownissue.ui.navigation

sealed class Screens(val route: String) {
    object DropDownIssue: Screens("DropDownIssue")
}