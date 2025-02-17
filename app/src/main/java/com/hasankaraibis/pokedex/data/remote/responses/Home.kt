package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class Home(
    val front_default: String,
    val front_female: JsonElement?,
    val front_shiny: String,
    val front_shiny_female: JsonElement?
)