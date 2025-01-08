package com.example.newapp.view.screens

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.newapp.R
import com.example.newapp.model.Article
import com.example.newapp.utils.newsCategories
import com.google.gson.Gson

// Scrollable view of homeview articles
@Composable
fun HomeArticlesView(
    navController: NavController,
    lstCategories: MutableList<MutableList<Article>>?,
) {

  LazyColumn(
      Modifier.fillMaxSize().background(Color(0xFFFFFFFF)),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center) {
    lstCategories?.size?.let {
      itemsIndexed(lstCategories) { index, newsCategory ->
        ArticlesByCategory(newsCategory, index, navController)
      }
    }
  }
}

// Displayable category of articles
@Composable
fun ArticlesByCategory(
    newsCategory: MutableList<Article>,
    index: Int,
    navController: NavController
) {
  var feuVert = true

  Column(horizontalAlignment = Alignment.CenterHorizontally) {
    newsCategory.forEach { article ->
      if (feuVert) {
        Text(
            modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 3.dp),
            text = newsCategories[index - 1].title.replaceFirstChar { it.uppercase() },
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Bold,
            // fontStyle = FontStyle.Italic,
            color = Color.Black)

        Divider(
            color = Color.Gray,
            thickness = 2.dp,
            modifier = Modifier.fillMaxWidth(0.15f).padding(0.dp, 0.dp, 0.dp, 7.dp))
      }
      feuVert = false
      HomeArticleItem(navController = navController, article = article)
    }
  }
}
// An article's composable
@Composable
fun HomeArticleItem(navController: NavController, article: Article) {
  val articleStringJson = Gson().toJson(article)
  val context = LocalContext.current

  Card(
      modifier =
          Modifier.fillMaxWidth(0.93f)
              .height(LocalConfiguration.current.screenHeightDp.dp * 0.50f)
              .background(Color(0xFFFFFFFF))
              .padding(0.dp, 10.dp, 0.dp, 14.dp)
              // .clickable { navController.navigate(route = "article_view/" + indeX) },
              .clickable {
                navController.navigate(route = "article_view?articleIndex=${articleStringJson}")
              },
      shape = RoundedCornerShape(10.dp),
      elevation = 10.dp) {
    // Column(modifier = Modifier.padding(1.dp, 1.dp).fillMaxWidth().background(Color.Black)) {
    Column(/*modifier= Modifier.background(Color.White) */ ) {
      Box() {
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
            modifier =
                Modifier.fillMaxHeight(0.62f)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp)))

        Box(
            modifier =
                Modifier.fillMaxHeight(0.62f)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(0.dp))
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black), startY = 300f)))

        Box(modifier = Modifier.align(Alignment.BottomStart)) {
          Text(
              modifier = Modifier.background(Color.Transparent, shape = shapes.small).padding(3.dp),
              text = article.source?.name!!,
              // text = article.publishedAt!!.substring(0,10) ,
              style = MaterialTheme.typography.body2,
              fontWeight = FontWeight.Bold,
              // fontStyle = FontStyle.Italic,
              color = Color.White)
        }
      }

      Text(
          modifier = Modifier.padding(20.dp, 14.dp, 20.dp, 7.dp),
          text = article.title!!,
          style = MaterialTheme.typography.h5,
          maxLines = 3,
          textAlign = TextAlign.Justify,
          fontWeight = FontWeight.SemiBold,
          overflow = TextOverflow.Ellipsis,
          color = Color.DarkGray)
      // Row(modifier = Modifier.fillMaxSize().background(Color.Red)) {
      Row(
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.SpaceBetween,
          modifier = Modifier.fillMaxSize().padding(20.dp,0.dp,20.dp,0.dp)) {
        Text(
            modifier = Modifier,
            text = article.source?.name!!,
            // text = article.publishedAt!!.substring(0,10) ,
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Light,
            // fontStyle = FontStyle.Italic,
            color = Color.Gray)
        // Spacer(Modifier.width(200.dp))
        Image(
            painterResource(R.drawable.share),
            contentDescription = "Share",
            // contentScale = ContentScale.Crop,
            modifier =
                Modifier.size(20.dp).clickable {
                  val shareArticle_intent: Intent =
                      Intent().apply {
                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, article.url)
                        type = "text/plain"
                      }
                  val shareIntent = Intent.createChooser(shareArticle_intent, null)
                  context.startActivity(shareIntent)
                })
      }
    }
  }
}
