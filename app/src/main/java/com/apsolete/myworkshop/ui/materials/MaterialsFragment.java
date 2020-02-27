package com.apsolete.myworkshop.ui.materials;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.apsolete.myworkshop.R;
import com.apsolete.myworkshop.common.CustomFragment;

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
        setTextViewObserver(R.id.text_materials, mViewModel.getText());

        return root;
    }
}