package com.example.newapp.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateListOf
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.example.newapp.model.Article
import com.example.newapp.view.screens.*
import com.example.newapp.viewModel.NewsViewModel
import com.google.gson.Gson

@Composable
fun setUpNavGraphHost(navController: NavHostController, newsViewModel: NewsViewModel) {
  // call a nav host
  // NavHost is a navGraphBuilder
  NavHost(
      navController = navController,
      startDestination = Screens.HomeScreen.route,
  ) {
    // Home View/Screen
    composable(route = Screens.HomeScreen.route) { HomeView(navController, newsViewModel) }
    // ArticleView View/screen
    composable(
        route = Screens.ArticleScreen.route,
        // arguments = listOf(navArgument("articleIndex") { type =
        // NavType.ParcelableType(Article::class.java ) })) {
        // arguments = listOf(navArgument("articleIndex") { type = NavType.IntType })) {
        arguments = listOf(navArgument("articleIndex") { type = NavType.StringType })) {
      // newsViewModel._newsListResponse.value?.get(it.arguments?.getInt("articleIndex")!!)?.url
      // get index of article selected
      val article =
          it.arguments?.getString("articleIndex")?.let { json ->
            val article = Gson().fromJson(json, Article::class.java)
              ArticleWebView(newsViewModel, article)
          }
      // val article =  it.arguments?.getParcelable<Article>("articleIndex")
      // ArticleView(newsViewModel, articleIndex = it.arguments?.getInt("articleIndex")!! )
      // ArticleView(newsViewModel, articleIndex = it.arguments?.getString("articleIndex")!! )
    }
    composable(route = Screens.BookmarkScreen.route) {
      // val articles: List<Article>? = newsViewModel.getSavedArticles()
         Log.d("Ici", "dans le nav host ")
      val articles = newsViewModel.savedNewsList.observeAsState(listOf()).value
      newsViewModel.getSavedArticles()
      BookmarkedArticles(articles, navController, newsViewModel)
    }
      composable(route = Screens.SettingsScreen.route) { Outlets(newsViewModel) }
  }
}
