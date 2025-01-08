package com.example.newapp.view.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.newapp.R
import com.example.newapp.view.Tab.*
import com.example.newapp.viewModel.NewsViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch



@Composable
fun LanguageSetting(newsViewModel: NewsViewModel) {

    val composableScope = rememberCoroutineScope()

    Card(
        modifier = Modifier.fillMaxWidth().height(150.dp).padding(0.dp, 10.dp, 0.dp, 40.dp),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(8.dp),
        elevation = 3.dp) {
        Column(
            modifier = Modifier.fillMaxSize(),
            // verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                modifier = Modifier,
                text = "Language",
                style = MaterialTheme.typography.h2,
                maxLines = 2,
                fontWeight = FontWeight.Bold,
                color = Color.Black)
            Spacer(modifier = Modifier.height(10.dp))
            //
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().fillMaxWidth()
                //.background(brush = Brush.linearGradient(listOf(Color.White, Color.Black)))
            ) {
                /* Box(
                modifier =
                    Modifier.height(150.dp).clip(RectangleShape).background(Color.Red).weight(0.3f))*/
                Image(
                    painterResource(R.drawable.france),
                    contentDescription = "Français",
                    modifier =
                    Modifier.height(50.dp).weight(0.3f).padding(0.dp, 10.dp, 0.dp, 0.dp).clickable {
                        newsViewModel.country.value = "fr"
                        composableScope.launch { newsViewModel.getNewsByCategory("") }
                    })

                Image(
                    painterResource(R.drawable.usa),
                    contentDescription = "English",
                    modifier =
                    Modifier.height(50.dp).weight(0.3f).padding(0.dp, 10.dp, 0.dp, 0.dp).clickable {
                        newsViewModel.country.value = "us"
                        composableScope.launch { newsViewModel.getNewsByCategory("") }
                    })
                Image(
                    painterResource(R.drawable.greece),
                    contentDescription = "Greek",
                    modifier =
                    Modifier.height(50.dp).weight(0.3f).padding(0.dp, 10.dp, 0.dp, 0.dp).clickable {
                        newsViewModel.country.value = "gr"
                        composableScope.launch { newsViewModel.getNewsByCategory("") }
                    })

                // Image(painterResource(R.drawable.france),"content description", modifier  =
                // Modifier.fillMaxWidth().fillMaxWidth().weight(2f))
                // Image(painterResource(R.drawable.usa),"content description",modifier  =
                // Modifier.weight(1f))
                // Image(painterResource(R.drawable.greece),"content description",modifier  =
                // Modifier.weight(1f))

            }
        }
    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun SettingsScreen(newsViewModel: NewsViewModel) {
    val coroutineScope = rememberCoroutineScope()
    val pagerState = rememberPagerState()

    // Color(0xFFFFFFFF)
 /* Column(
      modifier =
          Modifier.fillMaxSize()
              .background(brush = Brush.linearGradient(listOf(Color.White, Color.Black)))) {
    LanguageSetting(newsViewModel)
  }
  */

    TabPage(tabItems = tabsPays, pagerState = pagerState)
    IconWithTextTabLayout(
        tabsPays,
        selectedIndex = pagerState.currentPage,
        onPageSelected = { tabItem: TabItem ->
            Log.d("Ici", "Je suisk denand ")
            coroutineScope.launch {
                pagerState.animateScrollToPage(tabItem.index)
            }
        })



}


@Composable
@Preview(showBackground = true)
fun SettingsScreenPreview() {
  SettingsScreen(viewModel())

}
