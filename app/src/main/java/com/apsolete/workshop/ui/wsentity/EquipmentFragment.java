package com.apsolete.workshop.ui.wsentity;

import com.apsolete.workshop.R;
import com.apsolete.customui.CustomFragment;

public class EquipmentFragment extends CustomFragment<EquipmentViewModel>
{
    public EquipmentFragment()
    {
        super(R.layout.fragment_equipment, R.string.title_equipment, EquipmentViewModel.class);
    }

    @Override
    public EquipmentViewModel getViewModel()
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