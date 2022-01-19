package com.example.project_kgu_eats;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationActivity extends AppCompatActivity {


   BottomNavFragment1 fragment1;
   BottomNavFragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        fragment1 = new BottomNavFragment1();
        fragment2 = new BottomNavFragment2();

        getSupportFragmentManager().beginTransaction().replace(R.id.bottom_container,fragment1).commit();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_tab1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.bottom_container,fragment1).commit();
                        return true;
                    case R.id.bottom_tab2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.bottom_container,fragment2).commit();
                        return true;

                }
                return false;
            }
        });
    }
}
