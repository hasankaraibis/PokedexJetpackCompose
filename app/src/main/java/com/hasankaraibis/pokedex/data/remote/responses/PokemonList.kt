package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class PokemonList(
    val count: Int,
    val next: String,
    val previous: JsonElement?,
    val results: List<Result>
)