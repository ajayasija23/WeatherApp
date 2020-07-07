package in.org.weatherapp.view.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import in.org.weatherapp.view.model.OpenWeather;
import in.org.weatherapp.view.model.StackWeather;
import in.org.weatherapp.view.model.WeatherBit;
import in.org.weatherapp.view.utils.Constants;
import in.org.weatherapp.view.web.handler.WeatherHandler;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebServices {

    private StackWeatherApi stackWeatherApi;
    private static WebServices mInstance;
    private Gson gson;
    private OpenWeatherApi openWeatherApi;
    private WeatherBitApi weatherBitApi;

    public WebServices() {
        mInstance=this;
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient=new OkHttpClient.Builder()
                                    .addInterceptor(httpLoggingInterceptor)
                                    .callTimeout(5, TimeUnit.MINUTES)
                                    .writeTimeout(5,TimeUnit.MINUTES)
                                    .readTimeout(5,TimeUnit.MINUTES)
                                    .build();
        gson=new GsonBuilder().setLenient().create();
        stackWeatherApi = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(StackWeatherApi.class);

        openWeatherApi= new Retrofit.Builder()
                        .baseUrl(Constants.BASE_URL_OPEN_WEATHER)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .client(okHttpClient)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .build().create(OpenWeatherApi.class);

        weatherBitApi= new Retrofit.Builder()
                .baseUrl(Constants.WEATHERBIT_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(WeatherBitApi.class);


    }
    public static WebServices getInstance()
    {
        return mInstance;
    }

    public void getWeatherData(WeatherHandler weatherHandler, String lat, String lon, String key) {

        Call<StackWeather> callBack= stackWeatherApi.getWeather(key,lon+","+lat);
        callBack.enqueue(new Callback<StackWeather>() {
            @Override
            public void onResponse(Call<StackWeather> call, Response<StackWeather> response) {

                if(response.body()!=null)
                    weatherHandler.onSuccess(response.body());
                else
                    weatherHandler.onError(response.errorBody().toString());
            }

            @Override
            public void onFailure(Call<StackWeather> call, Throwable t) {
                weatherHandler.onError(t.getMessage());

            }
        });
        //Calling openWeather Api
        Call<OpenWeather> callOpenWeather=openWeatherApi.getWeather(lon, lat,Constants.TEMP_UNIT, Constants.OPEN_WEATHER_KEY);
        callOpenWeather.enqueue(new Callback<OpenWeather>() {
            @Override
            public void onResponse(Call<OpenWeather> call, Response<OpenWeather> response) {

                if(response.body()!=null)
                    weatherHandler.onSuccess(response.body());
                else
                    weatherHandler.onError(response.errorBody().toString());

            }

            @Override
            public void onFailure(Call<OpenWeather> call, Throwable t) {
                weatherHandler.onError(t.getMessage());

            }
        });
        Call<WeatherBit> weatherBitCall=weatherBitApi.getWeather(lon,lat,Constants.WEATHERBIT_API_KEY,11+"");
        weatherBitCall.enqueue(new Callback<WeatherBit>() {
            @Override
            public void onResponse(Call<WeatherBit> call, Response<WeatherBit> response) {
                if(response.body()!=null)
                    weatherHandler.onSuccess(response.body());
                else
                    weatherHandler.onError(response.errorBody().toString());

            }

            @Override
            public void onFailure(Call<WeatherBit> call, Throwable t) {
                weatherHandler.onError(t.getMessage());

            }
        });
    }
}
