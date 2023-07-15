package com.example.core.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core.local.entity.FavoriteEntity
import com.example.core.local.entity.MovieEntity

@Database(entities = [MovieEntity::class, FavoriteEntity::class], version = 1, exportSchema = false)
abstract class MovieDatabase : RoomDatabase()  {
    abstract fun movieDao(): MovieDao
}