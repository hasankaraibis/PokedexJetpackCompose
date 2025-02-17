package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.Serializable

@Serializable
data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: StatX
)