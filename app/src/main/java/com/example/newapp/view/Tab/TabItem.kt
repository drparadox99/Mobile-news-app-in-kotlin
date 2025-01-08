package com.example.newapp.view.Tab

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.newapp.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

sealed class TabItem(
    val index: Int,
    val icon: @Composable () -> Unit,
    val title: String,
    val screenToLoad: @Composable () -> Unit
) {
  object France :
      TabItem(
          0,
          {
            Image(
                painterResource(R.drawable.france),
                contentDescription = "",
            )
          },
          "fr",
          { HomeScreenForTab() })
  object Usa :
      TabItem(
          1,
          {
            Image(
                painterResource(R.drawable.usa),
                contentDescription = "",
            )
          },
          "usa",
          { HomeScreenForTab() })
  object Greece :
      TabItem(
          2,
          {
            Image(
                painterResource(R.drawable.greece),
                contentDescription = "",
            )
          },
          "greece",
          { HomeScreenForTab() })
}

@Composable
fun HomeScreenForTab() {
  Column(
      content = { Text(text = "You are in Home Screen") },
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally)
}

@Composable
fun ContactScreenForTab() {
  Column(
      content = { Text(text = "You are in Contacts Screen") },
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally)
}

@Composable
fun SettingsScreenForTab() {
  Column(
      content = { Text(text = "You are in Settings Screen") },
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally)
}

val tabsPays = listOf(TabItem.France, TabItem.Usa, TabItem.Greece)

@ExperimentalPagerApi
@Composable
fun TabPage(pagerState: PagerState, tabItems: List<TabItem>) {
  HorizontalPager(count = tabsPays.size, state = pagerState) { index ->
    tabItems[index].screenToLoad()
    Log.d("Ici", "Je viens de cliquer ")
  }
}

@Composable
fun IconWithTextTabLayout(
    tabs: List<TabItem>,
    selectedIndex: Int,
    onPageSelected: ((tabItem: TabItem) -> Unit)
) {
  TabRow(selectedTabIndex = selectedIndex) {
    tabs.forEachIndexed { index, tabItem ->
        Tab(
          modifier = Modifier.background(Color(0xFFFFFFFF)),
          selected = index == selectedIndex,
          onClick = { onPageSelected(tabItem)
                    },
          text = { Text(text = tabItem.title, color = Color.Black) },
          // icon = { Icon(tabItem.icon, "", tint =  Color.Black) })
          icon =  tabItem.icon)
    }
  }
}
