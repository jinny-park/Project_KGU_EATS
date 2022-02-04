package com.example.project_kgu_eats.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import com.google.android.material.tabs.TabLayout;

public class BottomNavFragment2 extends Fragment {


    RecyclerView recyclerView;
    TabFrag_ticketList tabFrag_ticketList;
    TabFrag_MyTicket tabFrag_myTicket;
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mypage_tab,null);
        tabFrag_ticketList = new TabFrag_ticketList();
        tabFrag_myTicket = new TabFrag_MyTicket();
        getFragmentManager().beginTransaction().replace(R.id.tabs_my_container,tabFrag_myTicket).commit();



//        getSupportFragmentManager().beginTransaction().replace(R.id.tabs_my_container, tabFrag_myTicket).commit();

        TabLayout tabs = view.findViewById(R.id.tabs_my);
//                findViewById(R.id.tabs_my);
        tabs.addTab(tabs.newTab().setText("내 식권"));
        tabs.addTab(tabs.newTab().setText("구매내역"));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Log.d("MyPageTabActivity", "선택된 탭: " + position);

                Fragment selected = null;
                if(position == 0){
                    selected = tabFrag_myTicket;
                } else {
                    selected = tabFrag_ticketList;
                }

                getFragmentManager().beginTransaction().replace(R.id.tabs_my_container, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }

//        recyclerView = view.findViewById(R.id.recyclerView4);
//        recyclerView.setHasFixedSize(true);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(LoginActivity.adapter);
//
//        LoginActivity.adapter.setOnCardItemClickListener(new OnCardItemClickListener() {
//            @Override public void onItemClick(AdapterBottomFrag1.ViewHolder holder, View view, int position) {
//                if (position != RecyclerView.NO_POSITION) {
//                    Intent intent = new Intent(getActivity(), MainTabActivity.class);
//                    startActivity(intent);
//                }
//            }
//        });



//        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.fragment_fragment2,
//
//                container, false);
//        return layout;


}
