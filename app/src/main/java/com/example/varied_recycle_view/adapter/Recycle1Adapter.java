package com.example.varied_recycle_view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.varied_recycle_view.R;
import com.example.varied_recycle_view.jvo.KnightErrant;

import java.util.ArrayList;
import java.util.List;

public class Recycle1Adapter extends RecyclerView.Adapter<Recycle1Adapter.ViewHolder> {

    private List<KnightErrant> knightErrantList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView1,textView2,textView3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1=itemView.findViewById(R.id.textview1);
            textView2=itemView.findViewById(R.id.textview2);
            textView3=itemView.findViewById(R.id.textview3);
        }
    }

    public Recycle1Adapter(List<KnightErrant> knightErrantList){
        if(knightErrantList!=null){
            this.knightErrantList=knightErrantList;
        }else{
            knightErrantList=new ArrayList<>();
        }
    }
    @NonNull
    @Override
    public Recycle1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle1_item,null);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull Recycle1Adapter.ViewHolder holder, int position) {
        KnightErrant knightErrant=knightErrantList.get(position);
        holder.textView1.setText(knightErrant.getName());
        holder.textView2.setText(knightErrant.getSect());
        holder.textView3.setText(knightErrant.getRank());

    }


    @Override
    public int getItemCount() {
        return knightErrantList.size();
    }
}
