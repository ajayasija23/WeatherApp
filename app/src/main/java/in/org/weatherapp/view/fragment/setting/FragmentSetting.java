package in.org.weatherapp.view.fragment.setting;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.llollox.androidtoggleswitch.widgets.ToggleSwitch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.org.weatherapp.R;
import in.org.weatherapp.view.fragment.BaseFragment;
import in.org.weatherapp.view.utils.Constants;
import in.org.weatherapp.view.utils.SharedPrefers;

public class FragmentSetting extends BaseFragment {



    ToggleSwitch toggleTemp;

    ToggleSwitch toggeleTime;

    TextView textViewDateFormat;

    TextView textViewWindSpeed;

    TextView textViewPressure;

    TextView textViewPrecip;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        //declaring views
        toggleTemp=(ToggleSwitch)view.findViewById(R.id.toggle_temp);
        toggeleTime=(ToggleSwitch)view.findViewById(R.id.toggele_time);
        textViewPressure=(TextView)view.findViewById(R.id.textViewPressure);
        textViewPrecip=(TextView)view.findViewById(R.id.textViewPrecip);
        textViewWindSpeed=(TextView)view.findViewById(R.id.textViewWindSpeed);

        setTextData();
        setToggleData();
        toggleListener();
        textViewWindSpeed.setOnClickListener(this::onViewClicked);
        textViewPressure.setOnClickListener(this::onViewClicked);
        textViewPrecip.setOnClickListener(this::onViewClicked);
        return view;
    }

    private void setToggleData() {
       if(SharedPrefers.getDataFromPrefs(Constants.TEMPERATURE).equalsIgnoreCase(Constants.CELCIUS))
           toggleTemp.setCheckedPosition(0);
       else
           toggleTemp.setCheckedPosition(1);

        if(SharedPrefers.getDataFromPrefs(Constants.TIME_FORMAT).equalsIgnoreCase(Constants.TIME_FORMAT_12))
            toggeleTime.setCheckedPosition(0);
        else
            toggeleTime.setCheckedPosition(1);
    }

    private void setTextData() {

        if (!SharedPrefers.getDataFromPrefs(Constants.DATE_FORMAT).isEmpty())
            textViewDateFormat.setText(SharedPrefers.getDataFromPrefs(Constants.DATE_FORMAT));

        if (!SharedPrefers.getDataFromPrefs(Constants.WIND_SPEED).isEmpty())
            textViewWindSpeed.setText(SharedPrefers.getDataFromPrefs(Constants.WIND_SPEED));

        if (!SharedPrefers.getDataFromPrefs(Constants.PRESSURE_FORMAT).isEmpty())
            textViewPressure.setText(SharedPrefers.getDataFromPrefs(Constants.PRESSURE_FORMAT));

        if (!SharedPrefers.getDataFromPrefs(Constants.PRECIP_FORMAT).isEmpty())
            textViewPrecip.setText(SharedPrefers.getDataFromPrefs(Constants.PRECIP_FORMAT));

    }

    private void toggleListener() {
        toggleTemp.setOnChangeListener(i -> {
            if (i == 0) {
                SharedPrefers.setDatainPrefs(Constants.TEMPERATURE, Constants.CELCIUS);
            } else{
                SharedPrefers.setDatainPrefs(Constants.TEMPERATURE, Constants.FARENHEIGHT);
            }


        });
        toggeleTime.setOnChangeListener(i -> {
            if (i == 0)
                SharedPrefers.setDatainPrefs(Constants.TIME_FORMAT, Constants.TIME_FORMAT_12);
            else
                SharedPrefers.setDatainPrefs(Constants.TIME_FORMAT, Constants.TIME_FORMAT_24);


        });
    }

    public void onViewClicked(View view)
    {
        switch (view.getId()) {
            case R.id.textViewWindSpeed:
                showWindSpeedPopup(view);
                break;
            case R.id.textViewPressure:
                showPressurePopup(view);
                break;
            case R.id.textViewPrecip:
                showPrecipPopup(view);
                break;
        }
    }

    private void showPrecipPopup(View view) {
        final PopupMenu popupMenu = new PopupMenu(getActivity(), view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.item_in:
                        SharedPrefers.setDatainPrefs(Constants.PRECIP_FORMAT, Constants.PRECIP_IN);
                        textViewPrecip.setText(Constants.PRECIP_IN);
                        popupMenu.dismiss();
                        break;

                    case R.id.item_mm:
                        SharedPrefers.setDatainPrefs(Constants.PRECIP_FORMAT, Constants.PRESSURE_MM);
                        textViewPrecip.setText(Constants.PRESSURE_MM);
                        popupMenu.dismiss();
                        break;
                }
                return true;
            }
        });
        popupMenu.inflate(R.menu.menu_precipitation_popup);
        popupMenu.show();


    }

    private void showPressurePopup(View view) {
        final PopupMenu popupMenu = new PopupMenu(getActivity(), view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.item_inches:
                        SharedPrefers.setDatainPrefs(Constants.PRESSURE_FORMAT, Constants.PRESSURE_INCHES);
                        textViewPressure.setText(Constants.PRESSURE_INCHES);
                        popupMenu.dismiss();

                        break;

                    case R.id.item_mb:
                        SharedPrefers.setDatainPrefs(Constants.PRESSURE_FORMAT, Constants.PRESSURE_MB);
                        textViewPressure.setText(Constants.PRESSURE_MB);
                        popupMenu.dismiss();
                        break;
                }
                return true;
            }
        });
        popupMenu.inflate(R.menu.menu_pressure_popup);
        popupMenu.show();


    }

    private void showWindSpeedPopup(View view) {
        final PopupMenu popupMenu = new PopupMenu(getActivity(), view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.item_km:
                        SharedPrefers.setDatainPrefs(Constants.WIND_SPEED, Constants.WIND_KILLOMETER);
                        textViewWindSpeed.setText(Constants.WIND_KILLOMETER);
                        popupMenu.dismiss();

                        break;

                    case R.id.item_meter:
                        SharedPrefers.setDatainPrefs(Constants.WIND_SPEED, Constants.WIND_METER);
                        textViewWindSpeed.setText(Constants.WIND_METER);
                        popupMenu.dismiss();
                        break;
                }
                return true;
            }
        });
        popupMenu.inflate(R.menu.menu_wind_popup);
        popupMenu.show();
    }

    private void showDatePopup(View view) {
        final PopupMenu popupMenu = new PopupMenu(getActivity(), view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.item_system:
                        SharedPrefers.setDatainPrefs(Constants.DATE_FORMAT, Constants.DATE_FORMAT_SYSTEM);
                        textViewDateFormat.setText(Constants.DATE_FORMAT_SYSTEM);
                        popupMenu.dismiss();

                        break;

                    case R.id.item_api:
                        SharedPrefers.setDatainPrefs(Constants.DATE_FORMAT, Constants.DATE_FORMAT_API);
                        textViewDateFormat.setText(Constants.DATE_FORMAT_API);
                        popupMenu.dismiss();
                        break;
                }
                return true;
            }
        });
        popupMenu.inflate(R.menu.menu_date_popup);
        popupMenu.show();
    }
}
