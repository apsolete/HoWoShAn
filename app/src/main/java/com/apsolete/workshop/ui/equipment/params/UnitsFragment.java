package com.apsolete.workshop.ui.equipment.params;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class UnitsFragment extends CustomFragment<UnitsViewModel>
{
    public UnitsFragment()
    {
        super(R.layout.fragment_units, 0, UnitsViewModel.class);
    }

    @Override
    public UnitsViewModel getViewModel()
    {
        return mViewModel;
    }
}
