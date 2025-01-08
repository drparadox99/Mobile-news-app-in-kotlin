package com.example.newapp.api

import com.example.newapp.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Create & return singleton(static) api request object (api client)
class ApiService {
  companion object {
    private val retrofit by lazy {
      Retrofit.Builder()
          .baseUrl(BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .build()
    }
    // create retrofit object that implements NewsAPIInterface
    val api by lazy { retrofit.create(NewsAPIInterface::class.java) }
  }

  /*
  companion object{
      var apiService : NewsAPIInterface?  = null
      fun getInstance() : NewsAPIInterface{
          if (apiService == null){
              apiService = Retrofit.Builder()
                  .baseUrl(BASE_URL)
                  .addConverterFactory(GsonConverterFactory.create())
                  .build().create(NewsAPIInterface::class.java)
          }
          return apiService!!
      }
  }
  */
}
