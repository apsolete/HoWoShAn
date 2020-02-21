package com.apsolete.myworkshop.db.entities;

import androidx.room.ColumnInfo;

public class EquipmentInfo
{
    @ColumnInfo(name = "ws_name")
    public String workshop;
    @ColumnInfo(name = "eq_class")
    public String eqClass;
    @ColumnInfo(name = "eq_type")
    public String eqType;
    public String name;
    public String manufacturer;
    public String description;
    public int amount;
    public String storage;
}
