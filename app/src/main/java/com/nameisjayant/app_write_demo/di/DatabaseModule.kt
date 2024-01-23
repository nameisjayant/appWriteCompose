package com.nameisjayant.app_write_demo.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.appwrite.Client
import io.appwrite.services.Account
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesClient(
        @ApplicationContext context: Context
    ): Client = Client(context).setEndpoint("https://api.nameisjayant.com/v1")
        .setProject("65aea4b7c3018086bd63")

    @Provides
    @Singleton
    fun providesAccount(client: Client): Account = Account(client)

}