package com.apsolete.myworkshop.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.apsolete.myworkshop.common.Converters;
import com.apsolete.myworkshop.db.dao.EquipmentDao;
import com.apsolete.myworkshop.db.dao.ParameterDao;
import com.apsolete.myworkshop.db.dao.ProjectDao;
import com.apsolete.myworkshop.db.dao.WorkshopDao;
import com.apsolete.myworkshop.db.entities.Equipment;
import com.apsolete.myworkshop.db.entities.EqClass;
import com.apsolete.myworkshop.db.entities.EquipmentParam;
import com.apsolete.myworkshop.db.entities.EqType;
import com.apsolete.myworkshop.db.entities.ParamSet;
import com.apsolete.myworkshop.db.entities.ProjectEquipment;
import com.apsolete.myworkshop.db.entities.Parameter;
import com.apsolete.myworkshop.db.entities.Project;
import com.apsolete.myworkshop.db.entities.Purchase;
import com.apsolete.myworkshop.db.entities.Storage;
import com.apsolete.myworkshop.db.entities.Unit;
import com.apsolete.myworkshop.db.entities.Workshop;

@Database(version = 1,
        entities = {
        Unit.class,
        Parameter.class,
        EqClass.class,
        EqType.class,
        ParamSet.class,
        Equipment.class,
        EquipmentParam.class,
        ProjectEquipment.class,
        Workshop.class,
        Project.class,
        Purchase.class,
        Storage.class})
@TypeConverters({Converters.class})
public abstract class WorkshopDatabase extends RoomDatabase
{
    public abstract WorkshopDao workshopDao();
    public abstract EquipmentDao equipmentDao();
    public abstract ProjectDao projectDao();
    public abstract ParameterDao parameterDao();
}
