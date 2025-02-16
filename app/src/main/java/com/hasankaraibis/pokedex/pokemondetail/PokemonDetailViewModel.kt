package com.hasankaraibis.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.hasankaraibis.pokedex.data.remote.responses.Pokemon
import com.hasankaraibis.pokedex.repository.PokemonRepository
import com.hasankaraibis.pokedex.util.Resource

class PokemonDetailViewModel (
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}