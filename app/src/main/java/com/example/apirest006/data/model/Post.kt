package com.example.apirest006.data.model

// Esta clase representa un post obtenido de la API

data class Post(
    val userId: Int,
    val id:Int,
    val title:String,
    val body:String
)