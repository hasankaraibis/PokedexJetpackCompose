package com.hasankaraibis.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.hasankaraibis.pokedex.data.remote.responses.Pokemon
import com.hasankaraibis.pokedex.repository.PokemonRepository
import com.hasankaraibis.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }

}