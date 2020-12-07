package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "etype",
        foreignKeys = @ForeignKey(entity = EqClass.class, parentColumns = "id", childColumns = "class_id"))
public class EqType
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long class_id;

    @ColumnInfo
    public String name;
}
