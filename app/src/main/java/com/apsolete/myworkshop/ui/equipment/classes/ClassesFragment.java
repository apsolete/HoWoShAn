package com.apsolete.myworkshop.ui.equipment.classes;

import com.apsolete.myworkshop.R;
import com.apsolete.customui.CustomFragment;

public class ClassesFragment extends CustomFragment<ClassesViewModel>
{
    public ClassesFragment()
    {
        super(R.layout.fragment_equipmentclasses, 0, ClassesViewModel.class);
    }

    @Override
    public ClassesViewModel getViewModel()
    {
        return mViewModel;
    }
}
