package in.org.weatherapp.view.fragment.weather.view;

import in.org.weatherapp.view.model.OpenWeather;
import in.org.weatherapp.view.model.StackWeather;
import in.org.weatherapp.view.model.WeatherBit;

public interface WeatherFragmentView {
    void showProgressBar();
    void hideProgressBar();
    void showFeedbackMessage(String message);
    void onSuccessWeather(StackWeather stackWeather);
    void onSuccessWeather(OpenWeather openWeather);
    void onSuccessWeather(WeatherBit weatherBit);

}
