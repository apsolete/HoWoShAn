package com.apsolete.workshop.ui.equipment.types;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class TypeFragment extends CustomFragment<TypeViewModel>
{
    public TypeFragment()
    {
        super(R.layout.fragment_equipmenttype, 0, TypeViewModel.class);
    }

    @Override
    public TypeViewModel getViewModel()
    {
        return mViewModel;
    }
}
