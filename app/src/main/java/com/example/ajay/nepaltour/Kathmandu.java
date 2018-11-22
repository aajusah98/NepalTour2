package com.example.ajay.nepaltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Kathmandu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kathmandu);
        if(getSupportActionBar()!=null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }

    }




    public void pasunath(View view)
    {
        Intent i=new Intent (this,Pashupatinath.class);
        startActivity(i);
        }
    public void swayambhunath (View view)
    {
        Intent j=new Intent (this,Swayembhunath.class);
        startActivity(j);
    }
    public void Budhanilkanth (View view)
    {
        Intent j=new Intent (this,Budhanilkanth.class);
        startActivity(j);
    }
    public void Bhaktapur_Darbar_Square (View view)
    {
        Intent j=new Intent (this,Bhaktapur_Darbar_Square.class);
        startActivity(j);
    }
    public void Sanga (View view)
    {
        Intent j=new Intent (this,Sanga.class);
        startActivity(j);
    }
    public void Patan_Darbar_Square (View view)
    {
        Intent j=new Intent (this,Patan_Darbar_Square.class);
        startActivity(j);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }



}

