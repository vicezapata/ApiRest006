package com.example.apirest006.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apirest006.data.model.Post
import com.example.apirest006.repository.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PostViewModel : ViewModel(){
    private val repository = PostRepository()

    //private val _postList = MutableStateFlow<List<Post>>(emptyList())

    internal val _postList = MutableStateFlow<List<Post>>(emptyList())

    // Hago flujo publico
    val postList: StateFlow<List<Post>> =_postList

    // Se llama automaticamente al iniciar
    init{
        fetchPosts()

    }

    private fun fetchPosts(){
        viewModelScope.launch {
            try{
                _postList.value =repository.getPosts()
            } catch(e:Exception){
                println("error al obtener datos ${e.localizedMessage}")
            }// fin try

        }// fin launch
    }


}// fin clase