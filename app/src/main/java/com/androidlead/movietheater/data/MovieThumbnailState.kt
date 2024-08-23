package com.androidlead.movietheater.data

import androidx.annotation.DrawableRes
import com.androidlead.movietheater.R

data class MovieThumbnailState(
    val id: Int,
    @DrawableRes val img: Int
)

val ComingSoonData = listOf(
    MovieThumbnailState(
        id = 0,
        img = R.drawable.img_movie_poster_3
    ),
    MovieThumbnailState(
        id = 1,
        img = R.drawable.img_movie_poster_1
    ),
    MovieThumbnailState(
        id = 2,
        img = R.drawable.img_movie_poster_0
    ),
    MovieThumbnailState(
        id = 3,
        img = R.drawable.img_movie_poster_8
    )
)

val RecentlyWatchedData = listOf(
    MovieThumbnailState(
        id = 0,
        img = R.drawable.img_movie_poster_7
    ),
    MovieThumbnailState(
        id = 1,
        img = R.drawable.img_movie_poster_6
    ),
    MovieThumbnailState(
        id = 2,
        img = R.drawable.img_movie_poster_8
    ),
    MovieThumbnailState(
        id = 3,
        img = R.drawable.img_movie_poster_2
    ),
)

val StreamingData = listOf(
    MovieThumbnailState(
        id = 0,
        img = R.drawable.img_movie_poster_5
    ),
    MovieThumbnailState(
        id = 1,
        img = R.drawable.img_movie_poster_4
    ),
    MovieThumbnailState(
        id = 2,
        img = R.drawable.img_movie_poster_8
    ),
    MovieThumbnailState(
        id = 3,
        img = R.drawable.img_movie_poster_7
    ),
)