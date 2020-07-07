package in.org.weatherapp.view.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {SavedPlaces.class},version = 1,exportSchema = false)
public abstract class SavedPlacesDataBase extends RoomDatabase {
    public abstract DaoAccess daoAccess();
}
