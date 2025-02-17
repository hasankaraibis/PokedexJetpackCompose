package com.hasankaraibis.pokedex.di

import com.hasankaraibis.pokedex.data.remote.PokeApi
import com.hasankaraibis.pokedex.pokemondetail.PokemonDetailViewModel
import com.hasankaraibis.pokedex.pokemonlist.PokemonListViewModel
import com.hasankaraibis.pokedex.repository.PokemonRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { provideHttpClient() }
    single { PokeApi(get()) }
    single { PokemonRepository(get()) }

    viewModel { PokemonDetailViewModel(get()) }
    viewModel { PokemonListViewModel(get()) }
}

fun provideHttpClient(): HttpClient {
    return HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
        install(Logging) {
            level = LogLevel.ALL
        }
    }
}