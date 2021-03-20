package com.apsolete.workshop.ui.equipment.kinds;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class KindsFragment extends CustomFragment<KindsViewModel>
{
    public KindsFragment()
    {
        super(R.layout.fragment_equipmentkinds, R.string.title_equipmentkinds, KindsViewModel.class);
    }

    @Override
    public KindsViewModel getViewModel()
    {
        return mViewModel;
    }
}
