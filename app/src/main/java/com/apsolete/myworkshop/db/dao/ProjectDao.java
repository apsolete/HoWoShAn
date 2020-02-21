package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.EquipmentUsage;
import com.apsolete.myworkshop.db.entities.Project;

import java.util.List;

@Dao
public abstract class ProjectDao
{
    @Query("SELECT * FROM equip_usage")
    public abstract List<EquipmentUsage> getAllEquipmentUsages();
    @Insert
    public abstract long insertEquipmentUsage(EquipmentUsage equsage);
    @Update
    public abstract int updateEquipmentUsage(EquipmentUsage equsage);
    @Delete
    public abstract int deleteEquipmentUsage(EquipmentUsage equsage);

    @Query("SELECT * FROM project")
    public abstract List<Project> getAllProjects();
    @Insert
    public abstract long insertProject(Project project);
    @Update
    public abstract int updateProject(Project project);
    @Delete
    public abstract int deleteProject(Project project);

}
