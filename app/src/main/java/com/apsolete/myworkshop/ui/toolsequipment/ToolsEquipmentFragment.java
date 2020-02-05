package com.apsolete.myworkshop.ui.toolsequipment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.apsolete.myworkshop.R;

public class ToolsEquipmentFragment extends Fragment
{
    private ToolsEquipmentViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        galleryViewModel = new ViewModelProvider(this).get(ToolsEquipmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_toolsequipment, container, false);
        final TextView textView = root.findViewById(R.id.text_toolsequipment);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>()
        {
            @Override
            public void onChanged(@Nullable String s)
            {
                textView.setText(s);
            }
        });
        return root;
    }
}