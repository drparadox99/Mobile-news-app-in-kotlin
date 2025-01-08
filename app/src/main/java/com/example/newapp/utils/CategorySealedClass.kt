package com.example.newapp.utils

import com.example.newapp.R

sealed class CategorySealedClass(val title: String, resource: Int) {
  object general : CategorySealedClass("general", R.drawable.general)
  object science : CategorySealedClass("science", R.drawable.science)
  object business : CategorySealedClass("business", R.drawable.business)
  object technology : CategorySealedClass("technology", R.drawable.technology)
  object entertainment : CategorySealedClass("entertainment", R.drawable.entertainment)
  object health : CategorySealedClass("health", R.drawable.health)
  object sports : CategorySealedClass("sports", R.drawable.sports)

}
val newsCategories = listOf(
  CategorySealedClass.general,
  CategorySealedClass.science,
  CategorySealedClass.business,
  CategorySealedClass.technology,
  CategorySealedClass.entertainment,
  CategorySealedClass.health,
  CategorySealedClass.sports
)
