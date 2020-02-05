package com.apsolete.myworkshop.ui.materials;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MaterialsViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public MaterialsViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is Materials and Accessories fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}