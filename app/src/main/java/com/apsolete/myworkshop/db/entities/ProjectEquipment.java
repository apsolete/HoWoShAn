package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "project_equip",
        foreignKeys = {
                @ForeignKey(entity = Project.class, parentColumns = "id", childColumns = "project_id"),
                @ForeignKey(entity = Equipment.class, parentColumns = "id", childColumns = "equip_id")})
public class ProjectEquipment
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long project_id;
    @ColumnInfo(index = true)
    public long equip_id;

    @ColumnInfo
    public int number;
    @ColumnInfo
    public boolean expend;
}
