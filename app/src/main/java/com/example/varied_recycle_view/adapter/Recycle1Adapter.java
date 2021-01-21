package com.example.varied_recycle_view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.varied_recycle_view.R;
import com.example.varied_recycle_view.jvo.KnightErrant;
import java.util.ArrayList;
import java.util.List;

public class Recycle1Adapter extends RecyclerView.Adapter<Recycle1Adapter.ViewHolder> {
    private static final String TAG = "Recycle1Adapter";

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
    public Recycle1Adapter.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle1_item,parent,false);
        final ViewHolder viewHolder=new ViewHolder(view);
        viewHolder.textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=viewHolder.getAdapterPosition();
                Toast.makeText(parent.getContext(),"当前人物:"+knightErrantList.get(position).getName()+"\n"+"排名情况:"+knightErrantList.get(position).getRank(),Toast.LENGTH_SHORT).show();
            }
        });
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull Recycle1Adapter.ViewHolder holder, final int position) {
        KnightErrant knightErrant=knightErrantList.get(position);
        holder.textView1.setText(knightErrant.getName());
        holder.textView2.setText(knightErrant.getSect());
        holder.textView3.setText(knightErrant.getRank()+"");

    }


    @Override
    public int getItemCount() {
        return knightErrantList.size();
    }
}
