package com.apsolete.myworkshop.ui.equipment.kinds;

import com.apsolete.myworkshop.R;
import com.apsolete.customui.CustomFragment;

public class KindsFragment extends CustomFragment<KindsViewModel>
{
    public KindsFragment()
    {
        super(R.layout.fragment_equipmentkinds, 0, KindsViewModel.class);
    }

    @Override
    public KindsViewModel getViewModel()
    {
        return mViewModel;
    }
}
