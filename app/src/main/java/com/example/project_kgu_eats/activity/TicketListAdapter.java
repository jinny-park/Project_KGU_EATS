package com.example.project_kgu_eats.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.MyPurchasing;
import com.example.project_kgu_eats.data.MyTicket;
import com.example.project_kgu_eats.data.ResItem;
import com.example.project_kgu_eats.interface_structure.OnCardItemClickListener;

import java.util.ArrayList;

public class TicketListAdapter extends RecyclerView.Adapter<TicketListAdapter.ViewHolder>{

    private Context context;
    private ArrayList<MyPurchasing> myPurchasingArrayList;

    public TicketListAdapter(Context context, ArrayList<MyPurchasing> myPurchasingArrayList){
        this.context = context ;
        this.myPurchasingArrayList= myPurchasingArrayList;
    }

    @NonNull
    @Override
    public TicketListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.fragment_purchase_item, parent, false);
        return new TicketListAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TicketListAdapter.ViewHolder holder, int position) {
        MyPurchasing item =myPurchasingArrayList.get(position);
//        holder.resName.setText(myPurchasingArrayList.get(position).name);
//        holder.date.setText(myPurchasingArrayList.get(position).name);
//        holder.isUsed.setText(myPurchasingArrayList.get(position).name);
    }


    @Override
    public int getItemCount() {
        return myPurchasingArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView resName;
        TextView date;
        TextView isUsed;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            resName = itemView.findViewById(R.id.ticket_res_name);
            date = itemView.findViewById(R.id.purchased_date);
            isUsed = itemView.findViewById(R.id.is_used);

        }

    }

    public void addItem(MyPurchasing item){
        myPurchasingArrayList.add(item);
    }
    public void setarrayList(ArrayList<MyPurchasing> arrayList) {

        this.myPurchasingArrayList = arrayList;
    }

    public MyPurchasing getItem(int position) {

        return myPurchasingArrayList.get(position);
    }

    public void setItem(int position, MyPurchasing item) {

        myPurchasingArrayList.set(position, item);
    }

}
