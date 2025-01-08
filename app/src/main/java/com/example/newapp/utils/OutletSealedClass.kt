package com.example.newapp.utils

import android.util.Log
import androidx.compose.runtime.Composable
import com.example.newapp.R

sealed class OutletSealedClass(val title: String, val url: String, val resource: Int) {
  object bcc : OutletSealedClass("BBC", "https://www.bbc.com/news", R.drawable.bbc_news)
  object mediapart :
      OutletSealedClass("Mediapart", "https://www.mediapart.fr", R.drawable.mediapart)
  object cnn : OutletSealedClass("CNN", "https://www.cnn.com", R.drawable.cnn)
  object figaro : OutletSealedClass("Figaro", "https://www.lefigaro.fr", R.drawable.figaro)
  object the_guardian :
      OutletSealedClass(
          "The Guardian", "https://www.theguardian.com/international", R.drawable.the_guardian)
  object le_monde : OutletSealedClass("Le Monde", "https://www.lemonde.fr", R.drawable.le_monde)
  object liberation :
      OutletSealedClass("Libération", "https://www.liberation.fr", R.drawable.liberation)
  object humanite : OutletSealedClass("Humanité", "https://www.humanite.fr", R.drawable.humanite)
  object le_jdd : OutletSealedClass("Le JDD", "https://www.lejdd.fr/lantiseche", R.drawable.le_jdd)
    object future_science : OutletSealedClass("Future Science", "https://www.futura-sciences.com/chroniques", R.drawable.futura_science)

}

val the_outlets =
    listOf(
        OutletSealedClass.bcc,
        OutletSealedClass.mediapart,
        OutletSealedClass.cnn,
        OutletSealedClass.figaro,
        OutletSealedClass.the_guardian,
        OutletSealedClass.le_monde,
        OutletSealedClass.liberation,
        OutletSealedClass.humanite,
        OutletSealedClass.le_jdd,
        OutletSealedClass.future_science
    )
