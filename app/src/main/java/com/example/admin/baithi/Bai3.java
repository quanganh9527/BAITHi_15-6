package com.example.admin.baithi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai3 extends AppCompatActivity {
    ListView listView;
    ArrayList<BaiHatkaraOk> arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        listView = (ListView) findViewById(R.id.listview);
        arrayList = new ArrayList<>();
        arrayList.add(new BaiHatkaraOk("A001","ACB1","xxxx"));
        arrayList.add(new BaiHatkaraOk("A001","ACB1","xxxx"));
        arrayList.add(new BaiHatkaraOk("A001","ACB1","xxxx"));
        arrayList.add(new BaiHatkaraOk("A001","ACB1","xxxx"));

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
