package com.example.dell.materialdesign;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public MyAdapter(ItemData[] itemDatas) {
        this.itemDatas = itemDatas;
    }

    private ItemData[] itemDatas;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
     ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.titleTextView.setText(itemDatas[position].getName());
        holder.titleTextView.setText(itemDatas[position].getEmail());
        holder.featuresTextView.setText(itemDatas[position].getPhone());
        holder.iconImageView.setText(itemDatas[position].getPassword());

        holder.titleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Clicked on:"+itemDatas[position].getName(),Snackbar.LENGTH_LONG)
                        .setAction("Action here",null)
                        .show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemDatas.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
public TextView titleTextView;
public TextView featuresTextView;
public TextView iconImageView;
public TextView extraTextView;
        public ViewHolder(View itemView) {
            super(itemView);

            titleTextView=(TextView)itemView.findViewById(R.id.tv6);
            featuresTextView=(TextView)itemView.findViewById(R.id.tv7);
            iconImageView=(TextView)itemView.findViewById(R.id.tv8);
            extraTextView=(TextView)itemView.findViewById(R.id.tv9);


        }
    }

}
