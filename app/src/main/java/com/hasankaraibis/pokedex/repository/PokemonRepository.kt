package com.hasankaraibis.pokedex.repository

import com.hasankaraibis.pokedex.data.remote.PokeApi
import com.hasankaraibis.pokedex.data.remote.responses.Pokemon
import com.hasankaraibis.pokedex.data.remote.responses.PokemonList
import com.hasankaraibis.pokedex.util.Resource

class PokemonRepository (
    private val api: PokeApi
) {
    suspend fun getPokemonList(limit: Int, offset: Int) : Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }
    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }

}