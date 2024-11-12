package com.batuhan.movieapp.data.repository

import com.batuhan.movieapp.data.remote.MovieAPI
import com.batuhan.movieapp.data.remote.dto.MovieDetailDto
import com.batuhan.movieapp.data.remote.dto.MoviesDto
import com.batuhan.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api : MovieAPI
) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        println(api.getMovies(searchString = search))
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(imdbId : String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}