package com.apsolete.workshop.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "equipkind",
        foreignKeys = @ForeignKey(entity = EquipClass.class, parentColumns = "id", childColumns = "class_id"))
public class EquipKind
{
    @PrimaryKey(autoGenerate = true)
    public long id;
    @ColumnInfo(index = true)
    public long class_id;

    @ColumnInfo
    public String name;
}
