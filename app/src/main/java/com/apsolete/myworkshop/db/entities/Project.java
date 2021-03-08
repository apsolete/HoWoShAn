package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "project",
        foreignKeys = @ForeignKey(entity = Workshop.class, parentColumns = "id", childColumns = "ws_id"))
public class Project
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long ws_id;

    @ColumnInfo
    public String name;
    @ColumnInfo
    public String description;
}
