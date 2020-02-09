package com.apsolete.myworkshop.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apsolete.myworkshop.R;
import com.apsolete.myworkshop.common.CustomFragment;
import com.apsolete.myworkshop.common.CustomObserver;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SendFragment extends CustomFragment<SendViewModel>
{
    public SendFragment()
    {
        super(R.layout.fragment_send);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = createView(inflater, container, savedInstanceState, SendViewModel.class);
        initTextView(R.id.text_send, mViewModel.getText(), new CustomObserver<TextView, String>()
        {
            @Override
            public void onChanged(@Nullable String s)
            {
                mView.setText(s);
            }
        });

        return root;
    }
}