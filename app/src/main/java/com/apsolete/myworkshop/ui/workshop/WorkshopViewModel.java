package com.apsolete.myworkshop.ui.workshop;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.AndroidViewModel;

public class WorkshopViewModel extends AndroidViewModel
{
    private MutableLiveData<String> mText = new MutableLiveData<>();

    public WorkshopViewModel(Application application)
    {
        super(application);
        mText.setValue("This is Workshop fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}
