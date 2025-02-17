package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.Serializable

@Serializable
data class Species(
    val name: String,
    val url: String
)