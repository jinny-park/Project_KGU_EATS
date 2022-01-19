package com.example.project_kgu_eats;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerBottomFragActivity extends AppCompatActivity {
//
//    RecyclerView recyclerView;
//    private LinearLayoutManager linearLayoutManager;
//    private ArrayList<ResItem> arrayList = new ArrayList<ResItem>();
//    private AdapterBottomFrag1 adapter = new AdapterBottomFrag1(arrayList);
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.bottom_fragment1);
//
//        recyclerView=(RecyclerView)findViewById(R.id.recyclerView1);
//        recyclerView.setHasFixedSize(true);
//
//        linearLayoutManager = new LinearLayoutManager(this);
//        ((LinearLayoutManager) linearLayoutManager).setReverseLayout(true);
//        ((LinearLayoutManager) linearLayoutManager).setStackFromEnd(true);
//
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//
//
//        adapter.addItem(new ResItem("이스퀘어",R.drawable.logo));
//        recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////    RecyclerView recyclerView;
////    private LinearLayoutManager linearLayoutManager;
////    private ArrayList<String> arrayList = new ArrayList<String>();
////    private RecyclerView.Adapter adapter = new RecyclerView.Adapter(arrayList) {
////        @NonNull
////        @Override
////        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
////            return null;
////        }
////
////        @Override
////        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
////
////        }
////
////        @Override
////        public int getItemCount() {
////            return 0;
////        }
////    };
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.bottom_fragment1);
////
////        recyclerView=(RecyclerView)findViewById(R.id.recyclerView1);
////        recyclerView.setHasFixedSize(true);
////
////        linearLayoutManager = new LinearLayoutManager(this);
////        ((LinearLayoutManager) linearLayoutManager).setReverseLayout(true);
////        ((LinearLayoutManager) linearLayoutManager).setStackFromEnd(true);
////
////        recyclerView.setLayoutManager(linearLayoutManager);
////
////
////
////        adapter.addItem("first Data Test");
////        adapter.addItem("Second Data Test");
////        adapter.addItem("Third Data Test");
////        adapter.addItem("fourth Data Test");
////
////        recyclerView.setAdapter(adapter);
////        adapter.notifyDataSetChanged();
////
////
////
////
////    }
}
