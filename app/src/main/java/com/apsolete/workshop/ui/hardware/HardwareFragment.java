package com.apsolete.workshop.ui.hardware;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class HardwareFragment extends CustomFragment<HardwareViewModel>
{
    public HardwareFragment()
    {
        super(R.layout.fragment_hardware, 0, HardwareViewModel.class);
    }

    @Override
    public HardwareViewModel getViewModel()
    {
        return mViewModel;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, HardwareViewModel.class);
//        setTextViewObserver(R.id.text_hardware, mViewModel.getText());
//
//        return root;
//    }
}