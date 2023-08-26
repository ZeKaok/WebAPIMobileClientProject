package service

import io.reactivex.rxjava3.core.Single
import model.Data
import retrofit2.http.GET

interface API {
    @GET("WeatherForecast")
    fun getweather(): Single<List<Data>>
}