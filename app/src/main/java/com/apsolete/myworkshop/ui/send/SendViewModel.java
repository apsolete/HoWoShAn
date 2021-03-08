package com.apsolete.myworkshop.ui.send;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.apsolete.customui.CustomViewModel;

public class SendViewModel extends CustomViewModel
{

    private MutableLiveData<String> mText;

    public SendViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
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