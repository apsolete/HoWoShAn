package com.apsolete.myworkshop.ui.equipment;

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

public class EquipmentFragment extends CustomFragment<EquipmentViewModel>
{
    public EquipmentFragment()
    {
        super(R.layout.fragment_equipment);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = createView(inflater, container, savedInstanceState, EquipmentViewModel.class);
        initTextView(R.id.text_equipment, mViewModel.getText(), new CustomObserver<TextView, String>()
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