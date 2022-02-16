package com.example.project_kgu_eats.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.MyPurchasing;
import com.example.project_kgu_eats.data.MyTicket;
import com.example.project_kgu_eats.interface_structure.OnCardItemClickListener;
import com.example.project_kgu_eats.interface_structure.OnClickMenuItemListener;

import java.util.ArrayList;

public class MyTicket_TicketList_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView count ;
    String num;
    private ArrayList<MyTicket> myTicketArrayList = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_myticket);

        recyclerView = findViewById(R.id.recyclerView7);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplication());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(LoginActivity.myTicket_ticketList_adapter);

        LoginActivity.myTicket_ticketList_adapter.setOnCardItemClickListener(new OnCardItemClickListener() {
            @Override public void onItemClick(AdapterBottomFrag1.ViewHolder holder, View view, int position) {

            }
            @Override
            public void onCardClick(MyTicket_TicketList_Adapter.ViewHolder holder, View view, int position) {
                if (position != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(getApplication(), QrCodeActivity.class);
                    count= (TextView) view.findViewById(R.id.my_ticket_count);
                    intent.putExtra("countNum",count.getText().toString());
                    startActivity(intent);
                }
            }
        });




    }
}
