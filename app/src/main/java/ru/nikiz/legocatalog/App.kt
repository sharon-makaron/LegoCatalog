package ru.nikiz.legocatalog

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.nikiz.legocatalog.di.interactorModule
import ru.nikiz.legocatalog.di.remoteDataSource
import ru.nikiz.legocatalog.di.repositoryModule
import ru.nikiz.legocatalog.di.viewModelModule

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(viewModelModule,
                remoteDataSource,
                interactorModule,
                repositoryModule))
        }
    }
}