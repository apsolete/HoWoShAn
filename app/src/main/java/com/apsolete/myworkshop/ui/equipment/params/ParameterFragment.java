package com.apsolete.myworkshop.ui.equipment.params;

import com.apsolete.myworkshop.R;
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
