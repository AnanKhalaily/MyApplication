package com.example.hp1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener,AdapterView.OnItemLongClickListener {
TextView tvname,tvpass;
    ListView lv1;
ArrayAdapter<String> arrayadapter;
    ArrayList<String> arrAnan=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        arrAnan.add("Hi First");
        arrAnan.add("Hi Second");
        arrAnan.add("Hi third");
        arrayadapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,arrAnan);
        lv1=(ListView)findViewById(R.id.lvanan);
        lv1.setAdapter(arrayadapter);
        lv1.setOnItemClickListener(this);
        lv1.setOnItemLongClickListener(this);
        Intent i=getIntent();
        String name = i.getStringExtra("email");
        String password = i.getStringExtra("password");
        tvname=(TextView)findViewById(R.id.tv1);
        tvpass=(TextView)findViewById(R.id.tv2);
        tvname.setText(name);
        tvpass.setText(password);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0) {


            Intent i = new Intent(this, Main3Activity.class);
            startActivity(i);
        }
        if(position==1){
            Intent i2=new Intent(this,MainActivity.class);
            startActivity(i2);
        }


    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==2){
            arrAnan.remove(2);
        }
        return false;
    }
}
