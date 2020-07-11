package in.org.weatherapp.view.web;

import in.org.weatherapp.view.model.StackWeather;
import in.org.weatherapp.view.model.WeatherBit;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StackWeatherApi {

    @GET("v2.0/current")
    Call<StackWeather> getWeather(@Query("lat") String lat,
                                @Query("lon") String lon,
                                @Query("key") String key);

}
