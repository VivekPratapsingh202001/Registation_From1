    package com111.example.vivekpratapssingh.registation_from;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

    EditText fname,lname,address,content;
    String f,l,c,a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.fname);
        address=findViewById(R.id.address);
        content=findViewById(R.id.content);

    }
    public void sumbit(View View)
    {
      f=fname.getText().toString();
      l=lname.getText().toString();
      a=address.getText().toString();
      c=content.getText().toString();
        Intent myIntent =new Intent(this, VivekActivity2.class);
        myIntent.putExtra("firstname", f);
        myIntent.putExtra("lastname", l);
        myIntent.putExtra("address",a);
        myIntent.putExtra("contect",c);
        startActivity(myIntent);


    }
}
