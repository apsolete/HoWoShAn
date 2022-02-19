package com.apsolete.workshop.ui.wsentity;

import android.app.Application;

import com.apsolete.customui.CustomViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class EquipmentsViewModel extends CustomViewModel
{

    private MutableLiveData<String> mText;

    public EquipmentsViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is WsEntity fragment");
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