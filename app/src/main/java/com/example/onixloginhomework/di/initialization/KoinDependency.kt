package com.example.onixloginhomework.di.initialization

import android.content.Context
import androidx.databinding.ktx.BuildConfig
import com.example.onixloginhomework.di.app
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class KoinDependency(private val context: Context) {
    init {
        initializeKoin()
    }

    private fun initializeKoin() {
        startKoin {
            androidContext(context)
            if (BuildConfig.DEBUG) {
                androidLogger(Level.ERROR)
            }
            modules(modules = app)
        }
    }
}