package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.Project;
import com.apsolete.myworkshop.db.entities.Storage;
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

    @Query("SELECT * FROM project")
    public abstract List<Project> getAllProjects();
    @Query("SELECT * FROM project WHERE ws_id = :ws_id")
    public abstract List<Project> getProjectsByWorkshopId(long ws_id);
    @Insert
    public abstract long insertProject(Project project);
    @Update
    public abstract int updateProject(Project project);
    @Delete
    public abstract int deleteProject(Project project);

    @Query("SELECT * FROM storage")
    public abstract List<Storage> getAllStorages();
    @Query("SELECT * FROM storage WHERE ws_id = :ws_id")
    public abstract List<Storage> getStoragesByWorkshopId(long ws_id);
    @Insert
    public abstract long insertStorage(Storage storage);
    @Update
    public abstract int updateStorage(Storage storage);
    @Delete
    public abstract int deleteStorage(Storage storage);
}
