package in.org.weatherapp.view.web;

import in.org.weatherapp.view.model.OpenWeather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherApi {
    @GET("/data/2.5/forecast?")
    Call<OpenWeather> getWeather(@Query ("lat") String lat,
                                 @Query("lon") String lon,
                                 @Query("units") String units,
                                 @Query ("appid") String key);

}
