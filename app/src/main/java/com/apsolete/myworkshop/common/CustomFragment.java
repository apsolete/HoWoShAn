package com.apsolete.myworkshop.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

public abstract class CustomFragment<VM extends AndroidViewModel> extends Fragment
{
    protected View mRootView;
    protected VM mViewModel;

    public CustomFragment(@LayoutRes int contentLayoutId)
    {
        super(contentLayoutId);
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
//    {
//        mRootView = super.onCreateView(inflater, container, savedInstanceState);
//        return mRootView;
//    }

    protected View createView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState, @NonNull Class<VM> modelClass)
    {
        mRootView = super.onCreateView(inflater, container, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(modelClass);
        return mRootView;
    }

    protected void initTextView(@IdRes int id, LiveData<String> data, CustomObserver<TextView, String> observer)
    {
        TextView textView = mRootView.findViewById(id);
        observer.setView(textView);
        data.observe(getViewLifecycleOwner(), observer);
    }
}
