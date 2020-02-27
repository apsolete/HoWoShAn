package com.apsolete.myworkshop.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.apsolete.myworkshop.R;
import com.apsolete.myworkshop.common.CustomFragment;

public class HomeFragment extends CustomFragment<HomeViewModel>
{
    public HomeFragment()
    {
        super(R.layout.fragment_home);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = createView(inflater, container, savedInstanceState, HomeViewModel.class);
        setTextViewObserver(R.id.text_home, mViewModel.getText());

        return root;
    }
}