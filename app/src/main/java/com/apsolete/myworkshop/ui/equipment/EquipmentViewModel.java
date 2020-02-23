package com.apsolete.myworkshop.ui.equipment;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.AndroidViewModel;

public class EquipmentViewModel extends AndroidViewModel
{

    private MutableLiveData<String> mText;

    public EquipmentViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Equipment fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}