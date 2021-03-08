package com.apsolete.myworkshop.ui.hardware;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.apsolete.customui.CustomViewModel;

public class HardwareViewModel extends CustomViewModel
{

    private MutableLiveData<String> mText;

    public HardwareViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Hardware fragment");
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