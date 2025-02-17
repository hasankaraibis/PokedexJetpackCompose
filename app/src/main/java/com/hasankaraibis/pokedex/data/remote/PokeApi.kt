package com.hasankaraibis.pokedex.data.remote

import com.hasankaraibis.pokedex.data.remote.responses.Pokemon
import com.hasankaraibis.pokedex.data.remote.responses.PokemonList
import com.hasankaraibis.pokedex.util.Constants.BASE_URL
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class PokeApi(private val client: HttpClient) {

    suspend fun getPokemonList(limit: Int, offset: Int): PokemonList {
        return client.get("${BASE_URL}pokemon") {
            url {
                parameters.append("limit", limit.toString())
                parameters.append("offset", offset.toString())
            }
        }.body()
    }

    suspend fun getPokemonInfo(name: String): Pokemon {
        return client.get("${BASE_URL}pokemon/$name").body()
    }
}