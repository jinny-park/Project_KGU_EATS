package com.example.project_kgu_eats.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.ResItem;
import com.example.project_kgu_eats.interface_structure.OnCardItemClickListener;

import java.util.ArrayList;

public class TabFrag_Menu extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ResItem> list = new ArrayList<>();

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabmenu,null);

        recyclerView = view.findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(LoginActivity.adapter);

//        LoginActivity.adapter.setOnItemClicklistener(new OnCardItemClickListener() {
//            @Override public void onItemClick(AdapterBottomFrag1.ViewHolder holder, View view, int position) {
//                if (position != RecyclerView.NO_POSITION) {
//                    Intent intent = new Intent(getActivity(), MainTabActivity.class);
//                    startActivity(intent);
//                }
//            }
//        });

        return view;
    }
}
