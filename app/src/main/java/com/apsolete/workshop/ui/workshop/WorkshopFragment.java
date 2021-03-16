package com.apsolete.workshop.ui.workshop;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class WorkshopFragment extends CustomFragment<WorkshopViewModel>
{
    public WorkshopFragment()
    {
        super(R.layout.fragment_workshop, 0, WorkshopViewModel.class);
    }

    @Override
    public WorkshopViewModel getViewModel()
    {
        return mViewModel;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, WorkshopViewModel.class);
//        setTextViewObserver(R.id.text_workshop, mViewModel.getText());
//        return root;
//    }
}
