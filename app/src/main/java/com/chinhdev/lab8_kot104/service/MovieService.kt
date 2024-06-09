package com.chinhdev.lab8_kot104.service

import com.chinhdev.lab8_kot104.model.MovieRequest
import com.chinhdev.lab8_kot104.model.StatusResponse
import com.chinhdev.lab8_kot104.response.MovieResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface MovieService {
    @GET("books")
    suspend fun getListFilms(): Response<List<MovieResponse>>

    @GET("books/{id}")
    suspend fun getFilmDetail(@Path("id") id: String): Response<MovieResponse>

    @POST("books")
    suspend fun addFilm(@Body filmRequest: MovieRequest): Response<StatusResponse>

    @PUT("books/{id}")
    suspend fun updateFilm(
        @Path("id") id: String,
        @Body filmRequest: MovieRequest
    ): Response<StatusResponse>

    @DELETE("books/{id}")
    suspend fun deleteFilm(@Path("id") id: String): Response<StatusResponse>
}
