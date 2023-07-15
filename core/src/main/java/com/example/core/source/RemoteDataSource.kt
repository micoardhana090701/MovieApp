package com.example.core.source

import com.example.core.api.ApiResponse
import com.example.core.api.ApiService
import com.example.core.response.ResultsPopularMovie

class RemoteDataSource(private val apiService: ApiService) {

    suspend fun getPopularMovie(): ApiResponse<List<ResultsPopularMovie>>{
        return try {
            val response = apiService.getMoviePopular()
            ApiResponse.Success(response.results)
        } catch (e: Exception){
            ApiResponse.Error(e.toString())
        }
    }

    suspend fun getTopMovie(): ApiResponse<List<ResultsPopularMovie>>{
        return try {
            val response = apiService.getTopRated()
            ApiResponse.Success(response.results)
        } catch (e: Exception){
            ApiResponse.Error(e.toString())
        }
    }
}