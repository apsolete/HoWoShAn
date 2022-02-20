package com.apsolete.workshop.ui.wsentity.types;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class TypeFragment extends CustomFragment<TypesViewModel>
{
    public TypeFragment()
    {
        super(R.layout.fragment_entitytype, R.string.title_entitytype, TypesViewModel.class);
    }

    @Override
    public TypesViewModel getViewModel()
    {
        return mViewModel;
    }
}
