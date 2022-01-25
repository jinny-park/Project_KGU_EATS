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

    public void setOnItemClicklistener(OnCardItemClickListener listener){

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

//                    int pos = getAdapterPosition();
//                    if(pos != RecyclerView.NO_POSITION){
//                        Intent intent = new Intent(, NavigationActivity.class);
//                        startActivity(intent);
//                    }
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






























//    private ArrayList<RecyclerBottomFragActivity.item> mDataset; //MainActivity에 item class를 정의해 놓았음
//
//    // Provide a reference to the views for each data item
//    // Complex data items may need more than one view per item, and
//    // you provide access to all the views for a data item in a view holder
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        // 사용될 항목들 선언
//        public ImageView view_item;
//
//        public ViewHolder(View v) {
//            super(v);
//            view_item = (ImageView) v.findViewById(R.id.view_item);
//        }
//    }
//
//    // 생성자 - 넘어 오는 데이터파입에 유의해야 한다.
//    public AdapterBottomFrag1(ArrayList<RecyclerBottomFragActivity.item> myDataset) {
//        mDataset = myDataset;
//    }
//
//
//    //뷰홀더
//    // Create new views (invoked by the layout manager)
//    @Override
//    public AdapterBottomFrag1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        // create a new view
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
//        // set the view's size, margins, paddings and layout parameters
//
//        ViewHolder holder = new ViewHolder(v);
//        return holder;
//    }
//
//    // Replace the contents of a view (invoked by the layout manager)
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//
//        holder.view_item.setImageDrawable(logo.png);
//        //holder.mPhoto.setImageBitmap(mDataset.get(position).getPhoto()); //첨부된 이미지를 연결해줘야 하는데 이건 또 복잡하다. 이건 나중에...
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return mDataset.size();
//    }
}
