package com.androidlead.movietheater.ui.screen

import com.androidlead.movietheater.data.FeatureMoviesData
import com.androidlead.movietheater.data.FeaturedMovieState
import com.androidlead.movietheater.data.MovieThumbnailState
import com.androidlead.movietheater.data.RecentlyWatchedMoviesData
import com.androidlead.movietheater.data.StreamingMoviesData
import com.androidlead.movietheater.data.UpcomingMoviesData

data class DiscoverScreenState(
    val featuredMovies: List<FeaturedMovieState> = FeatureMoviesData,
    val upcomingMovies: List<MovieThumbnailState> = UpcomingMoviesData,
    val recentlyWatchedMovies: List<MovieThumbnailState> = RecentlyWatchedMoviesData,
    val streamingMovies: List<MovieThumbnailState> = StreamingMoviesData
)
