package com.example.project_kgu_eats.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.project_kgu_eats.R;
import com.google.android.material.tabs.TabLayout;

public class MainTabActivity extends AppCompatActivity {

    TabFrag_Menu tabFrag_menu;
    TabFrag_Review tabFrag_review;
    TabFrag_Info tabFrag_info;
    TextView resName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab);

        Intent intent = getIntent();
        resName = (TextView) findViewById(R.id.resName);
//        resName.setText(intent.getStringExtra("resName"));

        tabFrag_menu = new TabFrag_Menu();
        tabFrag_review = new TabFrag_Review();
        tabFrag_info = new TabFrag_Info();


        getSupportFragmentManager().beginTransaction().replace(R.id.tab_container, tabFrag_menu).commit();

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("메뉴"));
        tabs.addTab(tabs.newTab().setText("리뷰"));
        tabs.addTab(tabs.newTab().setText("정보"));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Log.d("MainTabActivity", "선택된 탭: " + position);

               
                Fragment selected = null;
                if(position == 0){
                    // 번들을 통해 값 전달
//                    Bundle bundle = new Bundle();
//                    bundle.putString("resName",resName.getText().toString());//번들에 넘길 값 저장
//                    selected.setArguments(bundle);
                    selected = tabFrag_menu;
                } else if(position == 1){
                    selected = tabFrag_review;
                } else {
                    selected = tabFrag_info;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.tab_container, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
