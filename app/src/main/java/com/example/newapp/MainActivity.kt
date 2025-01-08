package com.example.newapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.newapp.navigation.setUpNavGraphHost
import com.example.newapp.ui.theme.NewAPPTheme
import com.example.newapp.view.bottomNavigation.BottomNavigationBar
import com.example.newapp.viewModel.NewsViewModel
import kotlinx.coroutines.runBlocking

// Do run threads on the main thread, change current coroutines configuration

class MainActivity : ComponentActivity() {

  // create an instance of the newsVeiwModel
  val newsViewModel by viewModels<NewsViewModel>()
  // OR create applicaiton contexte and usz it in the oncreate method
  // val newsViewModel: NewsViewModel = viewModel(factory =
  // NewsViewModelFactory(LocalContext.current.applicationContext as Application))*/

  // create an instance of the navController
  lateinit var navController: NavHostController

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      NewAPPTheme {
        // Execute once
        /*LaunchedEffect(key1 = true ){
          Log.d("Ici", "Lolita çs ")
        }*/

        /* repeat(2) {
              AnimatedShimmer()
        }*/

        // Get the nav controller
        navController = rememberNavController()
        Scaffold(
            bottomBar = { BottomNavigationBar(navController = navController) },
        ) {
          Box(modifier = Modifier.padding(it)) { // avoid the bottom nav bar overlapping
            setUpNavGraphHost(navController = navController, newsViewModel)
          }
        }
      }
    }
  }
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  //NewAPPTheme { Greeting("Android") }
  // HomeScreen()
  val articleEx =
      Article(
          author = "Loal",
          content = "Loal",
          description = "Loal",
          publishedAt = "Loal",
          source = null,
          title = "Loal",
          url = "https://cdni.rt.com/actualidad/public_images/2022.01/article/61f5221ee9ff7128bf3b7316.jpg",
          urlToImage = "https://cdni.rt.com/actualidad/public_images/2022.01/article/61f5221ee9ff7128bf3b7316.jpg")
  ArticleItem(article = articleEx)
}*/
