package in.org.weatherapp.view.database;

import android.content.Context;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Room;

public class SavedPlacesRepository {

    private String DB_NAME="location_db";
    private List<SavedPlaces> savedPlacesList=new ArrayList<>();
    private SavedPlacesDataBase savedPlacesDataBase;
    private FetchSavedLocations fetchSavedLocations;

    public SavedPlacesRepository(Context context){


        savedPlacesDataBase= Room.databaseBuilder(context,SavedPlacesDataBase.class,DB_NAME).build();

    }
    public void insertTask(final SavedPlaces savedPlaces){
        new AsyncTask<Void,Void,Long>(){

            @Override
            protected Long doInBackground(Void... voids) {
                return savedPlacesDataBase.daoAccess().insertTask(savedPlaces);
            }
        }.execute();

    }
    public void deleteTask(String key)
    {
        new AsyncTask<Void,Void,Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                savedPlacesDataBase.daoAccess().deletById(key);
                return null;
            }
        }.execute();
    }
    public void getTasks(FetchSavedLocations fetchSavedLocations){
        this.fetchSavedLocations=fetchSavedLocations;
        new AsyncTask<Void,Void,List<SavedPlaces>>(){


            @Override
            protected List<SavedPlaces> doInBackground(Void... voids) {
                savedPlacesList= savedPlacesDataBase.daoAccess().retrieveAllTask();
                return savedPlacesList;
            }

            @Override
            protected void onPostExecute(List<SavedPlaces> savedPlaces) {
                super.onPostExecute(savedPlaces);
                fetchSavedLocations.savedPlaces(savedPlaces);
            }
        }.execute();

    }
    public interface FetchSavedLocations{

        void savedPlaces(List<SavedPlaces> savedPlaces);
    }

}
