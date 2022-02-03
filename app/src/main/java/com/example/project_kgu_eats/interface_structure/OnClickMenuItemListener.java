package com.example.project_kgu_eats.interface_structure;

import android.view.View;

import com.example.project_kgu_eats.activity.MenuListAdapter;

public interface OnClickMenuItemListener {

    public void onItemClick(MenuListAdapter.ViewHolder holder, View view, int position);
}
