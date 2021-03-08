package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "equip_param",
        foreignKeys = {
                @ForeignKey(entity = Equipment.class, parentColumns = "id", childColumns = "equip_id"),
                @ForeignKey(entity = ParameterSet.class, parentColumns = "id", childColumns = "parset_id")})
public class EquipmentParam
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long equip_id;
    @ColumnInfo(index = true)
    public long parset_id;

    @ColumnInfo
    public String value;
}
