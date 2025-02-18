package com.batuhan.movieapp.domain.repository

import com.batuhan.movieapp.data.remote.dto.MovieDetailDto
import com.batuhan.movieapp.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search : String) : MoviesDto
    suspend fun getMovieDetail(imdbId : String) : MovieDetailDto
}