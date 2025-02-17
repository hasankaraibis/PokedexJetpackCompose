package com.hasankaraibis.pokedex.data.remote.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIv(
    @SerialName("diamond-pearl")
    val diamond_pearl: DiamondPearl,
    @SerialName("heartgold-soulsilver")
    val heartgold_soulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)