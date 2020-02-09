package com.apsolete.myworkshop.ui.workshop;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkshopViewModel extends ViewModel
{
    private MutableLiveData<String> mText = new MutableLiveData<>();

    public WorkshopViewModel()
    {
        mText.setValue("This is Workshop fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}
