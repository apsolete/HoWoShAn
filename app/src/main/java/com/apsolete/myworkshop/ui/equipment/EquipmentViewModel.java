package com.apsolete.myworkshop.ui.equipment;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.apsolete.customui.CustomViewModel;

public class EquipmentViewModel extends CustomViewModel
{

    private MutableLiveData<String> mText;

    public EquipmentViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Equipment fragment");
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