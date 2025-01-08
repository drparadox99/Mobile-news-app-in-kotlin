package com.example.newapp.viewModel

import android.app.Application
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.*
import com.example.newapp.db.ArticleDatabase
import com.example.newapp.model.Article
import com.example.newapp.model.NewsResponse
import com.example.newapp.repository.NewsRepository
import com.example.newapp.utils.*
import java.lang.Math.random
import java.util.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel(application: Application) : AndroidViewModel(application) {
  // get application context
  // private val context = getApplication<Application>().applicationContext

  // Articles' language
  // val _newsListResponse: MutableLiveData<MutableList<Article>>
  // =MutableLiveData(mutableListOf<Article>())
  // val newsListResponse: LiveData<MutableList<Article>>
  //  get() = _newsListResponse
  var country = mutableStateOf("fr")

  var _newsListResponse: MutableState<MutableList<MutableList<Article>>> =
      mutableStateOf(mutableListOf(mutableListOf()))

  var _newsListResponse_france: MutableState<MutableList<MutableList<Article>>> =
      mutableStateOf(mutableListOf(mutableListOf()))

  var _newsListResponse_usa: MutableState<MutableList<MutableList<Article>>> =
      mutableStateOf(mutableListOf(mutableListOf()))

  var _newsListResponse_uk: MutableState<MutableList<MutableList<Article>>> =
      mutableStateOf(mutableListOf(mutableListOf()))

  var _newsListResponse_greece: MutableState<MutableList<MutableList<Article>>> =
      mutableStateOf(mutableListOf(mutableListOf()))

  lateinit var response: NewsResponse

  // random outlet selection by index
  var outletSelected =
      mutableStateOf(the_outlets.get((Math.random() * (the_outlets.size - 0 + 1)).toInt() + 0))

  // Error message
  private var errorMessage: String by mutableStateOf("")

  // apiKey list index
  var randIndex = 0

  // Saved articles
  private val _savedNewsList: MutableLiveData<List<Article>> = MutableLiveData()
  val savedNewsList: LiveData<List<Article>>
    get() = _savedNewsList

  // Getting repository
  // run asynchronously, coroutine that will be canceled when the ViewModel is cleared.
  private val repository: NewsRepository = NewsRepository(ArticleDatabase.getInstance(application))

  init {

    viewModelScope.launch(Dispatchers.IO) {
      try {
        actualiser()
      } catch (e: Exception) {
        errorMessage = e.message.toString()
        Log.d("Ici ", " Error $errorMessage")
      }
    }
  }

  fun saveArticle(article: Article) {
    viewModelScope.launch(Dispatchers.IO) {
      // Log.d("Ici ", " Saving " + Thread.currentThread().name)
      repository.insert(article)
    }
  }

  fun getSavedArticles() {
    viewModelScope.launch(Dispatchers.IO) { _savedNewsList.postValue(repository.getAllArticles()) }
  }
  fun deleteAllArticles() {
    viewModelScope.launch(Dispatchers.IO) { repository.deleteArticles() }
  }

  fun deleteArticle(article: Article) {
    viewModelScope.launch(Dispatchers.IO) { repository.deleteArticle(article) }
  }
  // Get news by category
  suspend fun getNewsByCategory(category: String) {
    // _newsListResponse.postValue(repository.getBreakingNews(category, country).body()?.articles)
  }

  suspend fun actualiser() {
    val apiKeyChosen = listOfAPI_Keys[randIndex].key
    countries.forEach {
      val lstCategories: MutableList<MutableList<Article>> = mutableListOf(mutableListOf<Article>())
      newsCategories.forEach { newsCategory ->
        repository
            .getBreakingNews(newsCategory.title, it.sigle, apiKeyChosen)
            .body()
            ?.articles
            ?.let { lstCategories.add(it) }
      }
      if (it.sigle.equals("fr")) _newsListResponse_france.value = lstCategories
      if (it.sigle.equals("us")) _newsListResponse_usa.value = lstCategories
      if (it.sigle.equals("gb")) _newsListResponse_uk.value = lstCategories
      if (it.sigle.equals("gr")) _newsListResponse_greece.value = lstCategories
    }
    _newsListResponse.value = _newsListResponse_france.value
  }
  // gets next api key in a cyclic way (0 , 1, 2, 0 , 1, 2, 0 ...)
  public fun getNextAPiKey(currentAPiKeyIndex: Int): Int =
      (currentAPiKeyIndex + 1) % listOfAPI_Keys.size

  // Verify if articles are returned
  fun apiCalledEmpy(lstCategoriesAPiCall: MutableList<MutableList<Article>>): Boolean {
    return lstCategoriesAPiCall.size == 1
  }
}

// NewsViewModelFactory class
/*
class NewsViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
  override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    @Suppress("UNCHECKED_CAST")
    if (modelClass.isAssignableFrom(NewsViewModel::class.java)) {
      return NewsViewModel(application) as T
    }
    throw IllegalArgumentException("Unknown ViewModel class")
  }
}*/
