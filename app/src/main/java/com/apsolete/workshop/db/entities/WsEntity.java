package com.apsolete.workshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "entity",
        foreignKeys = {
                @ForeignKey(entity = WsEntityClass.class, parentColumns = "id", childColumns = "class_id"),
                @ForeignKey(entity = Workshop.class, parentColumns = "id", childColumns = "stor_id")})
public class WsEntity
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long class_id;
    @ColumnInfo(index = true)
    public long stor_id;

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
