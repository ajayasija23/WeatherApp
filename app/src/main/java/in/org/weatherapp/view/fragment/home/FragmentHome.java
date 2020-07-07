package in.org.weatherapp.view.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import in.org.weatherapp.R;
import in.org.weatherapp.view.MyApp;
import in.org.weatherapp.view.database.SavedPlaces;
import in.org.weatherapp.view.database.SavedPlacesRepository;
import in.org.weatherapp.view.fragment.BaseFragment;
import in.org.weatherapp.view.fragment.home.adapter.ViewPagerAdapter;
import in.org.weatherapp.view.fragment.weather.FragmentWeather;
import in.org.weatherapp.view.utils.Constants;

public class FragmentHome extends BaseFragment
        implements SavedPlacesRepository.FetchSavedLocations {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
     Unbinder unbinder;

     private ViewPagerAdapter mViewPagerAdapter;
     private SavedPlacesRepository.FetchSavedLocations fetchSavedLocations;
     private SavedPlacesRepository savedPlacesRepository;
     private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,
                container, false);
        unbinder= ButterKnife.bind(this,view);

        fetchSavedLocations=this;
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);
        savedPlacesRepository=new SavedPlacesRepository(getActivity());
        savedPlacesRepository.getTasks(fetchSavedLocations);
        return view;
    }

    private void setupViewPager() {
        mViewPagerAdapter=new ViewPagerAdapter(getChildFragmentManager());
        mViewPagerAdapter.addFragment(new FragmentWeather(), MyApp.cityName, String.valueOf(MyApp.latitude),
                String.valueOf(MyApp.longitude));
        viewPager.setAdapter(mViewPagerAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void savedPlaces(List<SavedPlaces> savedPlaces) {
        updateViewPager(savedPlaces);
    }

    private void updateViewPager(List<SavedPlaces> savedPlaces) {
        for (int i = 0; i <savedPlaces.size() ; i++) {

            mViewPagerAdapter.addFragment(new FragmentWeather(), savedPlaces.get(i).getTitle(),
                    savedPlaces.get(i).getLatitude(),
                    savedPlaces.get(i).getLongitude());
        }
        Constants.I=0;
        mViewPagerAdapter.notifyDataSetChanged();
    }
}
