package com.apsolete.myworkshop.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

import com.apsolete.myworkshop.R;
import com.apsolete.customui.CustomFragment;

public class SendFragment extends CustomFragment<SendViewModel>
{
    public SendFragment()
    {
        super(R.layout.fragment_send, 0, SendViewModel.class);
    }

    @Override
    public SendViewModel getViewModel()
    {
        return null;
    }

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        View root = createView(inflater, container, savedInstanceState, SendViewModel.class);
//        setTextViewObserver(R.id.text_send, mViewModel.getText());
//
//        return root;
//    }
}