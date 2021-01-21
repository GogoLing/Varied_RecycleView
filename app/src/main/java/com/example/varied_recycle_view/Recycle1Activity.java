package com.example.varied_recycle_view;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.varied_recycle_view.adapter.Recycle1Adapter;
import com.example.varied_recycle_view.jvo.KnightErrant;
import java.util.ArrayList;
import java.util.List;

public class Recycle1Activity extends Activity {
    private RecyclerView recyclerView;
    private Recycle1Adapter recycle1Adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle1);
        inItView();
        inItData();
    }

    private void inItData() {
        List<KnightErrant> knightErrantList=new ArrayList<>();

        KnightErrant knightErrant1=new KnightErrant();
        knightErrant1.setName("石破天");
        knightErrant1.setSect("金乌派");
        knightErrant1.setRank(1);

        KnightErrant knightErrant2=new KnightErrant();
        knightErrant2.setName("龙岛主");
        knightErrant2.setSect("侠客岛");
        knightErrant2.setRank(2);

        KnightErrant knightErrant3=new KnightErrant();
        knightErrant3.setName("木岛主");
        knightErrant3.setSect("侠客岛");
        knightErrant3.setRank(3);

        KnightErrant knightErrant4=new KnightErrant();
        knightErrant4.setName("妙谛大师");
        knightErrant4.setSect("少林");
        knightErrant4.setRank(4);


        KnightErrant knightErrant5=new KnightErrant();
        knightErrant5.setName("赏善");
        knightErrant5.setSect("侠客岛");
        knightErrant5.setRank(5);

        KnightErrant knightErrant6=new KnightErrant();
        knightErrant6.setName("罚恶");
        knightErrant6.setSect("侠客岛");
        knightErrant6.setRank(6);

        KnightErrant knightErrant7=new KnightErrant();
        knightErrant7.setName("谢烟客");
        knightErrant7.setSect("未知");
        knightErrant7.setRank(7);

        KnightErrant knightErrant8=new KnightErrant();
        knightErrant8.setName("白自在");
        knightErrant8.setSect("雪山派");
        knightErrant8.setRank(8);

        KnightErrant knightErrant9=new KnightErrant();
        knightErrant9.setName("愚茶道长");
        knightErrant9.setSect("武当派");
        knightErrant9.setRank(9);

        KnightErrant knightErrant10=new KnightErrant();
        knightErrant10.setName("天虚道长");
        knightErrant10.setSect("上清观");
        knightErrant10.setRank(10);

        KnightErrant knightErrant11=new KnightErrant();
        knightErrant11.setName("贝海石");
        knightErrant11.setSect("长乐帮");
        knightErrant11.setRank(11);

        knightErrantList.add(knightErrant1);
        knightErrantList.add(knightErrant2);
        knightErrantList.add(knightErrant3);
        knightErrantList.add(knightErrant4);
        knightErrantList.add(knightErrant5);
        knightErrantList.add(knightErrant6);
        knightErrantList.add(knightErrant7);
        knightErrantList.add(knightErrant8);
        knightErrantList.add(knightErrant9);
        knightErrantList.add(knightErrant10);
        knightErrantList.add(knightErrant11);

        recycle1Adapter=new Recycle1Adapter(knightErrantList);
        recyclerView.setAdapter(recycle1Adapter);
    }

    private void inItView() {
        recyclerView=findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
