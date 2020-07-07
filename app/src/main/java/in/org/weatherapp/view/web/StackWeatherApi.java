package in.org.weatherapp.view.web;

import in.org.weatherapp.view.model.StackWeather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StackWeatherApi {

    @GET("/current")
    Call<StackWeather> getWeather(@Query("access_key") String key,
                                  @Query("query") String lat_lon);

}
