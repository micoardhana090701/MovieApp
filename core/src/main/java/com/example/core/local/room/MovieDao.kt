package com.example.core.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.core.local.entity.FavoriteEntity
import com.example.core.local.entity.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {
    @Query("SELECT * FROM movie")
    fun getMovie(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM favorite")
    fun getFavoriteMovie(): Flow<List<FavoriteEntity>>

    @Query("SELECT * FROM favorite WHERE id= :id")
    fun getFavoriteMovieId(id: Int): Flow<List<FavoriteEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: List<MovieEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavoriteMovie(movie: FavoriteEntity)

    @Query("DELETE FROM favorite WHERE id= :id")
    suspend fun deleteFavoriteById(id: Int)
}