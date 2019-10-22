package com.example.midtermexam

import java.io.Serializable

data class App(
    val name: String = "",
    val description: String = "",
    val power: String = "",
    val status: String = "",
    val imgRes: Int = -1,
    val imgRating: Int = 0
) : Serializable