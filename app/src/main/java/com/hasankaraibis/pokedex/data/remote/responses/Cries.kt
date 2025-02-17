package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.Serializable

@Serializable
data class Cries(
    val latest: String,
    val legacy: String
)