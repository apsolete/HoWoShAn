package com.apsolete.workshop.ui.equipment.params;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class ParametersFragment extends CustomFragment<ParametersViewModel>
{
    public ParametersFragment()
    {
        super(R.layout.fragment_parameters, R.string.title_parameters, ParametersViewModel.class);
    }

    @Override
    public ParametersViewModel getViewModel()
    {
        return mViewModel;
    }
}
