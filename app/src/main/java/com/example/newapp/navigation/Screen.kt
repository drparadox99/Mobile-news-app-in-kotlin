package com.example.newapp.navigation

// import androidx.compose.material.Icon

import com.example.newapp.R

sealed class Screens(val route: String, val title: String = "", val resource: Int = 0) {
  object HomeScreen : Screens(route = "home_view", title = "Home", resource = R.drawable.home)
  // object ArticleView : Screens(route= "article_view/{articleIndex}")
  object ArticleScreen : Screens(route = "article_view?articleIndex={articleIndex}")
  object SettingsScreen :
      Screens(route = "Outlets", title = "Outlets", resource = R.drawable.settings)
  object BookmarkScreen :
      Screens(route = "Favorites", title = "Favorites", resource = R.drawable.bookmark)
}
