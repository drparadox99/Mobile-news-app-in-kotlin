package com.example.newapp.repository

import com.example.newapp.api.ApiService
import com.example.newapp.db.ArticleDatabase
import com.example.newapp.model.Article

class NewsRepository(private val db: ArticleDatabase) {

  // get news articles via API call
  suspend fun getBreakingNews(category: String, country: String,apiKey:String) =
      ApiService.api.getBreakingNews(category, country,apiKey)

  // suspend fun getBreakingNews(category: String) = ApiService.api.getBreakingNews()
  suspend fun search(apiKey:String) = ApiService.api.search(apiKey)

  // insert article into the database
  fun insert(article: Article) = db.getArticleDao().insert(article)

  // Update article
  suspend fun updateArticle(article: Article) {
    db.getArticleDao().updateArticle(article)
  }
  // find article by Source
  fun findArticleBySource(source: String) = db.getArticleDao().findArticleBySource(source)

  // Get saved news
  suspend fun getAllArticles() = db.getArticleDao().getAllArticles()

  // Delete article
  fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

  // Delete all Articles
  fun deleteArticles() = db.getArticleDao().deleteAllArticles()

  // Save all articles
  suspend fun saveAllArticles() {}
}
