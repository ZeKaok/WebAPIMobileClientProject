package classes

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIService {
    private val BASE_URL="http://localhost:5203/"
    private val api=Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(API::class.java)

    fun getData():Call<List<Data>>{
        return api.getweather()
    }

}