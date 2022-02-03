package com.example.project_kgu_eats.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.ResItem;
import com.example.project_kgu_eats.data.review;

import java.util.ArrayList;

public class TabFrag_Review extends Fragment {
    RecyclerView recyclerView;
    ArrayList<review> reviewList = new ArrayList<>();
    ReviewAdapter reviewAdapter = new ReviewAdapter(getContext(),reviewList);
    Button reviewButton;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabreview,null);

        recyclerView = view.findViewById(R.id.recyclerView3);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(reviewAdapter);

        reviewButton = (Button) view.findViewById(R.id.review_btn);
        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ReviewAddActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
