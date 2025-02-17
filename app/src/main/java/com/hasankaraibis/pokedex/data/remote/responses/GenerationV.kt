package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationV(
    @SerialName("black-white")
    val black_white: BlackWhite
)