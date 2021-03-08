package com.apsolete.myworkshop.ui.workshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

import com.apsolete.myworkshop.R;
import com.apsolete.customui.CustomFragment;

public class WorkshopFragment extends CustomFragment<WorkshopViewModel>
{
    public WorkshopFragment()
    {
        super(R.layout.fragment_workshop, 0, WorkshopViewModel.class);
    }

    @Override
    public WorkshopViewModel getViewModel()
    {
        return mViewModel;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, WorkshopViewModel.class);
//        setTextViewObserver(R.id.text_workshop, mViewModel.getText());
//        return root;
//    }
}
