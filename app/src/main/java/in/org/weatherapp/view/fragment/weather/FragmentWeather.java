package in.org.weatherapp.view.fragment.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;


import java.util.Arrays;
import java.util.List;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import in.org.weatherapp.R;
import in.org.weatherapp.view.fragment.BaseFragment;
import in.org.weatherapp.view.fragment.weather.adapter.FiveDaysWeatherAdapter;
import in.org.weatherapp.view.fragment.weather.presenter.WeatherFragmentPresenter;
import in.org.weatherapp.view.fragment.weather.view.WeatherFragmentView;
import in.org.weatherapp.view.model.OpenWeather;
import in.org.weatherapp.view.model.StackWeather;
import in.org.weatherapp.view.model.WeatherBit;
import in.org.weatherapp.view.utils.Constants;
import in.org.weatherapp.view.utils.FrequentFunction;
import in.org.weatherapp.view.utils.SharedPrefers;

import static com.google.android.gms.ads.AdRequest.ERROR_CODE_INTERNAL_ERROR;
import static com.google.android.gms.ads.AdRequest.ERROR_CODE_INVALID_REQUEST;
import static com.google.android.gms.ads.AdRequest.ERROR_CODE_NETWORK_ERROR;
import static com.google.android.gms.ads.AdRequest.ERROR_CODE_NO_FILL;

public class FragmentWeather extends BaseFragment implements WeatherFragmentView {

    // views
    private ImageView imageViewWeather;
    private TextView textCityAddress;
    private TextView textViewLastUpdate;
    private TextView textTime;
    private TextView textTemprature;
    private TextView textFeelsLike;
    private TextView textWeatherInfo;
    private TextView textPerception;
    private TextView textPressure;
    private TextView textUVIndex;
    private TextView textHumidity;
    private TextView textVisibility;
    private TextView textCloudCover;
    private TextView textWind;
    private TextView textMaxMin;
    private TextView textIsDay;
    private RecyclerView recyclerViewFiveDays;
    private TextView textWindDir;
    private AdView adView;






    private String longitude="";
    private String latitude="";
    private WeatherFragmentPresenter weatherFragmentPresenter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        textCityAddress = view.findViewById(R.id.textCityAddress);
        imageViewWeather = view.findViewById(R.id.imageView_weather);
        textViewLastUpdate = view.findViewById(R.id.textViewLastUpdate);
        textTime = view.findViewById(R.id.textTime);
        textTemprature = view.findViewById(R.id.textTemprature);
        textFeelsLike = view.findViewById(R.id.textFeelsLike);
        textWeatherInfo = view.findViewById(R.id.textWeatherInfo);
        textPerception = view.findViewById(R.id.textPerception);
        textPressure = view.findViewById(R.id.textPressure);
        textUVIndex = view.findViewById(R.id.textUVIndex);
        textHumidity = view.findViewById(R.id.textHumidity);
        textVisibility = view.findViewById(R.id.textVisibility);
        textCloudCover = view.findViewById(R.id.textCloudCover);
        textWind = view.findViewById(R.id.textWind);
        textIsDay=view.findViewById(R.id.textisDay);
        recyclerViewFiveDays=view.findViewById(R.id.recyclerFiveDays);
        textWindDir=view.findViewById(R.id.textWindDir);
        adView=(AdView) view.findViewById(R.id.adView);




        //initialinzin ad view
        MobileAds.initialize(getActivity(),getActivity().getString(R.string.adunitid));

        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        Bundle bundle=getArguments();
        latitude=bundle.getString("latitude");
        longitude=bundle.getString("longitude");
        weatherFragmentPresenter=new WeatherFragmentPresenter(this);
        weatherFragmentPresenter.getCurrentWeather(latitude,longitude, Constants.ACCESS_KEY);

