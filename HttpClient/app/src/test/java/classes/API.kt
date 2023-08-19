package classes

import retrofit2.Call
import retrofit2.http.GET

interface API {
    //BASE_URL http://localhost:5203/
    @GET("WeatherForecast")
    fun getweather(): Call<List<Data>>
}