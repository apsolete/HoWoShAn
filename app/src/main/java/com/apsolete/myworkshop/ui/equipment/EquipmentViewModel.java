package com.apsolete.myworkshop.ui.equipment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EquipmentViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public EquipmentViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is Equipment fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}