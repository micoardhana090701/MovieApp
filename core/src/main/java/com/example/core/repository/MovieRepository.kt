package com.example.core.repository

import com.example.core.Resource
import com.example.core.model.DetailMovieData
import com.example.core.model.MovieData
import com.example.core.model.ReviewData
import com.example.core.source.LocalDataSource
import com.example.core.source.RemoteDataSource
import kotlinx.coroutines.flow.Flow

class MovieRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
    ) : DataMovieRepository {

    override fun getMovie(forceFetch: Boolean): Flow<Resource<List<MovieData>>> {
        TODO("Not yet implemented")
    }

    override fun getTopMovie(forceFetch: Boolean): Flow<Resource<List<MovieData>>> {
        TODO("Not yet implemented")
    }

    override fun searchMovie(query: String): Flow<Resource<List<MovieData>>> {
        TODO("Not yet implemented")
    }

    override fun getDetailMovie(id: String): Flow<Resource<DetailMovieData>> {
        TODO("Not yet implemented")
    }

    override fun getReview(id: String): Flow<Resource<List<ReviewData>>> {
        TODO("Not yet implemented")
    }

    override fun getFavoriteMovieById(id: Int): Flow<List<MovieData>> {
        TODO("Not yet implemented")
    }

    override suspend fun getFavoriteMovie(): Flow<List<MovieData>> {
        TODO("Not yet implemented")
    }

    override suspend fun setMovieFavorite(movie: MovieData, newState: Boolean) {
        TODO("Not yet implemented")
    }
}