package in.org.weatherapp.view.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import in.org.weatherapp.R;

public class BaseActivity extends AppCompatActivity
{
    private int permissionNeeded;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //checking location permission
    public int checkPermission(String [] permissions)
    {
        permissionNeeded=0;
        if(Build.VERSION.SDK_INT>23)
        {
            for (int i = 0; i <permissions.length ; i++)
            {
                int result = ContextCompat.checkSelfPermission(this,permissions[i]);
                if (result!= PackageManager.PERMISSION_GRANTED)
                {
                    permissionNeeded++;
                }
            }
        }
        return permissionNeeded;
    }
}