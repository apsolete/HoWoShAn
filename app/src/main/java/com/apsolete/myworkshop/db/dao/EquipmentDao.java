package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.Equipment;
import com.apsolete.myworkshop.db.entities.EquipmentClass;
import com.apsolete.myworkshop.db.entities.EquipmentInfo;
import com.apsolete.myworkshop.db.entities.EquipmentParameter;
import com.apsolete.myworkshop.db.entities.EquipmentType;

import java.util.List;

@Dao
public abstract class EquipmentDao
{
    @Query("SELECT * FROM equip_class")
    public abstract List<EquipmentClass> getAllEquipmentClasses();
    @Insert
    public abstract long insertEquipmentClass(EquipmentClass eqclass);
    @Update
    public abstract int updateEquipmentClass(EquipmentClass eqclass);
    @Delete
    public abstract int deleteEquipmentClass(EquipmentClass eqclass);

    @Query("SELECT * FROM equip_type")
    public abstract List<EquipmentType> getAllEquipmentTypes();
    @Insert
    public abstract long insertEquipmentType(EquipmentType eqtype);
    @Update
    public abstract int updateEquipmentType(EquipmentType eqtype);
    @Delete
    public abstract int deleteEquipmentType(EquipmentType eqtype);

    @Query("SELECT * FROM equip_param")
    public abstract List<EquipmentParameter> getAllEquipmentParameters();
    @Insert
    public abstract long insertEquipmentParameter(EquipmentParameter eqparam);
    @Update
    public abstract int updateEquipmentParameter(EquipmentParameter eqparam);
    @Delete
    public abstract int deleteEquipmentParameter(EquipmentParameter eqparam);

    @Query("SELECT * FROM equipment")
    public abstract List<Equipment> getAllEquipments();
    @Insert
    public abstract long insertEquipment(Equipment equipment);
    @Update
    public abstract int updateEquipment(Equipment equipment);
    @Delete
    public abstract int deleteEquipment(Equipment equipment);

    @Query("SELECT workshop.name AS ws_name, equip_class.name AS eq_class, equip_type.name AS eq_type, "+
           "equipment.name, equipment.description, equipment.manufacturer, equipment.amount, equipment.storage "+
           "FROM workshop, equip_class, equip_type, equipment "+
           "WHERE workshop.id = :workshopId AND equipment.ws_id = :workshopId AND "+
           "equipment.type_id = equip_type.id AND equip_type.class_id == equip_class.id")
    public abstract List<EquipmentInfo> getEquipmentByWorkshop(long workshopId);
}
