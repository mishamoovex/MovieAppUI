package com.androidlead.movietheater.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.androidlead.movietheater.ui.components.section.ComingSoonSection
import com.androidlead.movietheater.ui.components.section.FeaturedMoviesSection
import com.androidlead.movietheater.ui.components.section.HorizontalSection

@Composable
fun DiscoverScreen(
    modifier: Modifier = Modifier,
    screenState: DiscoverScreenState
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .verticalScroll(scrollState)
            .padding(vertical = 24.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        FeaturedMoviesSection(
            data = screenState.featuredMovies
        )
        ComingSoonSection(
            data = screenState.upcomingMovies,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
        HorizontalSection(
            data = screenState.recentlyWatchedMovies,
            name = "Recently Watched"
        )
        HorizontalSection(
            data = screenState.streamingMovies,
            name = "Stream On Demand"
        )
    }
}