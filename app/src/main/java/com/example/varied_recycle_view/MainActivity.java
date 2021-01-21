package com.example.varied_recycle_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inItView();

    }

    private void inItView() {
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent1=new Intent();
                intent1.setClass(MainActivity.this,Recycle1Activity.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2=new Intent();
                intent2.setClass(MainActivity.this,Recycle2Activity.class);
                startActivity(intent2);
                break;
            case R.id.button3:

                break;
        }

    }
}
