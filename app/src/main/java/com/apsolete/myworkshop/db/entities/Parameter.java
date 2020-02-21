package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "parameter", foreignKeys = @ForeignKey(entity = Unit.class, parentColumns = "id", childColumns = "unit_id"))
public class Parameter
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo
    public String name;
    @ColumnInfo
    public String description;
    @ColumnInfo(index = true)
    public long unit_id;
}
