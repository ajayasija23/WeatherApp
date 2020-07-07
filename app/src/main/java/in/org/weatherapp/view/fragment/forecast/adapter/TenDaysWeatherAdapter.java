package in.org.weatherapp.view.fragment.forecast.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import in.org.weatherapp.R;
import in.org.weatherapp.view.fragment.weather.adapter.FiveDaysWeatherAdapter;
import in.org.weatherapp.view.model.WeatherBit;
import in.org.weatherapp.view.utils.Constants;
import in.org.weatherapp.view.utils.FrequentFunction;
import in.org.weatherapp.view.utils.SharedPrefers;

public class TenDaysWeatherAdapter extends RecyclerView.Adapter<TenDaysWeatherAdapter.ViewHolder> {

    List<WeatherBit.DataBean> data;
    private Context mContext;
    public TenDaysWeatherAdapter(List<WeatherBit.DataBean> data){
        this.data=data;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext=parent.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_forecast,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textViewDay.setText(FrequentFunction.getWeekDays(data.get(position+1).getValidDate()));
        holder.textViewMonthDate.setText(FrequentFunction.getValidDate(data.get(position+1).getValidDate()));
        String url="https://www.weatherbit.io/static/img/icons/"+data.get(position+1).getWeather().getIcon()+".png";
        Glide.with(mContext).load(url).into(holder.ConditionIcon);

        //Setting Max Min Temperature

        if(SharedPrefers.getDataFromPrefs(Constants.TEMPERATURE)==Constants.FARENHEIGHT)
            holder.textMaxMinForecast.setText(FrequentFunction.celsiusToFahrenheit(data.get(position+1).getMaxTemp())+"/"+
                    FrequentFunction.celsiusToFahrenheit(data.get(position+1).getMinTemp())+"°F");
        else
            holder.textMaxMinForecast.setText(data.get(position+1).getMaxTemp()+"/"+data.get(position+1).getMinTemp()+"°C");

        //setting WeatherCondition

        holder.textWeatherCondition.setText(data.get(position+1).getWeather().getDescription());
        //setting Precipitation

        if(SharedPrefers.getDataFromPrefs(Constants.PRECIP_FORMAT)==Constants.PRECIP_IN)
            holder.textViewPrecipForecast.setText(FrequentFunction.MMToIn(data.get(position+1).getPrecip())+" in");
        else
            holder.textViewPrecipForecast.setText(data.get(position+1).getPrecip()+" MM");

        //setting up Humidity

        holder.textHumidityForecast.setText(data.get(position+1).getRh()+" %");

        //setting pressure
        if (SharedPrefers.getDataFromPrefs(Constants.PRESSURE_FORMAT)==Constants.PRESSURE_INCHES)
            holder.textPressureForecast.setText(FrequentFunction.MbToIn(data.get(position+1).getPres())+" Inches");
        else
            holder.textPressureForecast.setText(data.get(position+1).getPres()+" MB");

        holder.textUVIndexForecast.setText(data.get(position+1).getUv()+" %");

        if(SharedPrefers.getDataFromPrefs(Constants.WIND_SPEED)==Constants.WIND_KILLOMETER)
            holder.textWindForecast.setText(FrequentFunction.mps_to_kmph(data.get(position+1).getWindSpd())+"km/h");
        else
            holder.textWindForecast.setText(data.get(position+1).getWindSpd()+" m/s");


    }


    @Override
    public int getItemCount() {
        return 10;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewDay,textViewMonthDate,textMaxMinForecast,
                textWeatherCondition,textViewPrecipForecast,textHumidityForecast,textWindForecast
                ,textPressureForecast,textUVIndexForecast;
        public ImageView ConditionIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDay=itemView.findViewById(R.id.textViewDay);
            textViewMonthDate=itemView.findViewById(R.id.textViewMonthDate);
            textMaxMinForecast=itemView.findViewById(R.id.textMaxMinForecast);
            textWeatherCondition=itemView.findViewById(R.id.textWeatherCondition);
            textViewPrecipForecast=itemView.findViewById(R.id.textViewPrecipForecast);
            textHumidityForecast=itemView.findViewById(R.id.textHumidityForecast);
            textWindForecast=itemView.findViewById(R.id.textWindForecast);
            textPressureForecast=itemView.findViewById(R.id.textPressureForecast);
            textUVIndexForecast=itemView.findViewById(R.id.textUVIndexForecast);
            ConditionIcon=itemView.findViewById(R.id.ConditionIcon);



        }
    }
}
