package com.apsolete.workshop.ui.equipment.params;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class ParameterFragment extends CustomFragment<ParameterViewModel>
{
    public ParameterFragment()
    {
        super(R.layout.fragment_parameter, 0, ParameterViewModel.class);
    }

    @Override
    public ParameterViewModel getViewModel()
    {
        return mViewModel;
    }
}