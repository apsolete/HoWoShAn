package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "equipclass",
        foreignKeys = @ForeignKey(entity = EquipType.class, parentColumns = "id", childColumns = "type_id"))
public class EquipClass
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long type_id;
    @ColumnInfo
    public String name;
}
