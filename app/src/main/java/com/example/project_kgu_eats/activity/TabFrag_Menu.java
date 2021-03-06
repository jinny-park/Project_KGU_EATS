package com.example.project_kgu_eats.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.MenuItem;
import com.example.project_kgu_eats.interface_structure.OnClickMenuItemListener;

import java.util.ArrayList;

public class TabFrag_Menu extends Fragment {

    RecyclerView recyclerView;
    private ArrayList<MenuItem> menuList = new ArrayList<>();

    TextView price;
    TextView menuName;
    String name;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabmenu,null);

        recyclerView = view.findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(LoginActivity.menuListAdapter);

//        if (getArguments() != null)
//        {
//            name = getArguments().getString("resName"); // 프래그먼트1에서 받아온 값 넣기
//        }

        LoginActivity.menuListAdapter.setOnClickMenuItemListener(new OnClickMenuItemListener() {
            @Override public void onItemClick(MenuListAdapter.ViewHolder holder, View view, int position) {
                if (position != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(getActivity(), CartActivity.class);
                    price = (TextView) view.findViewById(R.id.menu_price);
                    menuName = (TextView) view.findViewById(R.id.menu_name);
                    intent.putExtra("menuName",menuName.getText().toString());
                    intent.putExtra("menuPrice",price.getText().toString());
//                    intent.putExtra("resName",name);
                    startActivity(intent);
                }
            }
        });

        return view;
    }
}
