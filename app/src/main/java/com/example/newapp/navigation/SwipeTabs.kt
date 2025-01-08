package com.example.newapp.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
//import com.example.newapp.utils.Constants.Companion.newsCategoriesIcons
import com.example.newapp.viewModel.NewsViewModel
import kotlinx.coroutines.launch

// Tabs with swipe (experimental)
@Composable
fun SwipeTabs(newsViewModel: NewsViewModel, articlesViewComposable: @Composable () -> Unit) {
  var tabIndex by remember { mutableStateOf(0) } // State of the tabIndex
  val composableScope = rememberCoroutineScope()
  Column {
    TabRow(
        selectedTabIndex = tabIndex,

    ) {
        /*
      newsCategories.forEachIndexed { index, title ->
        Tab(
            modifier = Modifier.background(Color.Black),
            selected = tabIndex == index,
            onClick = {
              tabIndex = index
              composableScope.launch { newsViewModel.getNewsByCategory(title) }
            },
            icon = { Image(painter = painterResource(newsCategoriesIcons[index]), title) })
      }*/
        
    }
    articlesViewComposable()
  }
}
