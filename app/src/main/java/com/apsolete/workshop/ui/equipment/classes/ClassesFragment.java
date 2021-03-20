package com.apsolete.workshop.ui.equipment.classes;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class ClassesFragment extends CustomFragment<ClassesViewModel>
{
    public ClassesFragment()
    {
        super(R.layout.fragment_equipmentclasses, R.string.title_equipmentclasses, ClassesViewModel.class);
    }

    @Override
    public ClassesViewModel getViewModel()
    {
        return mViewModel;
    }
}
