package com.apsolete.workshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.workshop.db.entities.ParameterSet;
import com.apsolete.workshop.db.entities.Parameter;
import com.apsolete.workshop.db.entities.Unit;

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

    @Query("SELECT * FROM parameterset WHERE param_id = :paramId")
    public abstract List<ParameterSet> getParamSet(long paramId);
    @Insert
    public abstract long insertParamSet(ParameterSet parameterSet);
    @Update
    public abstract int updateParamSet(ParameterSet parameterSet);
    @Delete
    public abstract int deleteParamSet(ParameterSet parameterSet);
}
