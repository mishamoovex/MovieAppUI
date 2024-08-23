package com.androidlead.movietheater.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.androidlead.movietheater.R

private val RobotoFontFamily = FontFamily(
    Font(R.font.font_roboto_black, FontWeight.Black, FontStyle.Normal),
    Font(R.font.font_roboto_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.font_roboto_regular, FontWeight.Normal, FontStyle.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        color = Light,
        fontFamily = RobotoFontFamily,
        fontWeight = FontWeight.Black,
        fontSize = 32.sp
    ),
    titleMedium = TextStyle(
        color = Light,
        fontFamily = RobotoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    bodySmall = TextStyle(
        color = Light,
        fontFamily = RobotoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)