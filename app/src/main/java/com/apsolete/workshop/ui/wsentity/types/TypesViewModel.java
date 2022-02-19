package com.apsolete.workshop.ui.wsentity.types;

import android.app.Application;

import com.apsolete.customui.CustomViewModel;
import com.apsolete.workshop.db.entities.WsEntityType;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class TypesViewModel extends CustomViewModel
{
    private MutableLiveData<List<WsEntityType>> mEquipTypes;
    public LiveData<List<WsEntityType>> getEquipTypes()
    {
        if (mEquipTypes == null)
        {
            mEquipTypes = new MutableLiveData<>();
            load();
        }
        return mEquipTypes;
    }

    public TypesViewModel(@NonNull Application application)
    {
        super(application);
    }

    @Override
    public void start()
    {
        load();
    }

    //@Override
    public void load()
    {
        ArrayList<WsEntityType> types = new ArrayList<WsEntityType>();
        WsEntityType t1 = new WsEntityType();
        t1.id = 1;
        t1.name = "type 1";
        t1.description = "description type 1";
        types.add(t1);
        t1 = new WsEntityType();
        t1.id = 2;
        t1.name = "type 2";
        t1.description = "description type 2";
        types.add(t1);
        t1 = new WsEntityType();
        t1.id = 3;
        t1.name = "type 3";
        t1.description = "description type 3";
        types.add(t1);
        mEquipTypes.setValue(types);
    }
}
