package data.model;

// @author - Jason Brittain

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NonNls;

@Entity(tableName = "food")
public class food {

    @PrimaryKey
    @NonNull
    public final String foodName;
    public final int gramCarbs;
    public final int gramProtein;
    public final int gramFat;
    public final int gramFiber;
    public final int gramNetCarbs;

    /** food object constructor **/
    public food(@NonNull String foodName, int gramCarbs, int gramFat, int gramFiber, int gramProtein) {
        this.foodName = foodName;
        this.gramCarbs = gramCarbs;
        this.gramFat = gramFat;
        this.gramFiber = gramFiber;
        this.gramProtein = gramProtein;
        this.gramNetCarbs = gramCarbs - (gramFiber + gramProtein);
    }



}