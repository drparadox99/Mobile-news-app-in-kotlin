package com.example.newapp.view.screens

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.newapp.model.Article
import com.example.newapp.view.bottomNavigation.FloatingButton
import com.example.newapp.viewModel.NewsViewModel

// Display selected/clicjked article via a web view
@Composable
fun ArticleWebView(newsViewModel: NewsViewModel, articleIndex: Article) {
  // Get url of the selected/clicked article to display via a webview
  // val urlArticle = newsViewModel._newsListResponse.value?.get(articleIndex)?.url!!
  val urlArticle = articleIndex.url!!
  Box(modifier = Modifier.fillMaxSize()) {
    AndroidView(
        factory = {
          WebView(it).apply {
            layoutParams =
                ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            webViewClient = WebViewClient()
            loadUrl(urlArticle)
          }
        },
        update = { it.loadUrl(urlArticle) })
    Box(modifier = Modifier.align(Alignment.BottomEnd).padding(bottom = 70.dp, end = 20.dp)) {
      FloatingButton(newsViewModel, articleIndex)
    }
  }
}
