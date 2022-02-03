package com.example.project_kgu_eats.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kgu_eats.R;
import com.example.project_kgu_eats.data.review;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder>{

    private Context context;
    private ArrayList<review> reviewList;

    public ReviewAdapter(Context context, ArrayList<review> arrayList){
        this.context = context ;
        this.reviewList= arrayList;
    }

    @NonNull
    @Override
    public ReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.fragment_review_item, parent, false);
        return new ReviewAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewAdapter.ViewHolder holder, int position) {
        review item =reviewList.get(position);
        holder.username.setText(reviewList.get(position).getUserName());
        holder.comment.setText(reviewList.get(position).getComment());
    }


    @Override
    public int getItemCount() {
        return reviewList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView username;
        TextView comment;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.review_id);
            comment = itemView.findViewById(R.id.review_txt);
        }

    }

    public void addItem(review item){
        reviewList.add(item);
    }
    public void setarrayList(ArrayList<review> arrayList) {

        this.reviewList = arrayList;
    }

    public review getItem(int position) {

        return reviewList.get(position);
    }

    public void setItem(int position, review item) {

        reviewList.set(position, item);
    }

}