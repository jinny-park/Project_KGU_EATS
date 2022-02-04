//package com.example.project_kgu_eats.activity;
//
//import android.os.Bundle;
//import android.util.Log;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//
//import com.example.project_kgu_eats.R;
//import com.google.android.material.tabs.TabLayout;
//
//public class MyPageTabActivity extends AppCompatActivity {
//
//
//    TabFrag_Menu tabFrag_ticketList;
//    TabFrag_Review tabFrag_myTicket;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_mypage_tab);
//
//        tabFrag_ticketList = new TabFrag_Menu();
//        tabFrag_myTicket = new TabFrag_Review();
//
//
//
//        getSupportFragmentManager().beginTransaction().replace(R.id.tabs_my_container, tabFrag_myTicket).commit();
//
//        TabLayout tabs = findViewById(R.id.tabs_my);
//        tabs.addTab(tabs.newTab().setText("내 식권"));
//        tabs.addTab(tabs.newTab().setText("구매내역"));
//
//        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                int position = tab.getPosition();
//                Log.d("MyPageTabActivity", "선택된 탭: " + position);
//
//                Fragment selected = null;
//                if(position == 0){
//                    selected = tabFrag_myTicket;
//                } else {
//                    selected = tabFrag_ticketList;
//                }
//
//                getSupportFragmentManager().beginTransaction().replace(R.id.tabs_my_container, selected).commit();
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }
//}
