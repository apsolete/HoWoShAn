package com.apsolete.workshop.ui.tools;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class ToolsFragment extends CustomFragment<ToolsViewModel>
{
    public ToolsFragment()
    {
        super(R.layout.fragment_tools, 0, ToolsViewModel.class);
    }

    @Override
    public ToolsViewModel getViewModel()
    {
        return mViewModel;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, ToolsViewModel.class);
//        setTextViewObserver(R.id.text_tools, mViewModel.getText());
//        return root;
//    }
}