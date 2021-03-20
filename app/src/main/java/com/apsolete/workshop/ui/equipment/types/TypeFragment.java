package com.apsolete.workshop.ui.equipment.types;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class TypeFragment extends CustomFragment<TypesViewModel>
{
    public TypeFragment()
    {
        super(R.layout.fragment_equipmenttype, R.string.title_equipmenttype, TypesViewModel.class);
    }

    @Override
    public TypesViewModel getViewModel()
    {
        return mViewModel;
    }
}
