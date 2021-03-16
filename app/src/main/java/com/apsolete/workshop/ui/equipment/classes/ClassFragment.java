package com.apsolete.workshop.ui.equipment.classes;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class ClassFragment extends CustomFragment<ClassViewModel>
{
    public ClassFragment()
    {
        super(R.layout.fragment_equipmentclass, 0, ClassViewModel.class);
    }

    @Override
    public ClassViewModel getViewModel()
    {
        return mViewModel;
    }
}
