package com.apsolete.myworkshop.ui.send;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.AndroidViewModel;

public class SendViewModel extends AndroidViewModel
{

    private MutableLiveData<String> mText;

    public SendViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}