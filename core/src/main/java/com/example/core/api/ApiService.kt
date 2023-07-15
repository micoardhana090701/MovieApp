package com.example.core.api

import com.example.core.response.PopularResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiService {

    @GET("trending/all/day")
    @Headers("Authorization Bearer e631dbab50c8a96a2e570344aaf629ae")
    suspend fun getMoviePopular(
    ): PopularResponse

    @GET("movie/top_rated")
    @Headers("Authorization Bearer e631dbab50c8a96a2e570344aaf629ae")
    suspend fun getTopRated(
    ): PopularResponse

}