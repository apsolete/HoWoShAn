package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.Parameter;
import com.apsolete.myworkshop.db.entities.Unit;

import java.util.List;

@Dao
public abstract class ParameterDao
{
    @Query("SELECT * FROM unit")
    public abstract List<Unit> getAllUnits();
    @Insert
    public abstract long insertUnit(Unit unit);
    @Update
    public abstract int updateUnit(Unit unit);
    @Delete
    public abstract int deleteUnit(Unit unit);

    @Query("SELECT * FROM parameter")
    public abstract List<Parameter> getAllParameter();
    @Insert
    public abstract long insertParameter(Parameter param);
    @Update
    public abstract int updateParameter(Parameter param);
    @Delete
    public abstract int deleteParameter(Parameter param);
}
