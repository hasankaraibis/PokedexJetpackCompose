package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class BlackWhite(
    val animated: Animated,
    val back_default: String,
    val back_female: JsonElement?,
    val back_shiny: String,
    val back_shiny_female: JsonElement?,
    val front_default: String,
    val front_female: JsonElement?,
    val front_shiny: String,
    val front_shiny_female: JsonElement?
)