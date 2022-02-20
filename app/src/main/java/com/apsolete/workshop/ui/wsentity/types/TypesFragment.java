package com.apsolete.workshop.ui.wsentity.types;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.apsolete.customui.Adapters;
import com.apsolete.customui.CustomFragment;
import com.apsolete.customui.ScrollChildSwipeRefreshLayout;
import com.apsolete.workshop.R;
import com.apsolete.workshop.db.entities.WsEntityType;

import java.util.List;

public class TypesFragment extends CustomFragment<TypesViewModel>
{
    private TypesAdapter mTypesAdapter;

    public TypesFragment()
    {
        super(R.layout.fragment_entitytypes, R.string.title_entitytypes, TypesViewModel.class);
    }

    @Override
    public TypesViewModel getViewModel()
    {
        return mViewModel;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        mTypesAdapter = new TypesAdapter();
        mViewModel.getEquipTypes().observe(this, new Observer<List<WsEntityType>>()
        {
            @Override
            public void onChanged(List<WsEntityType> wsEntityTypes)
            {
                mTypesAdapter.setList(wsEntityTypes);
            }
        });
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View root = super.onCreateView(inflater, container, savedInstanceState);
        ListView listView = root.findViewById(R.id.list_entitytypes);
        listView.setAdapter(mTypesAdapter);

        // Set up progress indicator
        final ScrollChildSwipeRefreshLayout swipeRefreshLayout = root.findViewById(R.id.refresh_layout);
        swipeRefreshLayout.setColorSchemeColors(
                ContextCompat.getColor(getActivity(), R.color.colorPrimary),
                ContextCompat.getColor(getActivity(), R.color.colorAccent),
                ContextCompat.getColor(getActivity(), R.color.colorPrimaryDark));
        // Set the scrolling view in the custom SwipeRefreshLayout.
        swipeRefreshLayout.setScrollUpChild(listView);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener()
        {
            @Override
            public void onRefresh()
            {
                mViewModel.load();
            }
        });

        return root;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater)
    {
        inflater.inflate(R.menu.main_actions, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    private static class TypesAdapter extends Adapters.ItemsAdapter<WsEntityType>
    {
        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            View rowView = view;
            if (rowView == null) {
                LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
                rowView = inflater.inflate(R.layout.item_entitytype, viewGroup, false);
            }
            WsEntityType wsEntityType = getItem(i);

            TextView textTypeId = (TextView) rowView.findViewById(R.id.text_entitytype_id);
            textTypeId.setText(Long.toString(wsEntityType.id));

            TextView textTypeName = (TextView) rowView.findViewById(R.id.text_entitytype_name);
            textTypeName.setText(wsEntityType.name);

            TextView textTypeDescr = (TextView) rowView.findViewById(R.id.text_entitytype_descr);
            textTypeDescr.setText(wsEntityType.description);

            return rowView;
        }
    }
}
