package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.EqClass;
import com.apsolete.myworkshop.db.entities.EqType;
import com.apsolete.myworkshop.db.entities.Equipment;
import com.apsolete.myworkshop.db.entities.EquipmentInfo;
import com.apsolete.myworkshop.db.entities.EquipmentParam;

import java.util.List;

@Dao
public abstract class EquipmentDao
{
    @Query("SELECT * FROM equip_class")
    public abstract List<EqClass> getAllEquipmentClasses();
    @Insert
    public abstract long insertEquipmentClass(EqClass eqclass);
    @Update
    public abstract int updateEquipmentClass(EqClass eqclass);
    @Delete
    public abstract int deleteEquipmentClass(EqClass eqclass);

    @Query("SELECT * FROM equip_type")
    public abstract List<EqType> getAllEquipmentTypes();
    @Insert
    public abstract long insertEquipmentType(EqType eqtype);
    @Update
    public abstract int updateEquipmentType(EqType eqtype);
    @Delete
    public abstract int deleteEquipmentType(EqType eqtype);

    @Query("SELECT * FROM equip_param")
    public abstract List<EquipmentParam> getAllEquipmentParams();
    @Insert
    public abstract long insertEquipmentParam(EquipmentParam eqparam);
    @Update
    public abstract int updateEquipmentParam(EquipmentParam eqparam);
    @Delete
    public abstract int deleteEquipmentParam(EquipmentParam eqparam);

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
