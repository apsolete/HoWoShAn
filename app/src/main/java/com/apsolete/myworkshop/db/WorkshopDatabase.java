package com.apsolete.myworkshop.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.apsolete.myworkshop.db.dao.EquipmentDao;
import com.apsolete.myworkshop.db.dao.ParameterDao;
import com.apsolete.myworkshop.db.dao.ProjectDao;
import com.apsolete.myworkshop.db.dao.WorkshopDao;
import com.apsolete.myworkshop.db.entities.Equipment;
import com.apsolete.myworkshop.db.entities.EquipmentClass;
import com.apsolete.myworkshop.db.entities.EquipmentParameter;
import com.apsolete.myworkshop.db.entities.EquipmentType;
import com.apsolete.myworkshop.db.entities.EquipmentUsage;
import com.apsolete.myworkshop.db.entities.Parameter;
import com.apsolete.myworkshop.db.entities.Project;
import com.apsolete.myworkshop.db.entities.Unit;
import com.apsolete.myworkshop.db.entities.Workshop;


@Database(version = 1,
        entities = {
        Unit.class,
        Parameter.class,
        EquipmentClass.class,
        EquipmentType.class,
        Equipment.class,
        EquipmentParameter.class,
        EquipmentUsage.class,
        Workshop.class,
        Project.class})
public abstract class WorkshopDatabase extends RoomDatabase
{
    public abstract WorkshopDao workshopDao();
    public abstract EquipmentDao equipmentDao();
    public abstract ProjectDao projectDao();
    public abstract ParameterDao parameterDao();
}
