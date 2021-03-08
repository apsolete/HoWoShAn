package com.apsolete.myworkshop.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apsolete.myworkshop.db.entities.Equipment;
import com.apsolete.myworkshop.db.entities.Purchase;

import java.util.List;

@Dao
public abstract class PurchaseDao
{
    @Query("SELECT * FROM purchase")
    public abstract List<Purchase> getAllPurchases();
    @Insert
    public abstract long insertPurchase(Purchase equipment);
    @Update
    public abstract int updatePurchase(Purchase equipment);
    @Delete
    public abstract int deletePurchase(Purchase equipment);

}
