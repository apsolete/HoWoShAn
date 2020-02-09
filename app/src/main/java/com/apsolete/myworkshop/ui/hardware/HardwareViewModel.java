package com.apsolete.myworkshop.ui.hardware;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HardwareViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public HardwareViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is Hardware fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}