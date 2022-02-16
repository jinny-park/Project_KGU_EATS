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
import com.example.project_kgu_eats.data.MenuItem;
import com.example.project_kgu_eats.data.MyTicket;
import com.example.project_kgu_eats.interface_structure.OnCardItemClickListener;
import com.example.project_kgu_eats.interface_structure.OnClickMenuItemListener;

import java.util.ArrayList;

public class MyTicket_TicketList_Adapter extends RecyclerView.Adapter<MyTicket_TicketList_Adapter.ViewHolder>
        implements OnCardItemClickListener{

    private Context context;
    private ArrayList<MyTicket> myTickeList;
    public OnCardItemClickListener listener2;

    public MyTicket_TicketList_Adapter(Context context, ArrayList<MyTicket> arrayList){
        this.context = context ;
        this.myTickeList= arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.fragment_myticket_item, parent, false);
        return new MyTicket_TicketList_Adapter.ViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull MyTicket_TicketList_Adapter.ViewHolder holder, int position) {
        MyTicket menuItem =myTickeList.get(position);
        holder.ticketName.setText(myTickeList.get(position).getTicket_name());
        holder.count.setText(myTickeList.get(position).getCount());
        holder.ticketImage.setImageResource(myTickeList.get(position).getTicket_img());
    }
    public void setOnCardItemClickListener(OnCardItemClickListener listener){

        this.listener2 = listener;
    }

    @Override
    public void onCardClick(MyTicket_TicketList_Adapter.ViewHolder holder, View view, int position) {
        if(listener2 != null){
            listener2.onCardClick(holder,view,position);
        }
    }

    @Override
    public int getItemCount() {
        return myTickeList.size();
    }

    @Override
    public void onItemClick(AdapterBottomFrag1.ViewHolder holder, View view, int position) { }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView ticketName;
        TextView  count;
        ImageView ticketImage;

        public ViewHolder(@NonNull View itemView,final OnCardItemClickListener listener) {
            super(itemView);
            ticketName = itemView.findViewById(R.id.my_ticket_name);
            count = itemView.findViewById(R.id.my_ticket_count);
            ticketImage = itemView.findViewById(R.id.ticket_img);
            itemView.setClickable(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(listener != null){
                        listener.onCardClick(MyTicket_TicketList_Adapter.ViewHolder.this, view, position);
                    }

                }
            });


        }

    }

    public void addItem(MyTicket item){
        myTickeList.add(item);
    }
    public void setarrayList(ArrayList<MyTicket> arrayList) {

        this.myTickeList = arrayList;
    }

    public MyTicket getItem(int position) {

        return myTickeList.get(position);
    }

    public void setItem(int position, MyTicket item) {

        myTickeList.set(position, item);
    }

}
