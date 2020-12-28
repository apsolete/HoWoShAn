package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "equipment",
        foreignKeys = {
                @ForeignKey(entity = EquipType.class, parentColumns = "id", childColumns = "type_id"),
                @ForeignKey(entity = Workshop.class, parentColumns = "id", childColumns = "stor_id")})
public class Equipment
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long stor_id;
    @ColumnInfo(index = true)
    public long type_id;

    @ColumnInfo
    public String name;
    @ColumnInfo
    public String manufacturer;
    @ColumnInfo
    public String description;
    @ColumnInfo
    public int number;
    @ColumnInfo
    public String storage;
}
