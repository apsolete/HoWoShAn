package com.apsolete.myworkshop.ui.materials;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.AndroidViewModel;

public class MaterialsViewModel extends AndroidViewModel
{

    private MutableLiveData<String> mText;

    public MaterialsViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Materials and Accessories fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}