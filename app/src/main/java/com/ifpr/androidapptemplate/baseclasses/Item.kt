package com.ifpr.androidapptemplate.baseclasses


data class Item(
    var nome: String? = null,
    val base64Image: String? = null,
    var tipo: String? = null,
    val imageUrl: String? = null
)
