package com.apsolete.myworkshop.ui.equipment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

import com.apsolete.myworkshop.R;
import com.apsolete.customui.CustomFragment;

public class EquipmentFragment extends CustomFragment<EquipmentViewModel>
{
    public EquipmentFragment()
    {
        super(R.layout.fragment_equipment, 0, EquipmentViewModel.class);
    }

    @Override
    public EquipmentViewModel getViewModel()
    {
        return mViewModel;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, EquipmentViewModel.class);
//        setTextViewObserver(R.id.text_equipment, mViewModel.getText());
//
//        return root;
//    }
}