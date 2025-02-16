package com.hasankaraibis.pokedex.di

import com.hasankaraibis.pokedex.data.remote.PokeApi
import com.hasankaraibis.pokedex.pokemondetail.PokemonDetailViewModel
import com.hasankaraibis.pokedex.pokemonlist.PokemonListViewModel
import com.hasankaraibis.pokedex.repository.PokemonRepository
import com.hasankaraibis.pokedex.util.Constants.BASE_URL
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    single { providePokeApi() }
    single { PokemonRepository(get()) }

    viewModel { PokemonDetailViewModel(get()) }
    viewModel { PokemonListViewModel(get()) }
}

fun providePokeApi(): PokeApi {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
        .create(PokeApi::class.java)
}