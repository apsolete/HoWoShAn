package com.apsolete.myworkshop.ui.equipment.classes;

import com.apsolete.myworkshop.R;
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
