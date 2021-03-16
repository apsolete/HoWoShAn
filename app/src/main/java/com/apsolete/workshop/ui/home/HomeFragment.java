package com.apsolete.workshop.ui.home;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class HomeFragment extends CustomFragment<HomeViewModel>
{
    public HomeFragment()
    {
        super(R.layout.fragment_home, 0, HomeViewModel.class);
    }

    @Override
    public HomeViewModel getViewModel()
    {
        return mViewModel;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, HomeViewModel.class);
//        setTextViewObserver(R.id.text_home, mViewModel.getText());
//
//        return root;
//    }
}