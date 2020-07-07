package in.org.weatherapp.view.web.handler;

import in.org.weatherapp.view.model.OpenWeather;
import in.org.weatherapp.view.model.StackWeather;
import in.org.weatherapp.view.model.WeatherBit;

public interface WeatherHandler extends BaseHandler {
    void onSuccess(StackWeather stackWeather);
    void onSuccess(OpenWeather openWeather);
    void onSuccess(WeatherBit weatherBit);
}
