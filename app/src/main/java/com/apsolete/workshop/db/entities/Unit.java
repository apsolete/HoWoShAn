package com.apsolete.workshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "unit")
public class Unit
{
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo
    public String symbol;
    @ColumnInfo
    public String name;
    //@ColumnInfo
    //public String description;
}
