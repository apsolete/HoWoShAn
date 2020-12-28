package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.EquipClass;
import com.apsolete.myworkshop.db.entities.EquipType;
import com.apsolete.myworkshop.db.entities.Equipment;
import com.apsolete.myworkshop.db.entities.EquipmentInfo;
import com.apsolete.myworkshop.db.entities.EquipmentParam;

import java.util.List;

@Dao
public abstract class EquipmentDao
{
    @Query("SELECT * FROM equipclass")
    public abstract List<EquipClass> getAllEquipmentClasses();
    @Insert
    public abstract long insertEquipmentClass(EquipClass eqclass);
    @Update
    public abstract int updateEquipmentClass(EquipClass eqclass);
    @Delete
    public abstract int deleteEquipmentClass(EquipClass eqclass);

    @Query("SELECT * FROM equiptype")
    public abstract List<EquipType> getAllEquipmentTypes();
    @Insert
    public abstract long insertEquipmentType(EquipType eqtype);
    @Update
    public abstract int updateEquipmentType(EquipType eqtype);
    @Delete
    public abstract int deleteEquipmentType(EquipType eqtype);

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

    @Query("SELECT ec.name AS classname, et.name AS typename, eq.name, eq.manufacturer, eq.number, " +
            "ws.name AS workshop, st.name AS storage " +
            "FROM equipment AS eq " +
            "INNER JOIN equiptype AS et ON eq.type_id = et.id " +
            "INNER JOIN equipclass AS ec ON et.class_id = ec.id " +
            "INNER JOIN storage AS st ON eq.stor_id = st.id " +
            "INNER JOIN workshop AS ws ON ws.id = :workshopId AND st.ws_id = ws.id")
    public abstract List<EquipmentInfo> getEquipmentByWorkshop(long workshopId);
}
