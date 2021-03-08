package com.apsolete.myworkshop.ui.equipment.params;

import com.apsolete.myworkshop.R;
import com.apsolete.customui.CustomFragment;

public class ParametersFragment extends CustomFragment<ParametersViewModel>
{
    public ParametersFragment()
    {
        super(R.layout.fragment_parameters, 0, ParametersViewModel.class);
    }

    @Override
    public ParametersViewModel getViewModel()
    {
        return mViewModel;
    }
}
