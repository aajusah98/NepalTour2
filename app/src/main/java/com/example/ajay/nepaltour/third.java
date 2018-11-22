package com.example.ajay.nepaltour;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }


    public void kathmandu(View view) {
        Intent intent=new Intent(this,Kathmandu.class);
        startActivity(intent);
    }

    public void pokhara(View view) {
        Intent intent=new Intent(this,pokhara.class);
        startActivity(intent);
    }

    public void mustang(View view) {
        Intent intent=new Intent(this,Mustang.class);
        startActivity(intent);

    }


    public void jankpur(View view) {

        Intent intent=new Intent(this,Janakpur.class);
        startActivity(intent);

    }
}
