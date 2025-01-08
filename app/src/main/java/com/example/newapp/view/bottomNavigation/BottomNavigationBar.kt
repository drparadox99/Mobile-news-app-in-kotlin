package com.example.newapp.view.bottomNavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.newapp.navigation.Screens

// Composable returns BottomNavigation composable
@Composable
fun BottomNavigationBar(navController: NavHostController) {
  val screens =
      listOf(
          Screens.HomeScreen,
          Screens.SettingsScreen,
          Screens.BookmarkScreen
      )
  // Get current navigation backstack
  val navBackStackEntry by navController.currentBackStackEntryAsState()
  // Get the destination that is currently visible to the users
  val currentDestination = navBackStackEntry?.destination
  // Create composable of the Bottom Navigation
  BottomNavigation(backgroundColor = Color.White) {
    screens.forEach { screen ->
      // create a composable for each item of the Bottom navigation
      AddItem(
          screen = screen, currentDestination = currentDestination, navController = navController)
    }
  }
}

// Composable for each item in the bottom navigation
@Composable
fun RowScope.AddItem(
    screen: Screens,
    currentDestination: NavDestination?,
    navController: NavController
) {
  BottomNavigationItem(
      label = {
        Text(
            text = screen.title,
            style = MaterialTheme.typography.button,
        )
      },
      icon = {
        // Icon(imageVector = screen.icon, contentDescription = "Navigation Icon", tint =
        // Color.White)
        Image(painterResource(screen.resource), contentDescription = screen.title)
      },
      selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
      // decrease the visibility of unselected items of the navigation bar
      selectedContentColor = Color.Black,
      unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
      onClick = {
        // When this icon is clicked navigate to the associated screen
        navController.navigate(screen.route) {
          // return to start destination when the return button is clicked, instead of the previous
          // get the start destination et navigate to it
          popUpTo(navController.graph.findStartDestination().id)
          // remove unnecessary copies of the same destination
          launchSingleTop = true
        }
      })
}
