package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class Icons(
    val front_default: String,
    val front_female: JsonElement?
)