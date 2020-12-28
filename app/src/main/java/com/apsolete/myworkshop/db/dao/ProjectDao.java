package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.ProjectEquipments;
import com.apsolete.myworkshop.db.entities.Project;

import java.util.List;

@Dao
public abstract class ProjectDao
{
    @Query("SELECT * FROM projequipments")
    public abstract List<ProjectEquipments> getAllProjectEquipments();
    @Insert
    public abstract long insertProjectEquipment(ProjectEquipments equsage);
    @Update
    public abstract int updateProjectEquipment(ProjectEquipments equsage);
    @Delete
    public abstract int deleteProjectEquipment(ProjectEquipments equsage);

    @Query("SELECT * FROM project")
    public abstract List<Project> getAllProjects();
    @Insert
    public abstract long insertProject(Project project);
    @Update
    public abstract int updateProject(Project project);
    @Delete
    public abstract int deleteProject(Project project);

}
