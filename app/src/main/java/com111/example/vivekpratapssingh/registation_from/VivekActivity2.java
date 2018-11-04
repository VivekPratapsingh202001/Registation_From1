package com111.example.vivekpratapssingh.registation_from;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VivekActivity2 extends AppCompatActivity {
    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivek2);
        tex=findViewById(R.id.tex);
        Intent intent=getIntent();

        String fname = intent.getStringExtra("firstname");
        String lname = intent.getStringExtra("lastname");
        String address= intent.getStringExtra("address");
        String contect= intent.getStringExtra("contect");

        tex.setText("First name: "+fname+"\nLast name: "+lname+"\naddress: "+address+"\ncontect:"+contect);
    }

}
