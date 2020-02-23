package com.apsolete.myworkshop.ui.tools;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.AndroidViewModel;

public class ToolsViewModel extends AndroidViewModel
{

    private MutableLiveData<String> mText;

    public ToolsViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Tools fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}