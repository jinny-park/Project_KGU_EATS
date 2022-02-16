package com.example.project_kgu_eats.interface_structure;

import android.view.View;

import com.example.project_kgu_eats.activity.AdapterBottomFrag1;
import com.example.project_kgu_eats.activity.MyTicket_TicketList_Adapter;

public interface OnCardItemClickListener {

    public void onItemClick(AdapterBottomFrag1.ViewHolder holder, View view, int position);
    public void onCardClick(MyTicket_TicketList_Adapter.ViewHolder holder, View view, int position);

}
