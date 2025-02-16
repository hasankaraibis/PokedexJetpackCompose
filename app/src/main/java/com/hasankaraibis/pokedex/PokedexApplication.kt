package com.hasankaraibis.pokedex

import android.app.Application
import com.hasankaraibis.pokedex.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class PokedexApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        startKoin {
            androidContext(this@PokedexApplication)
            modules(appModule)
        }
    }
}