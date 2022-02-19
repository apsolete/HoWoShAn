package com.apsolete.workshop.ui.wsentity;

import com.apsolete.customui.CustomFragment;
import com.apsolete.workshop.R;

public class EquipmentsFragment extends CustomFragment<EquipmentsViewModel>
{
    public EquipmentsFragment()
    {
        super(R.layout.fragment_equipment, R.string.title_equipment, EquipmentsViewModel.class);
    }

    @Override
    public EquipmentsViewModel getViewModel()
    {
        return mViewModel;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, EquipmentViewModel.class);
//        setTextViewObserver(R.id.text_equipment, mViewModel.getText());
//
//        return root;
//    }
}