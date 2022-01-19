package com.example.project_kgu_eats;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
public class LauncherActivity extends AppCompatActivity {

    private static int TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.activity_launcher);

        final View myLayout = findViewById(R.id.launch);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LauncherActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME_OUT);


    }

}
