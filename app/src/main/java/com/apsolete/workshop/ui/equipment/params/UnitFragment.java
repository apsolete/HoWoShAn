package com.apsolete.workshop.ui.equipment.params;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class UnitFragment extends CustomFragment<UnitViewModel>
{
    public UnitFragment()
    {
        super(R.layout.fragment_unit, 0, UnitViewModel.class);
    }

    @Override
    public UnitViewModel getViewModel()
    {
        return mViewModel;
    }
}
