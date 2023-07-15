package com.example.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.model.MovieData
import com.example.core.usecase.MovieUseCase
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class FavoriteViewModel(private val movieUseCase: MovieUseCase): ViewModel() {

    private val _favorites = MutableSharedFlow<List<MovieData>>()
    val favorites = _favorites.asSharedFlow()

    fun getFavoritesMovies(){
        viewModelScope.launch {
            movieUseCase.getFavorite().collect{
                _favorites.emit(it)
            }
        }
    }
}