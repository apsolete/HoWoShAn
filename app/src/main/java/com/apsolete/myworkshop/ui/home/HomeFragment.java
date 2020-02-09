package com.apsolete.myworkshop.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apsolete.myworkshop.R;
import com.apsolete.myworkshop.common.CustomFragment;
import com.apsolete.myworkshop.common.CustomObserver;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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
        initTextView(R.id.text_home, mViewModel.getText(), new CustomObserver<TextView, String>()
        {
            @Override
            public void onChanged(@Nullable String s)
            {
                mView.setText(s);
            }
        });

        return root;
    }
}