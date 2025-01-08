package com.example.newapp.api

import com.example.newapp.model.NewsResponse
import com.example.newapp.utils.listOfAPI_Keys
//import com.example.newapp.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//API KEY : 26ea3b8e95414398b19ed5466cdd0485 (kend4r&hotmail.com)

// Define api get calls
interface NewsAPIInterface {

  // recherche d'article
  @GET("v2/everything?q=tesla")
  suspend fun search(
      // @Query("q") search: String = "bitcoin",
      @Query("apiKey") apiKey: String,
      @Query("from") from: String = "2022-02-20",
      @Query("sortBy") sortedBy: String = "publishedAt",
      @Query("page") pageNumber: Int = 1
  ): Response<NewsResponse>


  // Get top headlines articles
  @GET("v2/top-headlines")
    suspend fun getBreakingNews(
      @Query("category") categoryCode: String = "",
      @Query("country") countryCode: String = "fr",
      @Query("apiKey") apiKey: String,
      @Query("page") pageNumber: Int = 2
  ): Response<NewsResponse>

  @GET("https://saurav.tech/NewsAPI/top-headlines/category/health/fr.json")
  suspend fun getBreakingNews2(
      //@Query("category") categoryCode: String,

      ): Response<NewsResponse>
}
