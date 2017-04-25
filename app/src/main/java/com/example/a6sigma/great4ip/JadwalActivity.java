package com.example.a6sigma.great4ip;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class JadwalActivity extends Activity {
protected ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] Pil;
    String[] Ltn;
    String[] Gbr;


@Override
public void onCreate(Bundle savedInstanceState){
super.onCreate(savedInstanceState);
         setContentView(R.layout.schedule_main01);

        lv = (ListView) findViewById(R.id.lv);

        Pil = new String[] {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY",  "SUNDAY"};

  // Ltn = new String[] {"Anjing Jinak", "Kambing Hutan", "Kucing-Kucingan", "Kuda-kudaan", "Naga Bonar"};
Gbr = new String[] {Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day),
                    Integer.toString(R.drawable.day) };


    mylist = new ArrayList<HashMap<String,String>>();
for (int i = 0; i < Pil.length; i++) {
    map = new HashMap<String, String>();
    map.put("list", Pil[i]);
    //map.put("latin", Ltn[i]);
    map.put("gbr", Gbr[i]);
    mylist.add(map);
    }

    Adapter = new SimpleAdapter(this, mylist, R.layout.layout_isi_lv,
            new String[] {"list", "latin", "gbr"}, new int[] {R.id.tv_nama, R.id.tv_ltn, R.id.imV});
lv.setAdapter(Adapter);
    }

}