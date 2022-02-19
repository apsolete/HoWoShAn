package com.apsolete.workshop.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.apsolete.workshop.common.Converters;
import com.apsolete.workshop.db.dao.WsEntityDao;
import com.apsolete.workshop.db.dao.ParameterDao;
import com.apsolete.workshop.db.dao.ProjectDao;
import com.apsolete.workshop.db.dao.WorkshopDao;
import com.apsolete.workshop.db.entities.ProjectEntities;
import com.apsolete.workshop.db.entities.WsEntity;
import com.apsolete.workshop.db.entities.WsEntityClass;
import com.apsolete.workshop.db.entities.WsEntityParam;
import com.apsolete.workshop.db.entities.WsEntityType;
import com.apsolete.workshop.db.entities.ParameterSet;
import com.apsolete.workshop.db.entities.Parameter;
import com.apsolete.workshop.db.entities.Project;
import com.apsolete.workshop.db.entities.ProjectItem;
import com.apsolete.workshop.db.entities.Purchase;
import com.apsolete.workshop.db.entities.Storage;
import com.apsolete.workshop.db.entities.Unit;
import com.apsolete.workshop.db.entities.Workshop;

@Database(version = 1,
        entities = {
        Unit.class,
        Parameter.class,
        WsEntityType.class,
        WsEntityClass.class,
        ParameterSet.class,
        WsEntity.class,
        WsEntityParam.class,
        ProjectEntities.class,
        Workshop.class,
        Project.class,
        Purchase.class,
        Storage.class,
        ProjectItem.class})
@TypeConverters({Converters.class})
public abstract class WorkshopDatabase extends RoomDatabase
{
    public abstract WorkshopDao workshopDao();
    public abstract WsEntityDao equipmentDao();
    public abstract ProjectDao projectDao();
    public abstract ParameterDao parameterDao();
}
