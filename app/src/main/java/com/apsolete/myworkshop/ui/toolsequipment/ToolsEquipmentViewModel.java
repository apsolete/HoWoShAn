package com.apsolete.myworkshop.ui.toolsequipment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToolsEquipmentViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public ToolsEquipmentViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is Tools and Equipment fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}