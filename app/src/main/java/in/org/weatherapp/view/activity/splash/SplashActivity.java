package in.org.weatherapp.view.activity.splash;

import android.Manifest;
import android.content.Intent;
import android.content.IntentSender;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.provider.Settings;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

import com.bumptech.glide.Glide;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.internal.Constants;
import in.org.weatherapp.R;
import in.org.weatherapp.view.activity.BaseActivity;
import in.org.weatherapp.view.activity.Home.HomeActivity;
import in.org.weatherapp.view.services.AppLocationService;

public class SplashActivity extends BaseActivity {

    private static final int LOCATION_PERMISSION_CODE = 123;
    private static final int REQUEST_ENABLE_SETTING = 456;
    private String [] permission={Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION};
    private LocationSettingsRequest mLocationSettingRequest;
    private SettingsClient mSettingClient;
    public  AppLocationService appLocationService;


    @BindView(R.id.imageViewSplash)
    ImageView imageViewSplash;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        Glide.with(this).load(R.drawable.weather_gif).into(imageViewSplash);

        if(checkPermission(permission)>0)
        {
            ActivityCompat.requestPermissions(this,permission,LOCATION_PERMISSION_CODE);
        }

        if(!isGpsOn())
        {
            displayLocationEnableDialog();
        }
        else
        {
            appLocationService=new AppLocationService(this);
            navigateToHomeScreen();
        }

    }

    private boolean isGpsOn() {
        LocationManager locationManager=(LocationManager) getSystemService(LOCATION_SERVICE);
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    }

    private void displayLocationEnableDialog() {
        LocationSettingsRequest.Builder builder=new LocationSettingsRequest.Builder();
        builder.addLocationRequest(new LocationRequest().setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY))
                .setAlwaysShow(true);
        mLocationSettingRequest=builder.build();
        mSettingClient=LocationServices.getSettingsClient(this);
        mSettingClient.checkLocationSettings(mLocationSettingRequest)
                      .addOnSuccessListener(new OnSuccessListener<LocationSettingsResponse>() {
                          @Override
                          public void onSuccess(LocationSettingsResponse locationSettingsResponse) {

                          }
                      })
                       .addOnFailureListener(new OnFailureListener() {
                           @Override
                           public void onFailure(@NonNull Exception e) {

                               int statusCode= ((ApiException) e).getStatusCode();
                               switch (statusCode)
                               {
                                   case LocationSettingsStatusCodes.RESOLUTION_REQUIRED:
                                       ResolvableApiException rae= (ResolvableApiException) e;
                                       try {
                                           rae.startResolutionForResult(SplashActivity.this,REQUEST_ENABLE_SETTING);
                                       } catch (IntentSender.SendIntentException ex) {
                                           ex.printStackTrace();
                                       }
                                       break;
                                   case LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE:
                                       Log.e("GPS Error","setting change unavailable");

                                       break;
                               }

                           }
                       })
                        .addOnCanceledListener(new OnCanceledListener() {
                            @Override
                            public void onCanceled() {

                            }
                        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_ENABLE_SETTING)
        {
            switch (resultCode)
            {
                case RESULT_OK:
                    appLocationService=new AppLocationService(this);
                    navigateToHomeScreen();
                    break;
                case RESULT_CANCELED:
                    openGpsSetting();
                    break;
            }
        }
    }

    private void openGpsSetting()
    {
        Intent intent =new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        startActivity(intent);
    }

    public void navigateToHomeScreen()
    {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,HomeActivity.class));

                finish();
            }
        },2000);
    }

}
