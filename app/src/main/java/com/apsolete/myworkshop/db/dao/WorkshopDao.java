package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.Workshop;

import java.util.List;

@Dao
public abstract class WorkshopDao
{
    @Query("SELECT * FROM workshop")
    public abstract List<Workshop> getAllWorkshops();
    @Insert
    public abstract long insertWorkshop(Workshop workshop);
    @Update
    public abstract int updateWorkshop(Workshop workshop);
    @Delete
    public abstract int deleteWorkshop(Workshop workshop);
}
