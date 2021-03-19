package com.apsolete.workshop.ui.equipment.types;

import android.view.View;
import android.view.ViewGroup;

import com.apsolete.customui.Adapters;
import com.apsolete.customui.CustomFragment;
import com.apsolete.workshop.R;

public class TypesFragment extends CustomFragment<TypesViewModel>
{
    public TypesFragment()
    {
        super(R.layout.fragment_equipmenttypes, 0, TypesViewModel.class);
    }

    @Override
    public TypesViewModel getViewModel()
    {
        return mViewModel;
    }

    private static class TypesAdapter extends Adapters.ItemsAdapter
    {
        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            return null;
        }
    }
}
