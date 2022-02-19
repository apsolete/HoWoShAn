package com.apsolete.workshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "parameterset",
        foreignKeys = {
                @ForeignKey(entity = WsEntityClass.class, parentColumns = "id", childColumns = "class_id"),
                @ForeignKey(entity = Parameter.class, parentColumns = "id", childColumns = "param_id")})
public class ParameterSet
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long class_id;
    @ColumnInfo(index = true)
    public long param_id;

    @ColumnInfo
    public String name;
}
