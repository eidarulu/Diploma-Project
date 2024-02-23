package com.example.findme.navigation

import com.example.findme.R

data class NavItem(
    val label: String,
    val icon: Int,
    val route: String
)

val listOfNavItems: List<NavItem> = listOf(
    NavItem(label = "Home", icon = R.drawable.search, route = Screens.HomeScreen.toString()),
    NavItem(label = "Cam", icon = R.drawable.cam, route = Screens.CamScreen.toString()),
    NavItem(label = "Chat", icon =  R.drawable.chat, route = Screens.ChatScreen.toString()),
    NavItem(label = "Profile", icon = R.drawable.profile, route = Screens.ProfileScreen.toString())
)