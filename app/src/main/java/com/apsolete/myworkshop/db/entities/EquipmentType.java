package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "equip_type", foreignKeys = @ForeignKey(entity = EquipmentClass.class, parentColumns = "id", childColumns = "class_id"))
public class EquipmentType
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo
    public String name;
    @ColumnInfo(index = true)
    public long class_id;
}
