package com.apsolete.workshop.ui.materials;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.apsolete.customui.CustomViewModel;

public class MaterialsViewModel extends CustomViewModel
{

    private MutableLiveData<String> mText;

    public MaterialsViewModel(Application application)
    {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("This is Materials and Accessories fragment");
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