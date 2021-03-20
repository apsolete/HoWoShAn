package com.apsolete.workshop.ui.equipment.kinds;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class KindFragment extends CustomFragment<KindViewModel>
{
    public KindFragment()
    {
        super(R.layout.fragment_equipmentkind, R.string.title_equipmentkind, KindViewModel.class);
    }

    @Override
    public KindViewModel getViewModel()
    {
        return mViewModel;
    }
}
