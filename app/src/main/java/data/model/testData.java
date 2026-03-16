package data.model;

// @author - Jason Brittain

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "testData")
public class testData {
    @NonNull
    @PrimaryKey(autoGenerate = true)

    public long id;
    public final int bloodSugar;


    /** test data object constructor **/
    public testData(int bloodSugar) {
        this.bloodSugar = bloodSugar;
    }



}
