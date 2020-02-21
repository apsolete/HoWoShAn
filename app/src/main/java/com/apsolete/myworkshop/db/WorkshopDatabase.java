package com.apsolete.myworkshop.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.apsolete.myworkshop.db.entities.Equipment;
import com.apsolete.myworkshop.db.entities.EquipmentClass;
import com.apsolete.myworkshop.db.entities.EquipmentParameter;
import com.apsolete.myworkshop.db.entities.EquipmentType;
import com.apsolete.myworkshop.db.entities.EquipmentUsed;
import com.apsolete.myworkshop.db.entities.Parameter;
import com.apsolete.myworkshop.db.entities.Project;
import com.apsolete.myworkshop.db.entities.Unit;
import com.apsolete.myworkshop.db.entities.Workshop;

@Database(entities = {Unit.class, Parameter.class, EquipmentClass.class, EquipmentType.class, Equipment.class, EquipmentParameter.class, EquipmentUsed.class, Workshop.class, Project.class}, version = 1)
public abstract class WorkshopDatabase extends RoomDatabase
{
}
