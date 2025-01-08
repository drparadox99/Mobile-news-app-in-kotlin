package com.example.newapp.view.screens

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.newapp.utils.OutletSealedClass
import com.example.newapp.utils.the_outlets
import com.example.newapp.viewModel.NewsViewModel

@Composable
fun Outlets(newsViewModel: NewsViewModel) {
  Card(
      Modifier.fillMaxSize(),
      shape = RoundedCornerShape(8.dp),
      backgroundColor = Color(0xFFF8fbf8),
      elevation = 4.dp) {
    Column() {
      OutletStrip(newsViewModel)
      Divider(
          color = Color.Gray,
          thickness = 2.dp,
          modifier = Modifier.fillMaxWidth().padding(0.dp, 0.dp, 0.dp, 7.dp))
      Spacer(modifier = Modifier.height(20.dp))
      OutletView(newsViewModel, newsViewModel.outletSelected.value)
    }
  }
}

@Composable
fun OutletStrip(newsViewModel: NewsViewModel) {
  Card(
      modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min).padding(0.dp, 2.dp, 0.dp, 2.dp),
      backgroundColor = Color(0xFFF8fbf8),
      shape = RoundedCornerShape(8.dp),
      elevation = 0.dp) {
    Column(
        modifier = Modifier.fillMaxSize(),
        // verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
      Text(
          modifier = Modifier,
          text = "Outlets",
          style = MaterialTheme.typography.h2,
          maxLines = 2,
          fontWeight = FontWeight.Bold,
          color = Color.Black)

      Divider(
          color = Color.Gray,
          thickness = 2.dp,
          modifier = Modifier.fillMaxWidth(0.4f).padding(0.dp, 0.dp, 0.dp, 7.dp))

      Spacer(modifier = Modifier.height(15.dp))
      Divider(
          color = Color.Gray,
          thickness = 2.dp,
          modifier = Modifier.fillMaxWidth().padding(0.dp, 0.dp, 0.dp, 7.dp))
      Row(
          horizontalArrangement = Arrangement.SpaceBetween,
          modifier =
              Modifier.fillMaxWidth().wrapContentHeight().horizontalScroll(rememberScrollState())) {
        the_outlets.forEach { OutletLogo(it, newsViewModel) }
      }
    }
  }
}

@Composable
fun OutletLogo(outlet: OutletSealedClass, newsViewModel: NewsViewModel) {
  Column(
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier.width(70.dp).wrapContentHeight().padding(2.dp, 0.dp, 0.dp, 0.dp)) {
    Image(
        painterResource(outlet.resource),
        contentDescription = outlet.title,
        contentScale = ContentScale.Crop,
        modifier =
            Modifier.size(33.dp)
                .clip(CircleShape)
                .border(
                    2.dp,
                    if (newsViewModel.outletSelected.value.title.equals(outlet.title, false))
                        Color.White
                    else Color.Black,
                    CircleShape)
                .clickable { newsViewModel.outletSelected.value = outlet })

    Text(
        modifier = Modifier.align(CenterHorizontally).height(20.dp) /*.clickable {
            newsViewModel.country = "fr"
            composableScope.launch { newsViewModel.getNewsByCategory("") }
        }*/,

        style = TextStyle(textDecoration =  if (newsViewModel.outletSelected.value.title.equals(outlet.title, false)) TextDecoration.None else TextDecoration.Underline),
        text = outlet.title,
        fontSize = 9.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black)
  }
}

@Composable
fun OutletView(
    newsViewModel: NewsViewModel,
    outlet: OutletSealedClass,
    // url: String = "https://www.theguardian.com/international"
    ) {
  // Get url of the selected/clicked article to display via a webview
  // val urlArticle = newsViewModel._newsListResponse.value?.get(articleIndex)?.url!!
  Card(modifier = Modifier.fillMaxSize(), shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp), elevation = 4.dp) {
    AndroidView(
        factory = {
          WebView(it).apply {
            layoutParams =
                ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            webViewClient = WebViewClient()
            loadUrl(outlet.url)
          }
        },
        update = { it.loadUrl(outlet.url) })
  }
}
