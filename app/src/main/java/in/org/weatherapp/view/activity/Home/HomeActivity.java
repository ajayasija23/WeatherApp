package in.org.weatherapp.view.activity.Home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.org.weatherapp.R;
import in.org.weatherapp.view.activity.BaseActivity;
import in.org.weatherapp.view.activity.splash.SplashActivity;
import in.org.weatherapp.view.fragment.forecast.WeatherForecast;
import in.org.weatherapp.view.fragment.home.FragmentHome;
import in.org.weatherapp.view.fragment.location.FragmentLocation;
import in.org.weatherapp.view.fragment.setting.FragmentSetting;
import in.org.weatherapp.view.utils.Constants;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.frame)
    FrameLayout frame;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @BindView(R.id.tool_bar)
    Toolbar toolBar;
    private String[] drawerTitles;
    private int mNavIndex = 0;
    private String CURRENT_TAG = Constants.TAG_HOME;
    private Handler mHandler;
    private SplashActivity splashActivity;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        splashActivity=new SplashActivity();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mHandler= new Handler();
        drawerTitles = getResources().getStringArray(R.array.nav_item_titles);
        setSupportActionBar(toolBar);
        settingUpNavigationView();

        if(savedInstanceState==null)
        {
            mNavIndex=0;
            CURRENT_TAG=Constants.TAG_HOME;
            loadFragment();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

            getMenuInflater().inflate(R.menu.menu_item_three_dot,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_refresh:
                loadFragment();
                return true;
            case R.id.action_share:
                share();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void share() {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "https://drive.google.com/file/d/1TZqejyZj_EGeQNO8IM6IotJQoMIRj8bZ/view?usp=sharing");
        sendIntent.setType("text/html");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);

    }

    private void loadFragment()
    {
        setupNavMenu();
        setToolbarTitle();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                Fragment fragment=getSelectedFragment();
                FragmentTransaction fragmentTransaction=
                        getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame,fragment,CURRENT_TAG);
                fragmentTransaction.commitAllowingStateLoss();

            }
        };
        mHandler.post(runnable);
        drawerLayout.closeDrawers();
        invalidateOptionsMenu();
    }

    private Fragment getSelectedFragment() {
        switch (mNavIndex)
        {
            case 0:
                FragmentHome fragmentHome=new FragmentHome();
                return fragmentHome;

            case 1:
                FragmentLocation fragmentLocation=new FragmentLocation();
                return fragmentLocation;
            case 2:
                WeatherForecast fragmentForecast=new WeatherForecast();
                return fragmentForecast;

            case 3:
                FragmentSetting fragmentSetting=new FragmentSetting();
                return fragmentSetting;
                
            default:
                return new FragmentHome();
        }

    }

    private void setToolbarTitle() {
        getSupportActionBar().setTitle(drawerTitles[mNavIndex]);
    }

    private void setupNavMenu() {
        navView.getMenu().getItem(mNavIndex).setChecked(true);

    }

    private void settingUpNavigationView() {
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        mNavIndex = 0;
                        CURRENT_TAG = Constants.TAG_HOME;
                        break;
                    case R.id.nav_location:
                        mNavIndex = 1;
                        CURRENT_TAG = Constants.TAG_MANAGE_LOCATION;
                        break;
                    case R.id.nav_forecast:
                        mNavIndex = 2;
                        CURRENT_TAG = Constants.TAG_FORECAST;
                        break;
                    case R.id.nav_settings:
                        mNavIndex = 3;
                        CURRENT_TAG = Constants.TAG_SETTINGS;

                        break;
                    default:
                        mNavIndex = 0;

                }
                loadFragment();
                return true;
            }
        });
        ActionBarDrawerToggle actionBarDrawerToggle =
                new ActionBarDrawerToggle(this, drawerLayout, toolBar,
                        R.string.openDrawer, R.string.closeDrawer) {
                    @Override
                    public void onDrawerOpened(View drawerView) {
                        super.onDrawerOpened(drawerView);
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        super.onDrawerClosed(drawerView);
                    }
                };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }





}
