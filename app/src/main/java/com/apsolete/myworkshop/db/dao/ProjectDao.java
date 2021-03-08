package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.ProjectEquipments;
import com.apsolete.myworkshop.db.entities.Project;
import com.apsolete.myworkshop.db.entities.ProjectItem;

import java.util.List;

@Dao
public abstract class ProjectDao
{
    @Query("SELECT * FROM projectequipments")
    public abstract List<ProjectEquipments> getAllProjectEquipments();
    @Insert
    public abstract long insertProjectEquipment(ProjectEquipments prjEquips);
    @Update
    public abstract int updateProjectEquipment(ProjectEquipments prjEquips);
    @Delete
    public abstract int deleteProjectEquipment(ProjectEquipments prjEquips);

    @Query("SELECT * FROM projectitem")
    public abstract List<ProjectItem> getAllProjectItems();
    @Insert
    public abstract long insertProjectItem(ProjectItem prjItem);
    @Update
    public abstract int updateProjectItem(ProjectItem prjItem);
    @Delete
    public abstract int deleteProjectItem(ProjectItem prjItem);

    @Query("SELECT * FROM project")
    public abstract List<Project> getAllProjects();
    @Insert
    public abstract long insertProject(Project project);
    @Update
    public abstract int updateProject(Project project);
    @Delete
    public abstract int deleteProject(Project project);

}
