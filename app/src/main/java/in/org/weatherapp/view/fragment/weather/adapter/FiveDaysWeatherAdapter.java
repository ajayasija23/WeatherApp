package in.org.weatherapp.view.fragment.weather.adapter;

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
import in.org.weatherapp.view.model.OpenWeather;
import in.org.weatherapp.view.utils.Constants;
import in.org.weatherapp.view.utils.FrequentFunction;
import in.org.weatherapp.view.utils.SharedPrefers;

public class FiveDaysWeatherAdapter extends RecyclerView.Adapter<FiveDaysWeatherAdapter.ViewHolder> {

    private Context mContext;
    private List<OpenWeather.ListBean> listBeanList;

    public FiveDaysWeatherAdapter( List<OpenWeather.ListBean> listBean) {
        this.listBeanList=listBean;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        mContext=parent.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_weather,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if(SharedPrefers.getDataFromPrefs(Constants.TEMPERATURE).equalsIgnoreCase(Constants.FARENHEIGHT))
            holder.textViewMaxMin.setText(FrequentFunction.celsiusToFahrenheit(listBeanList.get(position).getMain().getTempMin())+"/"+
                    FrequentFunction.celsiusToFahrenheit(listBeanList.get(position).getMain().getTempMax())+" °F");
        else
            holder.textViewMaxMin.setText(listBeanList.get(position).getMain().getTempMin()+"/"+
                listBeanList.get(position).getMain().getTempMax()+" °C");

        holder.textViewWeather.setText(listBeanList.get(position).getWeather().get(0).getDescription());
        String iconUrl="http://openweathermap.org/img/w/" + listBeanList.get(position).getWeather().get(0).getIcon() + ".png";
        Glide.with(mContext).load(iconUrl).into(holder.imageViewWeather);

        if(SharedPrefers.getDataFromPrefs(Constants.TIME_FORMAT)==Constants.TIME_FORMAT_12)
            holder.textViewDays.setText(FrequentFunction.getDayTime12(listBeanList.get(position).getDt()));
        else
            holder.textViewDays.setText(FrequentFunction.getDayTime(listBeanList.get(position).getDtTxt()));
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewDays,textViewMaxMin,textViewWeather;
        public ImageView imageViewWeather;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDays=itemView.findViewById(R.id.textViewDays);
            textViewWeather=itemView.findViewById(R.id.textWeatherInfoForDay);
            textViewMaxMin=itemView.findViewById(R.id.textViewMaxMin);
            imageViewWeather=itemView.findViewById(R.id.imageView_weather_day);

        }
    }
}
