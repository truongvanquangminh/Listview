package com.example.activitylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.android, "Android"));
        arr_bean.add(new ListViewBean(R.drawable.java, "Java"));
        arr_bean.add(new ListViewBean(R.drawable.python,"Python"));
        arr_bean.add(new ListViewBean(R.drawable.mysql, "MySQL"));
        arr_bean.add(new ListViewBean(R.drawable.php, "PHP"));
        adapter=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(adapter);
    }
}