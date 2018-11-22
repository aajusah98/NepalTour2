package com.example.ajay.nepaltour;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Swayembhunath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swayembhunath);
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
                        String detils="Find peace and prayers on the little hillock of Swaymbhunath in the northwest of the Kathmandu Valley. " +
                                "Also known as the Monkey Temple among visitors from abroad, Swayambhunath sits atop its hill, overlooking most parts of the valley. This is a good place to catch panoramic views of the city. The site itself has stood as a hallmark of faith and harmony for centuries. " +
                                "The glory of Kathmandu Valley is said to have started from this point.";
                        share.putExtra(Intent.EXTRA_TEXT,detils);
                        share.setType("Text/Plain");
                        startActivity(share.createChooser(share,"choose"));
                        return true;

                    case R.id.loc:
                        Intent h=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/26.8157164,75.8591939/Swayambhu+Maha+Chaitya,+Kathmandu,+Nepal/@26.9623576,75.8507774,6z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x39eb188d9b82c8ad:0xae31bde410797bf7!2m2!1d85.2903796!2d27.7147791!3e0"));
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
