package com.apsolete.workshop.ui.workshop;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.apsolete.customui.CustomViewModel;

public class WorkshopViewModel extends CustomViewModel
{
    private MutableLiveData<String> mText = new MutableLiveData<>();

    public WorkshopViewModel(Application application)
    {
        super(application);
        mText.setValue("This is Workshop fragment");
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
