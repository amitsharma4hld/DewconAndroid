package com.construction.application.data.network

import com.construction.application.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class RemoteDataSource @Inject constructor() {
    companion object{
       // private const val BASE_URL = "http://chavivarshney.somee.com/"
        private const val BASE_URL = "http://chavi4hld-001-site1.htempurl.com"
    }

    fun <Api> buildApi(
        api: Class<Api>): Api {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(
                OkHttpClient.Builder()
                /*.addInterceptor { chain ->
                    chain.proceed(chain.request().newBuilder().also {
                        it.addHeader("Authorization","Bearer $authToken")
                    }.build())
                }*/.also {client ->
                if (BuildConfig.DEBUG){
                    val logging =  HttpLoggingInterceptor()
                    logging.setLevel(HttpLoggingInterceptor.Level.BODY)
                    client.addInterceptor(logging)
                }
            }.build()
        )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }
}