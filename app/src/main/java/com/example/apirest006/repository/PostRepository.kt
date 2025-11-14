package com.example.apirest006.repository

import com.example.apirest006.data.model.Post
import com.example.apirest006.data.remote.RetrofitInstance

// Este repositorio se encarga de acceder a los datos Retrofit

class PostRepository {

    // Funcion que obtienen los post desde la API
    suspend fun getPosts(): List<Post>{
    return RetrofitInstance.api.getPosts()
    }
}// fin clase