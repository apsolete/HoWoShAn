package com.apsolete.workshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "entityclass",
        foreignKeys = @ForeignKey(entity = WsEntityType.class, parentColumns = "id", childColumns = "type_id"))
public class WsEntityClass
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long type_id;
    @ColumnInfo
    public String name;
}
