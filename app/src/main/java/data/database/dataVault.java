package data.database;

//@author - Jason Brittain

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "vaultData",
        indices = {@Index(value = "entryDate"),
                   @Index(value = "type = refID")}
)

public class dataVault {
    public static final int type_food = 1;
    public static final int type_data = 2;

    @PrimaryKey(autoGenerate = true)
    public long idx;
    public long entryDate;
    public int type;
    public long refID;

    public dataVault(long entryDate, int type, int refID){
        this.entryDate = entryDate;
        this.type = type;
        this.refID = refID;
    }

}
