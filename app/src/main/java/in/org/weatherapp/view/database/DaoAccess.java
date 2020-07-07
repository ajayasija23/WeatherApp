package in.org.weatherapp.view.database;

import in.org.weatherapp.view.database.SavedPlaces;
import java.util.List;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
@Dao
public interface DaoAccess {

    @Insert
    Long insertTask (SavedPlaces savedPlaces);

    @Query("SELECT * FROM SavedPlaces ORDER BY created_at desc")
    List<SavedPlaces> retrieveAllTask();

    @Query("DELETE FROM SavedPlaces WHERE id= :id")
    public void deletById(String id);

}
