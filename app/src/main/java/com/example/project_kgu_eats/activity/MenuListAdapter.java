package com.example.project_kgu_eats.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.MenuItem;
import com.example.project_kgu_eats.interface_structure.OnClickMenuItemListener;

import java.util.ArrayList;

public class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.ViewHolder>
                                                                implements OnClickMenuItemListener{

    private Context context;
    private ArrayList<MenuItem> menuList;
    public OnClickMenuItemListener menuListener;

    public MenuListAdapter(Context context, ArrayList<MenuItem> arrayList){
        this.context = context ;
        this.menuList= arrayList;
    }

    @NonNull
    @Override
    public MenuListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.fragment_menu_item, parent, false);
        return new MenuListAdapter.ViewHolder(itemView,menuListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuListAdapter.ViewHolder holder, int position) {
        MenuItem menuItem =menuList.get(position);
        holder.menuName.setText(menuList.get(position).getMenuName());
        holder.price.setText(menuList.get(position).getPrice());
    }

    public void setOnClickMenuItemListener(OnClickMenuItemListener listener){

        this.menuListener = listener;
    }

    @Override
    public void onItemClick(MenuListAdapter.ViewHolder holder, View view, int position) {
        if(menuListener != null){
            menuListener.onItemClick(holder,view,position);
        }
    }


    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView menuName;
        TextView price;

        public ViewHolder(@NonNull View itemView,final OnClickMenuItemListener menuListener) {
            super(itemView);
            menuName = itemView.findViewById(R.id.menu_name);
            price = itemView.findViewById(R.id.menu_price);

            itemView.setClickable(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(menuListener != null){
                        menuListener.onItemClick(MenuListAdapter.ViewHolder.this, view, position);
                    }

                }
            });


        }

    }

    public void addItem(MenuItem item){
        menuList.add(item);
    }
    public void setarrayList(ArrayList<MenuItem> arrayList) {

        this.menuList = arrayList;
    }

    public MenuItem getItem(int position) {

        return menuList.get(position);
    }

    public void setItem(int position, MenuItem item) {

        menuList.set(position, item);
    }

}
