package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.Serializable

@Serializable
data class FireredLeafgreen(
    val back_default: String,
    val back_shiny: String,
    val front_default: String,
    val front_shiny: String
)