package in.org.weatherapp.view;

import android.app.Application;

import in.org.weatherapp.view.utils.SharedPrefers;
import in.org.weatherapp.view.web.WebServices;

public class MyApp extends Application {

    public static double latitude;
    public static double longitude;
    public static String cityName="";

    @Override
    public void onCreate() {
        super.onCreate();
        new WebServices();
        new SharedPrefers(getApplicationContext());
    }
}
