package in.org.weatherapp.view.fragment.weather.presenter;

import in.org.weatherapp.view.fragment.weather.view.WeatherFragmentView;
import in.org.weatherapp.view.model.OpenWeather;
import in.org.weatherapp.view.model.StackWeather;
import in.org.weatherapp.view.model.WeatherBit;
import in.org.weatherapp.view.web.WebServices;
import in.org.weatherapp.view.web.handler.WeatherHandler;

public class WeatherFragmentPresenter implements WeatherFragmentPresenterHandler {

    WeatherFragmentView weatherFragmentView;
    public WeatherFragmentPresenter(WeatherFragmentView weatherFragmentView){

        this.weatherFragmentView=weatherFragmentView;

    }
    @Override
    public void getCurrentWeather(String lat, String lon, String key) {

        weatherFragmentView.showProgressBar();
        WebServices.getInstance().getWeatherData(new WeatherHandler() {

            @Override
            public void onSuccess(StackWeather stackWeather) {
                weatherFragmentView.hideProgressBar();
                weatherFragmentView.onSuccessWeather(stackWeather);

            }

            @Override
            public void onSuccess(OpenWeather openWeather) {
                weatherFragmentView.onSuccessWeather(openWeather);
            }

            @Override
            public void onSuccess(WeatherBit weatherBit) {
                weatherFragmentView.onSuccessWeather(weatherBit);

            }

            @Override
            public void onError(String message) {
                weatherFragmentView.hideProgressBar();
                weatherFragmentView.showFeedbackMessage(message);

            }


        },lat,lon,key);
    }
}
