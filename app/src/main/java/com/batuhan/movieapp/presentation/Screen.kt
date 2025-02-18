package com.batuhan.movieapp.presentation

sealed class Screen(val route : String) {
    object MovieScreen : Screen("movie_screen")
    object MovieDetailScreen : Screen("movies_detail_screen")
}