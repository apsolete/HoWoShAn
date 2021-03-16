package com.apsolete.workshop.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.apsolete.workshop.common.Converters;
import com.apsolete.workshop.db.dao.EquipmentDao;
import com.apsolete.workshop.db.dao.ParameterDao;
import com.apsolete.workshop.db.dao.ProjectDao;
import com.apsolete.workshop.db.dao.WorkshopDao;
import com.apsolete.workshop.db.entities.EquipType;
import com.apsolete.workshop.db.entities.Equipment;
import com.apsolete.workshop.db.entities.EquipClass;
import com.apsolete.workshop.db.entities.EquipmentParam;
import com.apsolete.workshop.db.entities.EquipKind;
import com.apsolete.workshop.db.entities.ParameterSet;
import com.apsolete.workshop.db.entities.ProjectEquipments;
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
        EquipType.class,
        EquipClass.class,
        EquipKind.class,
        ParameterSet.class,
        Equipment.class,
        EquipmentParam.class,
        ProjectEquipments.class,
        Workshop.class,
        Project.class,
        Purchase.class,
        Storage.class,
        ProjectItem.class})
@TypeConverters({Converters.class})
public abstract class WorkshopDatabase extends RoomDatabase
{
    public abstract WorkshopDao workshopDao();
    public abstract EquipmentDao equipmentDao();
    public abstract ProjectDao projectDao();
    public abstract ParameterDao parameterDao();
}
