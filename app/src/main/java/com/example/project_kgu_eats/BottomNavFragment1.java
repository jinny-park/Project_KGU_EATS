package com.example.project_kgu_eats;

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

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BottomNavFragment1 extends Fragment {

    RecyclerView recyclerView;

    ArrayList<ResItem> list = new ArrayList<>();

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
//        adapter = new AdapterBottomFrag1(getActivity(), list);
//        adapter.addItem(new ResItem("이스퀘어", R.drawable.esquare));
//        adapter.addItem(new ResItem("감성코어", R.drawable.gamco));
//        adapter.addItem(new ResItem("기숙사식당", R.drawable.dorm));

    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_fragment1,null);
        recyclerView = view.findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(LoginActivity.adapter);
        return view;

//        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.fragment_fragment2,
//
//                container, false);
//        return layout;
    }



}
