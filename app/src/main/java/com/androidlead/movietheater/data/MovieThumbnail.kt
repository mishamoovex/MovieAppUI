package com.androidlead.movietheater.data

import androidx.annotation.DrawableRes
import com.androidlead.movietheater.R

data class MovieThumbnail(
    val id: Int,
    @DrawableRes val img: Int
)

val ComingSoonData = listOf(
    MovieThumbnail(
        id = 0,
        img = R.drawable.img_movie_poster_3
    ),
    MovieThumbnail(
        id = 1,
        img = R.drawable.img_movie_poster_1
    ),
    MovieThumbnail(
        id = 0,
        img = R.drawable.img_movie_poster_0
    ),
    MovieThumbnail(
        id = 0,
        img = R.drawable.img_movie_poster_8
    )
)