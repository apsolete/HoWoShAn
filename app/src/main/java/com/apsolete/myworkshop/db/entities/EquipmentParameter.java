package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "equip_param", foreignKeys = {@ForeignKey(entity = EquipmentType.class, parentColumns = "id", childColumns = "type_id"), @ForeignKey(entity = Parameter.class, parentColumns = "id", childColumns = "param_id")})
public class EquipmentParameter
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo
    public String value;
    @ColumnInfo(index = true)
    public long type_id;
    @ColumnInfo(index = true)
    public long param_id;
}
