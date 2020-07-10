package in.org.weatherapp.view.fragment.location;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import in.org.weatherapp.R;
import in.org.weatherapp.view.database.SavedPlaces;
import in.org.weatherapp.view.database.SavedPlacesRepository;
import in.org.weatherapp.view.fragment.BaseFragment;
import in.org.weatherapp.view.fragment.location.adapter.SavedPlacesAdapter;
import in.org.weatherapp.view.utils.Constants;

import static android.app.Activity.RESULT_OK;

public class FragmentLocation extends BaseFragment implements
        SavedPlacesRepository.FetchSavedLocations,SavedPlacesAdapter.PlaceInterface {
  //declaring views
    TextView textViewCount;
    FloatingActionButton floatingActionButton;
    RecyclerView recyclerViewLocation;

    private List<SavedPlaces> savedPlacesList=new ArrayList<>();
    private SavedPlacesRepository.FetchSavedLocations fetchSavedLocations;
    private SavedPlaces savedPlaces;
    private SavedPlacesRepository savedPlacesRepository;
    private SavedPlacesAdapter savedPlacesAdapter;
    private SavedPlacesAdapter.PlaceInterface placeInterface;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_manage_location, container, false);
        recyclerViewLocation= view.findViewById(R.id.recyclerViewLocation);
        textViewCount=view.findViewById(R.id.textViewCount);
        floatingActionButton=view.findViewById(R.id.flattingBtnAddLocation);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onViewClicked();
            }
        });
        Places.initialize(getActivity(), Constants.PLACES_API_KEY);
        PlacesClient placesClient= Places.createClient(getActivity());
        savedPlacesRepository=new SavedPlacesRepository(getActivity());
        fetchSavedLocations=this;
        placeInterface=this;
        recyclerViewLocation.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        return view;

    }

    public void onViewClicked() {


        List<Place.Field> fields= Arrays.asList(Place.Field.LAT_LNG,Place.Field.NAME,Place.Field.ID,Place.Field.ADDRESS);
        if(savedPlacesList.size()<10) {
            Intent intent = new Autocomplete.IntentBuilder(AutocompleteActivityMode.FULLSCREEN, fields).build(getActivity());
            startActivityForResult(intent, Constants.AUTO_COMPLETE_REQUEST_CODE);
        }
        else
        {
           Toast toast=Toast.makeText(getActivity(),"you can not add more than 10 locations",Toast.LENGTH_SHORT);
           toast.show();

        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==Constants.AUTO_COMPLETE_REQUEST_CODE){
            if(resultCode==RESULT_OK){
                Place place=Autocomplete.getPlaceFromIntent(data);
                insertIntoDB(place);
            }
        }
    }

    private void insertIntoDB(Place place) {
        savedPlaces=new SavedPlaces();
        savedPlaces.setLatitude(String.valueOf(place.getLatLng().latitude));
        savedPlaces.setLongitude(String.valueOf(place.getLatLng().longitude));
        savedPlaces.setTitle(place.getName());
        savedPlaces.setSubTitle(place.getAddress());
        savedPlacesRepository.insertTask(savedPlaces);

    }

    @Override
    public void onResume() {
        super.onResume();
        savedPlacesRepository.getTasks(fetchSavedLocations);
    }

    @Override
    public void savedPlaces(List<SavedPlaces> savedPlaces) {

        savedPlacesList=savedPlaces;
        if(savedPlaces!=null)
        {
            setAdapter();
            textViewCount.setText(savedPlacesList.size()+"/10");
        }

    }

    private void setAdapter() {
        savedPlacesAdapter=new SavedPlacesAdapter(savedPlacesList,placeInterface);
        recyclerViewLocation.setAdapter(savedPlacesAdapter);
    }

    @Override
    public void deletePopup(View view, int pos) {
        showDeletePopup(view,pos);

    }

    private void showDeletePopup(View view, int pos) {
        PopupMenu popupMenu=new PopupMenu(getActivity(),view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                int id=item.getItemId();
                switch (id){
                    case R.id.item_delete:
                        savedPlacesRepository.deleteTask(String.valueOf(savedPlacesList.get(pos).getId()));
                        savedPlacesRepository.getTasks(fetchSavedLocations);
                        popupMenu.dismiss();
                        break;
                    case R.id.item_cancel:
                        popupMenu.dismiss();
                        break;
                }
                return true;
            }
        });
        popupMenu.inflate(R.menu.menu_delete_popup);
        popupMenu.show();
    }
}
