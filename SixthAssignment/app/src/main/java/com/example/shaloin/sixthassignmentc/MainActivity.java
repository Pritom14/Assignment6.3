package com.example.shaloin.sixthassignmentc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataHandler display_data[]=new DataHandler[]{
                new DataHandler(R.drawable.youtube,"Youtube","Youtube Description"),
                new DataHandler(R.drawable.blogger,"Blogger","Blogger Description")
        };

        MyAdapter myAdapter=new MyAdapter(this,R.layout.row,display_data);
        listView=(ListView)findViewById(R.id.listID);
        listView.setAdapter(myAdapter);
    }
}
