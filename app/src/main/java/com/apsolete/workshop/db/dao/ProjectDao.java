package com.apsolete.workshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.workshop.db.entities.ProjectEntities;
import com.apsolete.workshop.db.entities.Project;
import com.apsolete.workshop.db.entities.ProjectItem;

import java.util.List;

@Dao
public abstract class ProjectDao
{
    @Query("SELECT * FROM projecteentities")
    public abstract List<ProjectEntities> getAllProjectEntities();
    @Insert
    public abstract long insertProjectEntities(ProjectEntities prjEquips);
    @Update
    public abstract int updateProjectEntities(ProjectEntities prjEquips);
    @Delete
    public abstract int deleteProjectEntities(ProjectEntities prjEquips);

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
