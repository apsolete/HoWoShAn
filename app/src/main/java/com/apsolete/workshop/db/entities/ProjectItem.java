package com.apsolete.workshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "projectitem",
        foreignKeys = @ForeignKey(entity = Project.class, parentColumns = "id", childColumns = "proj_id"))
public class ProjectItem
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long proj_id;
}
