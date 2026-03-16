package data.database;

//@author - Jason Brittain

import androidx.room.Dao;
import androidx.room.Insert;
import data.model.testData;

@Dao
public interface dataDAO {
    @Insert
    long insert(testData dataEntry);

}
