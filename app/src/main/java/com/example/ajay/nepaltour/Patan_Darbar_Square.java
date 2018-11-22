package com.example.ajay.nepaltour;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Patan_Darbar_Square extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patan__darbar__square);
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
                        String detils="Patan Durbar Square is situated at the centre of the city of Lalitpur in Nepal. It is one of the three Durbar Squares in the Kathmandu Valley, all of which are UNESCO World Heritage Sites. " +
                                "One of its attraction is the ancient royal palace where " +
                                "the Malla Kings of Lalitpur resided.\n" +
                                "\n" +
                                "The Durbar Square is a marvel of Newar architecture. " +
                                "The Square floor is tiled with red bricks.[1] " +
                                "There are many temples and idols in the area. " +
                                "The main temples are aligned opposite of the western face of the palace";
                        share.putExtra(Intent.EXTRA_TEXT,detils);
                        share.setType("Text/Plain");
                        startActivity(share.createChooser(share,"choose"));
                        return true;

                    case R.id.loc:
                        Intent h=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/dir/26.821013,75.8618016/Patan,+Nepal/@26.4030229,75.8528927,6z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb19d3cf18ca51:0xd10ec3d53656e18f!2m2!1d85.3187914!2d27.6644011"));
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
