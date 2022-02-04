package com.example.project_kgu_eats.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.MyPurchasing;

import java.util.ArrayList;

public class TabFrag_MyTicket extends Fragment {

    RecyclerView recyclerView;
    TicketListAdapter ticketListAdapter;
    private ArrayList<MyPurchasing> myPurchasingArrayList;
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mypage_ticket_tab,null);

        return view;
    }
}
