package com.example.project_kgu_eats.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.ResItem;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    ArrayList<ResItem> list = new ArrayList<>();
    static AdapterBottomFrag1 adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        adapter = new AdapterBottomFrag1(getApplicationContext(), list);
        adapter.addItem(new ResItem("이스퀘어", R.drawable.esquare));
        adapter.addItem(new ResItem("감성코어", R.drawable.gamco));
        adapter.addItem(new ResItem("기숙사식당", R.drawable.dorm));

        Button button = findViewById(R.id.LoginButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NavigationActivity.class);
                startActivity(intent);
            }
        });
    }
}