package com.apsolete.myworkshop.ui.materials;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

import com.apsolete.myworkshop.R;
import com.apsolete.customui.CustomFragment;

public class MaterialsFragment extends CustomFragment<MaterialsViewModel>
{
    public MaterialsFragment()
    {
        super(R.layout.fragment_materials, 0, MaterialsViewModel.class);
    }

    @Override
    public MaterialsViewModel getViewModel()
    {
        return mViewModel;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, MaterialsViewModel.class);
//        setTextViewObserver(R.id.text_materials, mViewModel.getText());
//
//        return root;
//    }
}