package com.apsolete.workshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "projecteentities",
        foreignKeys = {
                @ForeignKey(entity = ProjectItem.class, parentColumns = "id", childColumns = "pritem_id"),
                @ForeignKey(entity = WsEntity.class, parentColumns = "id", childColumns = "equip_id")})
public class ProjectEntities
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long pritem_id;
    @ColumnInfo(index = true)
    public long equip_id;

    @ColumnInfo
    public int number;
    @ColumnInfo
    public boolean expend;
    @ColumnInfo
    public boolean expended;
    @ColumnInfo
    public String description;
}
