package com.apsolete.myworkshop.ui.materials;

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

public class MaterialsFragment extends CustomFragment<MaterialsViewModel>
{
    public MaterialsFragment()
    {
        super(R.layout.fragment_materials);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = createView(inflater, container, savedInstanceState, MaterialsViewModel.class);
        initTextView(R.id.text_materials, mViewModel.getText(), new CustomObserver<TextView, String>()
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