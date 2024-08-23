package com.androidlead.movietheater.ui.components.section

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.androidlead.movietheater.data.MovieThumbnailState
import com.androidlead.movietheater.ui.components.MovieThumbnail
import com.androidlead.movietheater.ui.components.SectionHeader

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RecentlyWatchedSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>
) {
    val pagerState = rememberPagerState(pageCount = { data.size })

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionHeader(
            text = "Recently Watched",
            modifier = Modifier.padding(horizontal = 18.dp)
        )

        HorizontalPager(
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 18.dp),
            pageSpacing = 18.dp,
            pageSize = TwoPagesPerViewport
        ) { pageIndex ->
            MovieThumbnail(
                img = data[pageIndex].img,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private val TwoPagesPerViewport = object : PageSize {
    override fun Density.calculateMainAxisPageSize(availableSpace: Int, pageSpacing: Int): Int =
        (availableSpace - pageSpacing) / 2
}