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
import com.example.project_kgu_eats.interface_structure.OnCardItemClickListener;

public class BottomNavFragment2 extends Fragment {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_fragment2,null);

        recyclerView = view.findViewById(R.id.recyclerView4);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(LoginActivity.adapter);

        LoginActivity.adapter.setOnCardItemClickListener(new OnCardItemClickListener() {
            @Override public void onItemClick(AdapterBottomFrag1.ViewHolder holder, View view, int position) {
                if (position != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(getActivity(), MainTabActivity.class);
                    startActivity(intent);
                }
            }
        });

        return view;

//        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.fragment_fragment2,
//
//                container, false);
//        return layout;
    }


}
