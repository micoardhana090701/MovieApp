package com.example.core.source

import com.example.core.local.entity.FavoriteEntity
import com.example.core.local.entity.MovieEntity
import com.example.core.local.room.MovieDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val movieDao: MovieDao) {

    fun getMovie(): Flow<List<MovieEntity>> = movieDao.getMovie()

    fun getFavoriteMovie(): Flow<List<FavoriteEntity>> = movieDao.getFavoriteMovie()

    fun getFavoriteMovieById(id:Int): Flow<List<FavoriteEntity>> = movieDao.getFavoriteMovieId(id)

    suspend fun insertMovie(movie: List<MovieEntity>) = movieDao.insertMovie(movie)

    suspend fun setFavoriteMovie(movie: FavoriteEntity, shouldAdd: Boolean) {
        if (shouldAdd) movieDao.insertFavoriteMovie(movie)
        else movieDao.deleteFavoriteById(movie.id)
    }
}