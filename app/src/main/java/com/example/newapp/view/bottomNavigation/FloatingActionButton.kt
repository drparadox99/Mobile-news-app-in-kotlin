package com.example.newapp.view.bottomNavigation

import androidx.compose.animation.core.Transition
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.newapp.R
import com.example.newapp.model.Article
import com.example.newapp.utils.Constants
import com.example.newapp.viewModel.NewsViewModel

// FAB custom color

@Composable
fun FloatingButton(newsViewModel: NewsViewModel, article: Article) {
  // add article to favorites
  // val article: Article? = newsViewModel._newsListResponse.value?.get(articleIndex)
  // State of the floating button
  var toState by remember { mutableStateOf(Constants.Companion.MultiFabState.COLLAPSED) }
  // transition state
  val transition: Transition<Constants.Companion.MultiFabState> =
      updateTransition(targetState = toState)
  // define rotation logic
  val rotation: Float by
      transition.animateFloat { state ->
        if (state == Constants.Companion.MultiFabState.EXPANDED) 45f else 0f
      }
  FloatButton(toState, transition, rotation, article, newsViewModel) { state -> toState = state }
}

@Composable
fun FloatButton(
    toState: Constants.Companion.MultiFabState,
    transition: Transition<Constants.Companion.MultiFabState>,
    rotation: Float,
    article: Article?,
    newsViewModel: NewsViewModel,
    stateChanged: (fabstate: Constants.Companion.MultiFabState) -> Unit
) {
  Column() {
    if (toState == Constants.Companion.MultiFabState.EXPANDED) {
      MiniFloatingActionButton(
          newsViewModel, R.drawable.delete_all, { newsViewModel.deleteAllArticles() })
      Spacer(modifier = Modifier.height(20.dp))
      MiniFloatingActionButton(
          newsViewModel, R.drawable.delete, { newsViewModel.deleteArticle(article!!) })
      Spacer(modifier = Modifier.height(20.dp))
      MiniFloatingActionButton(
          newsViewModel, R.drawable.save, { newsViewModel.saveArticle(article!!) })
      Spacer(modifier = Modifier.height(20.dp))
    }

    FloatingActionButton(
        backgroundColor = Color.White,
        contentColor = Color.Black,
        onClick = {
          stateChanged(
              if (transition.currentState == Constants.Companion.MultiFabState.EXPANDED) {
                Constants.Companion.MultiFabState.COLLAPSED
              } else Constants.Companion.MultiFabState.EXPANDED)
        }) {
      Image(
          painterResource(R.drawable.menu),
          contentDescription = "",
          modifier = Modifier.rotate(rotation))
      /*
      Icon(
        painter = painterResource(id = R.drawable.ic_baseline_apps_24),
        modifier = Modifier.rotate(rotation),
        contentDescription = null,
        // tint = MaterialTheme.colors.onSecondary
        ) */
    }
  }
}

@Composable
private fun MiniFloatingActionButton(
    newsViewModel: NewsViewModel,
    resource: Int,
    manageArticle: () -> Unit
) {
  FloatingActionButton(
      modifier = Modifier,
      backgroundColor = Color.White,
      contentColor = Color.White,
      onClick = { manageArticle() }) { Image(painterResource(resource), contentDescription = "") }
}
