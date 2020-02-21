package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "equip_used", foreignKeys = {@ForeignKey(entity = Project.class, parentColumns = "id", childColumns = "project_id"), @ForeignKey(entity = Equipment.class, parentColumns = "id", childColumns = "equip_id")})
public class EquipmentUsed
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo
    public int used;
    @ColumnInfo
    public long project_id;
    @ColumnInfo
    public long equip_id;
}
