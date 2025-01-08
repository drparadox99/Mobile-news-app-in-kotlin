package com.example.newapp.utils

sealed class APIKEYSealedClass(val key: String) {


  object key_1 : APIKEYSealedClass("1c558414557c4866a87ae07b75742aa6")
  object key_2 : APIKEYSealedClass("26ea3b8e95414398b19ed5466cdd0485")
  object key_3 : APIKEYSealedClass("22485022c8964ff4b402b3af493b41e8")
  object key_4 : APIKEYSealedClass("3244599479b24e188aaca9af921894d1")
}

val listOfAPI_Keys =
    listOf(
        APIKEYSealedClass.key_3,
        APIKEYSealedClass.key_1,
        APIKEYSealedClass.key_2,
        APIKEYSealedClass.key_4)
