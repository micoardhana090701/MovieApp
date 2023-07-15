package com.example.core.repository

import com.example.core.Resource
import com.example.core.model.DetailMovieData
import com.example.core.model.MovieData
import com.example.core.model.ReviewData
import kotlinx.coroutines.flow.Flow

interface DataMovieRepository {
    fun getMovie(forceFetch: Boolean): Flow<Resource<List<MovieData>>>
    fun getTopMovie(forceFetch: Boolean): Flow<Resource<List<MovieData>>>
    fun searchMovie(query: String): Flow<Resource<List<MovieData>>>
    fun getDetailMovie(id: String): Flow<Resource<DetailMovieData>>
    fun getReview(id: String): Flow<Resource<List<ReviewData>>>
    fun getFavoriteMovieById(id: Int): Flow<List<MovieData>>
    suspend fun getFavoriteMovie() : Flow<List<MovieData>>
    suspend fun setMovieFavorite(movie: MovieData, newState: Boolean)

}