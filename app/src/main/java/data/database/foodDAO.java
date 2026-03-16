package data.database;

//@author - Jason Brittain

import androidx.room.Dao;
import androidx.room.Insert;
import data.model.food;

@Dao
public interface foodDAO {
    @Insert
    long insert(food foodEntry);
}
