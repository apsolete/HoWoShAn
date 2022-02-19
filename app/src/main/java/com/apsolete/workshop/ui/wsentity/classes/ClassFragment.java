package com.apsolete.workshop.ui.wsentity.classes;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class ClassFragment extends CustomFragment<ClassViewModel>
{
    public ClassFragment()
    {
        super(R.layout.fragment_equipmentclass, R.string.title_equipmentclass, ClassViewModel.class);
    }

    @Override
    public ClassViewModel getViewModel()
    {
        return mViewModel;
    }
}
