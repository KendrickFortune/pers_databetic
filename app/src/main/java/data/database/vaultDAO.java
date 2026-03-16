package data.database;

//@author - Jason Brittain

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import data.database.dataVault;

public interface vaultDAO {

    @Insert
    long insert(dataVault vaultEntry);

    @Query("SELECT * FROM vaultEntry ORDER BY entryDate DESC");
    LiveData<List<vaultEntry>> getFeed();
}
