package com.example.newapp.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.example.newapp.R
import com.example.newapp.model.Article
import com.example.newapp.viewModel.NewsViewModel
import com.google.gson.Gson

@Composable
fun BookmarkedArticles(
    articles: List<Article>?,
    navController: NavHostController,
    newsViewModel: NewsViewModel
) {
  Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
    Text(
        modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 3.dp),
        text = "Fav. Outlets",
        style = MaterialTheme.typography.h2,
        fontWeight = FontWeight.Bold,
        // fontStyle = FontStyle.Italic,
        color = Color.Black)
    Divider(
        color = Color.Gray,
        thickness = 2.dp,
        modifier = Modifier.fillMaxWidth().padding(0.dp, 0.dp, 0.dp, 7.dp))
    articles?.let {
      if (articles.isEmpty()) {
        Image(
            painterResource(R.drawable.empty_bookmarked_page),
            contentDescription = "Empty Page",
            contentScale = ContentScale.Inside,
            modifier = Modifier.fillMaxSize()
        )
      } else {
        LazyColumn(
            Modifier.fillMaxSize().background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
          itemsIndexed(items = articles) { index: Int, article ->
            BookmarkedArticleView(navController = navController, article = article)
          }
        }
      }
    }
        ?: run {}
  }
}

@Composable
fun BookmarkedArticleView(navController: NavController, article: Article) {
  val a = Gson().toJson(article)
  Card(
      modifier =
          Modifier.fillMaxWidth()
              .height(LocalConfiguration.current.screenHeightDp.dp)
              .background(Color.Black)
              // .clickable { navController.navigate(route = "article_view/" + indeX) },
              .clickable { navController.navigate(route = "article_view?articleIndex=${a}") },
      shape = RoundedCornerShape(8.dp),
      elevation = 4.dp) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
      Box(modifier = Modifier.weight(0.65f)) {
        Image(
            painter =
                rememberImagePainter(
                    data = article.urlToImage,
                    builder = {
                      // scale(Scale.FIT)
                      placeholder(R.drawable.empty_bookmarked_page)
                      // transformations(CircleCropTransformation())
                    }),
            contentScale = ContentScale.Crop,
            contentDescription = article.description,
            modifier = Modifier.fillMaxSize())
        Box(
            modifier =
                Modifier.fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black), startY = 300f)))

        Box(
            modifier = Modifier.fillMaxSize().padding(12.dp),
            contentAlignment = Alignment.BottomStart) {
          Row(
              modifier = Modifier.padding(12.dp).fillMaxWidth(),
              horizontalArrangement = Arrangement.SpaceBetween,
              verticalAlignment = Alignment.Bottom) {
            Text(
                text = article.source?.name!!,
                style = MaterialTheme.typography.body1,
                maxLines = 2,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis,
                color = Color.Gray)
            Text(
                text = article.publishedAt!!.substring(0, 10),
                style = MaterialTheme.typography.body1,
                maxLines = 2,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis,
                color = Color.Black)
          }
        }
      }

      Column(modifier = Modifier.weight(0.35f)) {
        article.title?.let {
          Text(
              modifier = Modifier.padding(10.dp),
              text = it,
              textAlign = TextAlign.Justify,
              style = MaterialTheme.typography.h5,
              fontWeight = FontWeight.SemiBold,
              color = Color.DarkGray)
        }

        article.description?.let {
          Text(
              modifier = Modifier.padding(12.dp, 12.dp, 12.dp, 15.dp),
              text = it,
              maxLines = 6,
              textAlign = TextAlign.Justify,
              style = MaterialTheme.typography.body2,
              color = Color.Black)
        }
      }
    }
  }
}
