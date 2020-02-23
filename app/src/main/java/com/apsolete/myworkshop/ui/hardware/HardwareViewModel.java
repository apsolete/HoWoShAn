package com.apsolete.myworkshop.ui.hardware;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.AndroidViewModel;

public class HardwareViewModel extends AndroidViewModel
{

    private MutableLiveData<String> mText;

    public HardwareViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Hardware fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}