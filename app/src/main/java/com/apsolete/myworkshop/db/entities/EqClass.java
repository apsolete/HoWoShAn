package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "equip_class")
public class EqClass
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo
    public String name;
}
