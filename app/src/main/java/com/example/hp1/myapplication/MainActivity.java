package com.example.hp1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button signin;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        signin=(Button)findViewById(R.id.button);
        signin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i= new Intent(this,Main2Activity.class);
        i.putExtra("email",et1.getText().toString());
        i.putExtra("password",et2.getText().toString());
        startActivity(i);


    }
}
