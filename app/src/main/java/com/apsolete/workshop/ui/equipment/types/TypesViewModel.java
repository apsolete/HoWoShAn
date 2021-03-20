package com.apsolete.workshop.ui.equipment.types;

import android.app.Application;

import com.apsolete.customui.CustomViewModel;
import com.apsolete.workshop.db.entities.EquipType;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class TypesViewModel extends CustomViewModel
{
    private MutableLiveData<List<EquipType>> mEquipTypes;
    public LiveData<List<EquipType>> getEquipTypes()
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

    }

    //@Override
    public void load()
    {
        mEquipTypes.setValue(new ArrayList<EquipType>());
    }
}
