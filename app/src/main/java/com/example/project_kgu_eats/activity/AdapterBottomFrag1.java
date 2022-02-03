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
import com.example.project_kgu_eats.data.ResItem;
import com.example.project_kgu_eats.interface_structure.OnCardItemClickListener;

import java.util.ArrayList;

public class AdapterBottomFrag1 extends RecyclerView.Adapter<AdapterBottomFrag1.ViewHolder>
                                    implements OnCardItemClickListener{

    private Context context;
    private ArrayList<ResItem> arrayList;
    public OnCardItemClickListener listener;

    public AdapterBottomFrag1(Context context, ArrayList<ResItem> arrayList){
        this.context = context ;
        this.arrayList= arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.fragment_rest_item, parent, false);
        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ResItem item =arrayList.get(position);
        holder.imageView.setImageResource(arrayList.get(position).image);
        holder.textView.setText(arrayList.get(position).name);
    }

    public void setOnCardItemClickListener(OnCardItemClickListener listener){

        this.listener = listener;
    }

        @Override
        public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null){
            listener.onItemClick(holder,view,position);
        }
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView, final OnCardItemClickListener listener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.view_item);
            textView = itemView.findViewById(R.id.menu_name);

            itemView.setClickable(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(listener != null){
                        listener.onItemClick(ViewHolder.this, view, position);
                    }
                }
            });


        }

    }

    public void addItem(ResItem item){
        arrayList.add(item);
    }
    public void setarrayList(ArrayList<ResItem> arrayList) {

        this.arrayList = arrayList;
    }

    public ResItem getItem(int position) {

        return arrayList.get(position);
    }

    public void setItem(int position, ResItem item) {

        arrayList.set(position, item);
    }

}
