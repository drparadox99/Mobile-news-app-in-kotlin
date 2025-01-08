package com.example.newapp.view.screens

import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.newapp.utils.CountrySealedClass
import com.example.newapp.utils.countries
import com.example.newapp.viewModel.NewsViewModel
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.SwipeRefreshIndicator
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import kotlinx.coroutines.launch

//Displayable home view page of articles
@Composable
fun HomeView(navController: NavHostController, newsViewModel: NewsViewModel) {
  // val articles = newsViewModel.newsListResponse.observeAsState().value
  val composableScope = rememberCoroutineScope()
  val context = LocalContext.current
  SwipeRefresh(
      state = rememberSwipeRefreshState(false),
      onRefresh = {
        // get and update next api key index
        newsViewModel.randIndex = newsViewModel.getNextAPiKey(newsViewModel.randIndex)
        // make api call with new api key
        composableScope.launch { newsViewModel.actualiser() }
        //Toast.makeText(context, "Refreshed", Toast.LENGTH_SHORT).show()
      },
      indicator = { state, refreshTrigger ->
        SwipeRefreshIndicator(
            state = state,
            refreshTriggerDistance = refreshTrigger,
            scale = true,
            backgroundColor = MaterialTheme.colors.primary)
      }) {
    Card(
        Modifier.fillMaxSize(),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color(0xFFF8fbf8),
        elevation = 4.dp) {
      Column() {
        CountriesStrip(newsViewModel)
        Divider(
            color = Color.Gray,
            thickness = 2.dp,
            modifier = Modifier.fillMaxWidth().padding(0.dp, 0.dp, 0.dp, 7.dp))
        Spacer(modifier = Modifier.height(20.dp))
        HomeViewNews(navController, newsViewModel)
      }
    }
  }
}

//Displayable strip of countries
@Composable
fun CountriesStrip(newsViewModel: NewsViewModel) {
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
          text = "Outlet",
          style = MaterialTheme.typography.h2,
          maxLines = 2,
          fontWeight = FontWeight.Bold,
          color = Color.Black)

      Divider(
          color = Color.Gray,
          thickness = 2.dp,
          modifier = Modifier.fillMaxWidth(0.4f).padding(0.dp, 0.dp, 0.dp, 7.dp))

      Spacer(modifier = Modifier.height(20.dp))
      Divider(
          color = Color.Gray,
          thickness = 2.dp,
          modifier = Modifier.fillMaxWidth().padding(0.dp, 0.dp, 0.dp, 7.dp))
      Row(
          horizontalArrangement = Arrangement.SpaceBetween,
          modifier =
              Modifier.fillMaxWidth().wrapContentHeight().horizontalScroll(rememberScrollState())) {
        countries.forEach { CountriesLogo(it, newsViewModel) }
      }
    }
  }
}

//Displayable image and below caption composable
@Composable
fun CountriesLogo(country: CountrySealedClass, newsViewModel: NewsViewModel) {
  Column(
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier.width(70.dp).wrapContentHeight().padding(2.dp, 0.dp, 0.dp, 0.dp)) {
    Image(
        painterResource(country.resource),
        contentDescription = country.title,
        contentScale = ContentScale.Crop,
        modifier =
            Modifier.size(33.dp)
                .clip(CircleShape)
                .border(
                    2.dp,
                    if (newsViewModel.country.value.equals(country.sigle, false)) Color.White
                    else Color.Black,
                    CircleShape)
                .clickable {
                  if (country.sigle.equals("fr"))
                      newsViewModel._newsListResponse.value =
                          newsViewModel._newsListResponse_france.value
                  if (country.sigle.equals("us"))
                      newsViewModel._newsListResponse.value =
                          newsViewModel._newsListResponse_usa.value
                  if (country.sigle.equals("gb"))
                      newsViewModel._newsListResponse.value =
                          newsViewModel._newsListResponse_uk.value
                  if (country.sigle.equals("gr"))
                      newsViewModel._newsListResponse.value =
                          newsViewModel._newsListResponse_greece.value
                  newsViewModel.country.value = country.sigle
                })

    Text(
        modifier = Modifier.align(Alignment.CenterHorizontally).height(20.dp) /*.clickable {
            newsViewModel.country = "fr"
            composableScope.launch { newsViewModel.getNewsByCategory("") }
        }*/,
        style =
            TextStyle(
                textDecoration =
                    if (newsViewModel.country.value.equals(country.sigle, false))
                        TextDecoration.None
                    else TextDecoration.Underline),
        text = country.title,
        fontSize = 9.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black)
  }
}
//Displayable news article composable
@Composable
fun HomeViewNews(navController: NavHostController, newsViewModel: NewsViewModel) {
  Card(
      Modifier.fillMaxSize().background(Color(0xFFF8fbf8)),
      shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
      elevation = 4.dp) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
    /*  Text(
          modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 3.dp),
          text = "InfoX",
          style = MaterialTheme.typography.h2,
          fontWeight = FontWeight.Bold,
          // fontStyle = FontStyle.Italic,
          color = Color.Black)
      Divider(
          color = Color.Gray,
          thickness = 2.dp,
          modifier = Modifier.fillMaxWidth(0.6f).padding(0.dp, 0.dp, 0.dp, 7.dp)) */
      HomeArticlesView(navController, newsViewModel._newsListResponse.value)
    }
  }
}

