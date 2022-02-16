package com.example.project_kgu_eats.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project_kgu_eats.R;

public class QrCodeActivity extends AppCompatActivity {

    String countNum;
    TextView count;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myticket_qrcode);
        count = (TextView) findViewById(R.id.qr_ticket_count_num);


        Intent intent = getIntent();
        countNum = intent.getStringExtra("countNum");
        count.setText(countNum);


    }

}
