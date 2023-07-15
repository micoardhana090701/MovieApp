package com.example.core.usecase

import com.example.core.Resource
import com.example.core.model.DetailMovieData
import com.example.core.model.MovieData
import com.example.core.model.ReviewData
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getMovie(forceFetch: Boolean): Flow<Resource<List<MovieData>>>
    fun getTopMovie(forceFetch: Boolean): Flow<Resource<List<MovieData>>>
    fun searchMovie(query: String): Flow<Resource<List<MovieData>>>
    fun getDetailMovie(id: String):Flow<Resource<DetailMovieData>>
    fun getReview(id: String):Flow<Resource<List<ReviewData>>>
    fun getFavoriteMovieById(id: Int): Flow<List<MovieData>>
    suspend fun getFavorite() : Flow<List<MovieData>>
    suspend fun setMovieFavorite(movie: MovieData, newState: Boolean)
}