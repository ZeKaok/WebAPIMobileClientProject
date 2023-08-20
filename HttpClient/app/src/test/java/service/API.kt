package service

import io.reactivex.rxjava3.core.Single
import model.Data
import retrofit2.http.GET

interface API {
    //BASE_URL http://localhost:5200/
    @GET("WeatherForecast")
    fun getweather(): Single<List<Data>>
}