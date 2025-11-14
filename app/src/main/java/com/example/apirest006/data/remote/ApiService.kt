package com.example.apirest006.data.remote

import com.example.apirest006.data.model.Post
import retrofit2.http.GET

interface ApiService {
      // Define una solicitud GET
    @GET(value="/posts")
    suspend fun getPosts():List<Post>

}