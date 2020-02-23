package com.apsolete.myworkshop.ui.home;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.AndroidViewModel;

public class HomeViewModel extends AndroidViewModel
{

    private MutableLiveData<String> mText;

    public HomeViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Home fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}