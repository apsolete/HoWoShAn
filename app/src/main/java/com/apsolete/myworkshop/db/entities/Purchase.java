package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "purchase",
        foreignKeys = @ForeignKey(entity = Equipment.class, parentColumns = "id", childColumns = "equip_id"))
public class Purchase
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long equip_id;

    @ColumnInfo
    public int number;
    @ColumnInfo
    public double price;
    @ColumnInfo
    public double peritem;
    @ColumnInfo
    public boolean append;
    @ColumnInfo
    public Date created;
    @ColumnInfo
    public Date payed;
}