        //setting the recyclerview
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        recyclerViewFiveDays.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(getActivity(),linearLayoutManager.getOrientation());
        recyclerViewFiveDays.addItemDecoration(dividerItemDecoration);
        recyclerViewFiveDays.setHasFixedSize(true);

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
        Toast.makeText(getActivity(),message,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onSuccessWeather(StackWeather stackWeather) {

        String iconUrl= stackWeather.getCurrent().getWeatherIcons().get(0);
        Glide.with(getActivity()).load(iconUrl).into(imageViewWeather);
        textCityAddress.setText(""+ stackWeather.getLocation().getName());
        //observation time
        if(SharedPrefers.getDataFromPrefs(Constants.TIME_FORMAT).equalsIgnoreCase(Constants.TIME_FORMAT_12))
            textViewLastUpdate.setText("Last Updated:"+ FrequentFunction.getObservationTime12(stackWeather.getLocation().getLocaltime()));
        else
            textViewLastUpdate.setText("Last Updated:"+ FrequentFunction.getObservationTime(stackWeather.getLocation().getLocaltime()));
        //local time
        if(SharedPrefers.getDataFromPrefs(Constants.TIME_FORMAT).equalsIgnoreCase(Constants.TIME_FORMAT_12))
            textTime.setText("Local Time: "+FrequentFunction.getLocalTime12(stackWeather.getLocation().getLocaltime()));
        else
            textTime.setText("Local Time: "+ stackWeather.getLocation().getLocaltime());
        //temperature
        if(SharedPrefers.getDataFromPrefs(Constants.TEMPERATURE).equalsIgnoreCase(Constants.FARENHEIGHT))
            textTemprature.setText("Temp: "+FrequentFunction.celsiusToFahrenheit(stackWeather.getCurrent().getTemperature())+"°F");
        else
            textTemprature.setText("Temp: "+ stackWeather.getCurrent().getTemperature()+"°C");
        //feels like
        if(SharedPrefers.getDataFromPrefs(Constants.TEMPERATURE).equalsIgnoreCase(Constants.FARENHEIGHT))
            textFeelsLike.setText(FrequentFunction.celsiusToFahrenheit(stackWeather.getCurrent().getFeelslike())+" °F");
        else
            textFeelsLike.setText(stackWeather.getCurrent().getFeelslike()+" °C");
        //description
        textWeatherInfo.setText(stackWeather.getCurrent().getWeatherDescriptions().get(0));
            //Precip
        if(SharedPrefers.getDataFromPrefs(Constants.PRECIP_FORMAT).equalsIgnoreCase(Constants.PRECIP_IN))
            textPerception.setText("Precip: "+FrequentFunction.MMToIn(stackWeather.getCurrent().getPrecip())+" In");
        else
            textPerception.setText("Precip: "+ stackWeather.getCurrent().getPrecip()+" MM");
            //pressure
        if(SharedPrefers.getDataFromPrefs(Constants.PRESSURE_FORMAT).equalsIgnoreCase(Constants.PRESSURE_INCHES))
            textPressure.setText("Pressure: "+FrequentFunction.MbToIn(stackWeather.getCurrent().getPressure())+" Inches");
        else
            textPressure.setText("Pressure "+ stackWeather.getCurrent().getPressure()+" MB");
        textUVIndex.setText("UVIndex: "+ stackWeather.getCurrent().getUvIndex());
        textHumidity.setText("Humidity: "+ stackWeather.getCurrent().getHumidity()+"%");
        textVisibility.setText("Visibility: "+ stackWeather.getCurrent().getVisibility()+" km");
        textCloudCover.setText("Cloud Cover: "+ stackWeather.getCurrent().getCloudcover()+" %");
        //wind
        if(SharedPrefers.getDataFromPrefs(Constants.WIND_SPEED).equalsIgnoreCase(Constants.WIND_METER))
            textWind.setText("Wind: "+FrequentFunction.kmphToMps(stackWeather.getCurrent().getWindSpeed())+" m/s");
        else
        textWind.setText("Wind: "+ stackWeather.getCurrent().getWindSpeed()+" kmph");

        textIsDay.setText("Is Day: "+ stackWeather.getCurrent().getIsDay());
        textWindDir.setText("Wind Dir: "+ stackWeather.getCurrent().getWindDir());

    }

    @Override
    public void onSuccessWeather(OpenWeather openWeather) {
        setAdapter(openWeather.getList());
    }

    @Override
    public void onSuccessWeather(WeatherBit weatherBit) {

    }

    private void setAdapter(List<OpenWeather.ListBean> listBean) {

        FiveDaysWeatherAdapter fiveDaysWeatherAdapter=new FiveDaysWeatherAdapter(listBean);
        recyclerViewFiveDays.setAdapter(fiveDaysWeatherAdapter);

    }

}
