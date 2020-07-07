package in.org.weatherapp.view.fragment.location.adapter;

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
import in.org.weatherapp.view.database.SavedPlaces;
import in.org.weatherapp.view.model.OpenWeather;
import in.org.weatherapp.view.utils.Constants;
import in.org.weatherapp.view.utils.FrequentFunction;

public class SavedPlacesAdapter extends RecyclerView.Adapter<SavedPlacesAdapter.ViewHolder> {

    private Context mContext;
    private List<SavedPlaces> savedPlacesList;
    private PlaceInterface placeInterface;

    public SavedPlacesAdapter(List<SavedPlaces> savedPlaces,PlaceInterface placeInterface) {
        this.savedPlacesList=savedPlaces;
        this.placeInterface=placeInterface;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        mContext=parent.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_saved_places,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textViewTitle.setText(savedPlacesList.get(position).getTitle());
        holder.textViewSubTitle.setText(savedPlacesList.get(position).getSubTitle());
        holder.imageViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeInterface.deletePopup(v,position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return savedPlacesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewTitle,textViewSubTitle;
        public ImageView imageViewMore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle=itemView.findViewById(R.id.textViewTitle);
            textViewSubTitle=itemView.findViewById(R.id.textViewSubTitle);
            imageViewMore=itemView.findViewById(R.id.imageViewPopup);

        }
    }
    public interface PlaceInterface{
        void deletePopup(View view,int pos);
    }
}
