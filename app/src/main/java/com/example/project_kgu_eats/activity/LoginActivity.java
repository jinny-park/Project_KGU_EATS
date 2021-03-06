package com.example.project_kgu_eats.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.MenuItem;
import com.example.project_kgu_eats.data.MyPurchasing;
import com.example.project_kgu_eats.data.MyTicket;
import com.example.project_kgu_eats.data.ResItem;
import com.example.project_kgu_eats.data.ReviewItem;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    ArrayList<ResItem> resItemArrayList = new ArrayList<>();
    ArrayList<MenuItem> menuItemArrayList = new ArrayList<>();
    ArrayList<MyPurchasing> myPurchasingArrayList = new ArrayList<>();
    ArrayList<ReviewItem> reviewItemArrayList = new ArrayList<>();
    ArrayList<MyTicket> myTicketArrayList =new ArrayList<>();


    static AdapterBottomFrag1 AdapterBottomFrag1 ;
    static ReviewAdapter reviewAdapter;
    static TicketListAdapter ticketListAdapter;
    static MenuListAdapter menuListAdapter;
    static MyTicket_TicketList_Adapter myTicket_ticketList_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setList();

        Button button = findViewById(R.id.LoginButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NavigationActivity.class);
                startActivity(intent);
            }
        });
    }

    void setList(){
        AdapterBottomFrag1 = new AdapterBottomFrag1(getApplicationContext(), resItemArrayList);
        reviewAdapter = new ReviewAdapter(getApplicationContext(), reviewItemArrayList);
        ticketListAdapter = new TicketListAdapter(getApplicationContext(), myPurchasingArrayList);
        menuListAdapter = new MenuListAdapter(getApplicationContext(), menuItemArrayList);
        myTicket_ticketList_adapter = new MyTicket_TicketList_Adapter(getApplicationContext(),myTicketArrayList);
        setData();
    }

    void setData(){

        AdapterBottomFrag1.addItem(new ResItem("????????????", R.drawable.esquare));
        AdapterBottomFrag1.addItem(new ResItem("????????????", R.drawable.gamco));
        AdapterBottomFrag1.addItem(new ResItem("???????????????", R.drawable.dorm));
        menuListAdapter.addItem(new MenuItem("??????1","4500",R.drawable.logo));
        menuListAdapter.addItem(new MenuItem("??????2","1500",R.drawable.logo));
        reviewAdapter.addItem(new ReviewItem("202112345","?????????",R.drawable.food));
        reviewAdapter.addItem(new ReviewItem("202112346","?????????",R.drawable.food));
        ticketListAdapter.addItem(new MyPurchasing("????????????","2022???3???21???","????????????"));
        ticketListAdapter.addItem(new MyPurchasing("????????????","2022???3???21???","????????????"));
        ticketListAdapter.addItem(new MyPurchasing("????????????","2022???3???21???","????????????"));
        ticketListAdapter.addItem(new MyPurchasing("???????????????","2022???3???21???","????????????"));
        myTicket_ticketList_adapter.addItem(new MyTicket(R.drawable.esquare,"????????????","2???"));
    }

}