package com.demo.nick.flowlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    FlowLayout flowLayout;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flowLayout= (FlowLayout) findViewById(R.id.fl);
        add= (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              TextView view= (TextView) getLayoutInflater().inflate(R.layout.item_view,null);
                ViewGroup.MarginLayoutParams marginLayoutParams=new ViewGroup.MarginLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                marginLayoutParams.setMarginStart(10);
                view.setLayoutParams(marginLayoutParams);
                flowLayout.addView(view);
            }
        });
    }
}
