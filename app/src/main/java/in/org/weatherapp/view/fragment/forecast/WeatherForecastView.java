package in.org.weatherapp.view.fragment.forecast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import in.org.weatherapp.R;
import in.org.weatherapp.view.fragment.BaseFragment;
import in.org.weatherapp.view.fragment.forecast.adapter.TenDaysWeatherAdapter;
import in.org.weatherapp.view.fragment.weather.presenter.WeatherFragmentPresenter;
import in.org.weatherapp.view.fragment.weather.view.WeatherFragmentView;
import in.org.weatherapp.view.model.OpenWeather;
import in.org.weatherapp.view.model.StackWeather;
import in.org.weatherapp.view.model.WeatherBit;
import in.org.weatherapp.view.utils.Constants;

public class WeatherForecastView extends BaseFragment implements WeatherFragmentView {


    RecyclerView recyclerTenDays;
    private String latitude="";
    private String longitude="";
    private WeatherFragmentPresenter weatherFragmentPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_weather_forecast, container, false);
        recyclerTenDays=view.findViewById(R.id.recyclerTenDays);
        Bundle bundle=getArguments();
        latitude=bundle.getString("latitude");
        longitude=bundle.getString("longitude");
        weatherFragmentPresenter=new WeatherFragmentPresenter(this);
        weatherFragmentPresenter.getCurrentWeather(latitude,longitude, Constants.ACCESS_KEY);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false);
        recyclerTenDays.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(getActivity(),linearLayoutManager.getOrientation());
        recyclerTenDays.addItemDecoration(dividerItemDecoration);
        recyclerTenDays.setHasFixedSize(true);

        return view;
    }

    @Override
    public void showProgressBar() {
        showProgress();

    }

    @Override
    public void hideProgressBar() {
        hideProgress();
    }

    @Override
    public void showFeedbackMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onSuccessWeather(StackWeather stackWeather) {

    }

    @Override
    public void onSuccessWeather(OpenWeather openWeather) {

    }

    @Override
    public void onSuccessWeather(WeatherBit weatherBit) {
        setAdapter(weatherBit.getData());
    }

    private void setAdapter(List<WeatherBit.DataBean> data) {
        TenDaysWeatherAdapter tenDaysWeatherAdapter = new TenDaysWeatherAdapter(data);
        recyclerTenDays.setAdapter(tenDaysWeatherAdapter);

    }
}
