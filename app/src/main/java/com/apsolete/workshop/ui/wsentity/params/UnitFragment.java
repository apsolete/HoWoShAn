package com.apsolete.workshop.ui.wsentity.params;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class UnitFragment extends CustomFragment<UnitViewModel>
{
    public UnitFragment()
    {
        super(R.layout.fragment_unit, R.string.title_unit, UnitViewModel.class);
    }

    @Override
    public UnitViewModel getViewModel()
    {
        return mViewModel;
    }
}
