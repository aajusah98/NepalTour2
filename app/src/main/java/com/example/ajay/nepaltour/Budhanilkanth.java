package com.example.ajay.nepaltour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Budhanilkanth extends AppCompatActivity {
  public   Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budhanilkanth);
        BottomNavigationView navigate=findViewById(R.id.bnav);
        navigate.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.home:
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        return true;
                    case R.id.share:
                        Intent share=new Intent();
                        share.setAction(Intent.ACTION_SEND);
                        String detils="Budhanilkantha Temple, located in Budhanilkantha, Nepal,\n" +
                                "            (Nepali: बुढानिलकण्ठ मन्दिर; translation: Old Blue Throat) is a Hindu open air temple dedicated to Lord Vishnu.\n" +
                                "             Budhanilkantha Temple is situated below the Shivapuri Hill at the northern end of the Kathmandu valley.\n" +
                                "             and can be identified by a large reclining statue of Lord Vishnu.";
                        share.putExtra(Intent.EXTRA_TEXT,detils);
                        share.setType("Text/Plain");
                        startActivity(share.createChooser(share,"choose"));
                        return true;

                    case R.id.loc:
                        Intent h=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/dir/26.8210049,75.8619718/Budhanilkantha,+Nepal/@26.4030229,75.875399,6z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb1c257b30a06f:0x9819a88de0ee753!2m2!1d85.3652959!2d27.7654382"));
                        startActivity(h);
                        return true;


                }


                return false;
            }
        });


        if(getSupportActionBar()!=null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
