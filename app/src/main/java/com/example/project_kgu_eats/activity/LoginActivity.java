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
import com.example.project_kgu_eats.data.ResItem;
import com.example.project_kgu_eats.data.ReviewItem;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    ArrayList<ResItem> resItemArrayList = new ArrayList<>();
    ArrayList<MenuItem> menuItemArrayList = new ArrayList<>();
    ArrayList<MyPurchasing> myPurchasingArrayList = new ArrayList<>();
    ArrayList<ReviewItem> reviewItemArrayList = new ArrayList<>();


    static AdapterBottomFrag1 AdapterBottomFrag1 ;
    static ReviewAdapter reviewAdapter;
    static TicketListAdapter ticketListAdapter;
    static MenuListAdapter menuListAdapter;

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
        setData();
    }

    void setData(){

        AdapterBottomFrag1.addItem(new ResItem("이스퀘어", R.drawable.esquare));
        AdapterBottomFrag1.addItem(new ResItem("감성코어", R.drawable.gamco));
        AdapterBottomFrag1.addItem(new ResItem("기숙사식당", R.drawable.dorm));
        menuListAdapter.addItem(new MenuItem("식권1","4500",R.drawable.logo));
        menuListAdapter.addItem(new MenuItem("식권2","1500",R.drawable.logo));
        reviewAdapter.addItem(new ReviewItem("202112345","좋아요",R.drawable.kgu));
        reviewAdapter.addItem(new ReviewItem("202112345","좋아요",R.drawable.kgu));
        reviewAdapter.addItem(new ReviewItem("202112345","좋아요",R.drawable.kgu));
        ticketListAdapter.addItem(new MyPurchasing("교내식당1","2022년3월21일","사용완료"));
        ticketListAdapter.addItem(new MyPurchasing("교내식당2","2022년3월21일","사용완료"));
        ticketListAdapter.addItem(new MyPurchasing("교내식당2","2022년3월21일","사용완료"));
        ticketListAdapter.addItem(new MyPurchasing("교내식당1","2022년3월21일","사용완료"));
    }

}