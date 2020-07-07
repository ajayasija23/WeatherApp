package in.org.weatherapp.view.fragment.forecast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import in.org.weatherapp.R;
import in.org.weatherapp.view.MyApp;
import in.org.weatherapp.view.database.SavedPlaces;
import in.org.weatherapp.view.database.SavedPlacesRepository;
import in.org.weatherapp.view.fragment.BaseFragment;
import in.org.weatherapp.view.fragment.home.adapter.ViewPagerAdapter;
import in.org.weatherapp.view.utils.Constants;

public class WeatherForecast extends BaseFragment implements SavedPlacesRepository.FetchSavedLocations {


    RecyclerView weathertendays;
    TabLayout tabLayout;
    ViewPager viewPager;
    private String longitude="";
    private String latitude="";
    SavedPlacesRepository.FetchSavedLocations fetchSavedLocations;
    private SavedPlacesRepository savedPlacesRepository;
    private ViewPagerAdapter mViewPagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather_forecast, container, false);
        viewPager=view.findViewById(R.id.viewPagerForecast);
        tabLayout=view.findViewById(R.id.tabLayoutForecast);
        weathertendays=view.findViewById(R.id.recyclerTenDays);

        fetchSavedLocations=this;
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);
        savedPlacesRepository=new SavedPlacesRepository(getActivity());
        savedPlacesRepository.getTasks(fetchSavedLocations);

        return view;
    }

    private void setupViewPager() {
        mViewPagerAdapter=new ViewPagerAdapter(getChildFragmentManager());
        mViewPagerAdapter.addFragment(new WeatherForecastView(), MyApp.cityName, String.valueOf(MyApp.latitude),
                String.valueOf(MyApp.longitude));
        viewPager.setAdapter(mViewPagerAdapter);

    }

    @Override
    public void savedPlaces(List<SavedPlaces> savedPlaces) {
        updateViewPager(savedPlaces);

    }
    private void updateViewPager(List<SavedPlaces> savedPlaces) {
        for (int i = 0; i <savedPlaces.size() ; i++) {

            mViewPagerAdapter.addFragment(new WeatherForecastView(), savedPlaces.get(i).getTitle(),
                    savedPlaces.get(i).getLatitude(),
                    savedPlaces.get(i).getLongitude());
        }
        Constants.I=0;
        mViewPagerAdapter.notifyDataSetChanged();
    }
}
