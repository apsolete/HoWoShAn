package com.apsolete.workshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.workshop.db.entities.WsEntityClass;
import com.apsolete.workshop.db.entities.WsEntity;
import com.apsolete.workshop.db.entities.WsEntityInfo;
import com.apsolete.workshop.db.entities.WsEntityParam;
import com.apsolete.workshop.db.entities.WsEntityType;

import java.util.List;

@Dao
public abstract class WsEntityDao
{
    @Query("SELECT * FROM entityclass")
    public abstract List<WsEntityClass> getAllEntityClasses();
    @Insert
    public abstract long insertEntityClass(WsEntityClass eclass);
    @Update
    public abstract int updateEntityClass(WsEntityClass eclass);
    @Delete
    public abstract int deleteEntityClass(WsEntityClass eclass);

    @Query("SELECT * FROM entitytype")
    public abstract List<WsEntityType> getAllEntityTypes();
    @Insert
    public abstract long insertEntityType(WsEntityType etype);
    @Update
    public abstract int updateEntityType(WsEntityType etype);
    @Delete
    public abstract int deleteEntityType(WsEntityType etype);

    @Query("SELECT * FROM entityparam")
    public abstract List<WsEntityParam> getAllEquipmentParams();
    @Insert
    public abstract long insertEquipmentParam(WsEntityParam eqparam);
    @Update
    public abstract int updateEquipmentParam(WsEntityParam eqparam);
    @Delete
    public abstract int deleteEquipmentParam(WsEntityParam eqparam);

    @Query("SELECT * FROM entity")
    public abstract List<WsEntity> getAllEntities();
    @Insert
    public abstract long insertEntity(WsEntity wsEntity);
    @Update
    public abstract int updateEntity(WsEntity wsEntity);
    @Delete
    public abstract int deleteEntity(WsEntity wsEntity);

    @Query("SELECT et.name AS typename, ec.name AS classname, eq.name, eq.manufacturer, eq.number, " +
            "ws.name AS workshop, st.name AS storage " +
            "FROM entity AS eq " +
            "INNER JOIN entityclass AS ec ON eq.class_id = ec.id " +
            "INNER JOIN entitytype AS et ON ec.type_id = et.id " +
            "INNER JOIN storage AS st ON eq.stor_id = st.id " +
            "INNER JOIN workshop AS ws ON ws.id = :workshopId AND st.ws_id = ws.id")
    public abstract List<WsEntityInfo> getEntitiesByWorkshop(long workshopId);
}
