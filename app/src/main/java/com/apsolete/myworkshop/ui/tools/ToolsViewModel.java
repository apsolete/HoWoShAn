package com.apsolete.myworkshop.ui.tools;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.apsolete.customui.CustomViewModel;

public class ToolsViewModel extends CustomViewModel
{

    private MutableLiveData<String> mText;

    public ToolsViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Tools fragment");
    }

    @Override
    public void start()
    {

    }

    public LiveData<String> getText()
    {
        return mText;
    }
}