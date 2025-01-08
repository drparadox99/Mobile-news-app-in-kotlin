package com.example.newapp.utils

import com.example.newapp.R

sealed class CountrySealedClass(val title: String, val sigle: String, val resource: Int) {

  object france : CountrySealedClass("France", "fr", R.drawable.france)
  object usa : CountrySealedClass("USA", "us", R.drawable.usa)
  object uk : CountrySealedClass("UK", "gb", R.drawable.uk)
  object greece : CountrySealedClass("Greece", "gr", R.drawable.greece)
}

val countries =
    listOf(
        CountrySealedClass.france,
        CountrySealedClass.usa,
        CountrySealedClass.uk,
        CountrySealedClass.greece)
