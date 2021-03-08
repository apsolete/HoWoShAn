package com.apsolete.myworkshop.ui.equipment.types;

import com.apsolete.myworkshop.R;
import com.apsolete.customui.CustomFragment;

public class TypesFragment extends CustomFragment<TypesViewModel>
{
    public TypesFragment()
    {
        super(R.layout.fragment_equipmenttypes, 0, TypesViewModel.class);
    }

    @Override
    public TypesViewModel getViewModel()
    {
        return mViewModel;
    }
}
