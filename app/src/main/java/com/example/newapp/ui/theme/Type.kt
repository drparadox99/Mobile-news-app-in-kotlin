package com.example.newapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.newapp.R

val fonts1 =
    FontFamily(
        fonts =
            listOf(
                Font(R.font.stardosstencil_regular, style = FontStyle.Normal),
                Font(
                    R.font.stardosstencil_bold,
                    style = FontStyle.Normal,
                    weight = FontWeight.Bold)))

val fonts2 = FontFamily(fonts = listOf(Font(R.font.righteous_regular, style = FontStyle.Normal)))

val fonts3 =
    FontFamily(
        fonts =
            listOf(
                Font(R.font.roboto_black, style = FontStyle.Normal),
                Font(R.font.roboto_medium, weight = FontWeight.Medium),
                Font(R.font.roboto_bold, style = FontStyle.Normal, weight = FontWeight.Bold),
                Font(R.font.roboto_italic, style = FontStyle.Italic, weight = FontWeight.Normal),
                Font(R.font.roboto_bold_italic, style = FontStyle.Italic, weight = FontWeight.Bold),
                Font(R.font.roboto_thin, style = FontStyle.Normal, weight = FontWeight.Thin)))

val fonts =
    FontFamily(
        fonts =
            listOf(
                Font(
                    R.font.playfairdisplay_regular,
                    style = FontStyle.Normal,
                ),
                Font(
                    R.font.playfairdisplay_medium,
                    style = FontStyle.Normal,
                    weight = FontWeight.Medium),
                Font(
                    R.font.playfairdisplay_black,
                    style = FontStyle.Normal,
                    weight = FontWeight.Black),
                Font(
                    R.font.playfairdisplay_semi_bold,
                    style = FontStyle.Normal,
                    weight = FontWeight.SemiBold),
                Font(
                    R.font.playfairdisplay_bold,
                    style = FontStyle.Normal,
                    weight = FontWeight.Bold),
                Font(
                    R.font.playfairdisplay_black_italic,
                    style = FontStyle.Italic,
                    weight = FontWeight.Normal),
                Font(
                    R.font.playfairdisplay_bold_italic,
                    style = FontStyle.Italic,
                    weight = FontWeight.Bold),
            ))

// Set of Material typography styles to start with
val Typography =
    Typography(
        h1 =
            TextStyle(
                fontFamily = fonts, // add created custom font family
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp),
        h2 =
            TextStyle(
                fontFamily = fonts1, // add created custom font family
                fontWeight = FontWeight.Normal,
                fontSize = 36.sp),
        h3 =
            TextStyle(
                fontFamily = fonts1, // add created custom font family
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp),
        h4 =
            TextStyle(
                fontFamily = fonts2, // add created custom font family
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp),
        h5 =
            TextStyle(
                fontFamily = fonts, // add created custom font family
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp),
        body1 =
            TextStyle(
                fontFamily = fonts, // add created custom font family
                fontStyle = FontStyle.Normal,
               // fontWeight = FontWeight.Light,
                fontSize = 18.sp),
        body2 =
            TextStyle(
                fontFamily = fonts, // add created custom font family
                fontStyle = FontStyle.Normal,
                fontSize = 15.sp),
        button =
        TextStyle(
            fontFamily = fonts, // add created custom font family
            fontStyle = FontStyle.Normal,
            fontSize = 13.sp),

    )
