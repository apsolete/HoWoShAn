package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "equip_usage", foreignKeys = {@ForeignKey(entity = Project.class, parentColumns = "id", childColumns = "project_id"), @ForeignKey(entity = Equipment.class, parentColumns = "id", childColumns = "equip_id")})
public class EquipmentUsage
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo
    public int used;
    @ColumnInfo(index = true)
    public long project_id;
    @ColumnInfo(index = true)
    public long equip_id;
}
