package com.example.newapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newapp.model.Article

@Dao
interface ArticleDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE) fun insert(article: Article): Long

  @Update suspend fun updateArticle(article: Article)

  @Delete fun deleteArticle(article: Article)

  @Query("SELECT * FROM articles") suspend fun getAllArticles(): List<Article>

  @Query("SELECT * FROM articles " + " WHERE source LIKE :source")
  fun findArticleBySource(source: String): LiveData<List<Article>>

  @Query("Delete FROM articles") fun deleteAllArticles()

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  @JvmSuppressWildcards
  fun saveAllArticles(articles: List<Article>)
}
