package com.androidlead.movietheater.data

import androidx.annotation.DrawableRes
import com.androidlead.movietheater.R

data class FeaturedMovieItem(
    val id: Int,
    @DrawableRes val img: Int,
    val title: String,
    val description: String,
    val timeSlots: List<String>
)

val FeatureMovies = listOf(
    FeaturedMovieItem(
        id = 0,
        img = R.drawable.img_movie_poster_2,
        title = "Parasite",
        description = "All unemployed, Ki-taek and his family take peculiar interest in the wealthy and glamorous Parks.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM"
        )
    ),
    FeaturedMovieItem(
        id = 1,
        img = R.drawable.img_movie_poster_0,
        title = "Frozen II",
        description = "Anna, Elsa, Kristoff, Olaf and Sven leave Arendelle to travel to an ancient, autumn-bound forest...",
        timeSlots = listOf(
            "11:00 AM",
            "2:00 PM",
            "4:00 PM"
        )
    ),
    FeaturedMovieItem(
        id = 2,
        img = R.drawable.img_movie_poster_4,
        title = "Weathering with You",
        description = "A high-school boy who has run away to Tokyo befriends a girl who appears to be able to change the weather.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM"
        )
    ),
    FeaturedMovieItem(
        id = 3,
        img = R.drawable.img_movie_poster_3,
        title = "Midway",
        description = "The historic story of the Battle of Midway, told by the leaders and the sailors who fought in it. ",
        timeSlots = listOf(
            "11:00 AM",
            "2:00 PM",
            "4:00 PM"
        )
    )
)