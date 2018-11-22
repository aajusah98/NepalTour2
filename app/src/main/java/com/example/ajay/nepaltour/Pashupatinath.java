package com.example.ajay.nepaltour;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Pashupatinath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pashupatinath);



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
                        String detils="One of the most sacred Hindu temples of Nepal – Pashupatinath Temple is located on both banks of Bagmati River on the eastern outskirts of Kathmandu.\n" +
                                "\n" +
                                "Pashupatinath is the most important temple dedicated to god Shiva. Every year this temple attracts hundreds of elderly followers of Hinduism.\n" +
                                "\n" +
                                "They arrive here to find shelter for the last several weeks of their lives, to meet death, be cremated on the banks of the river and travel their last journey with the waters of the sacred river Bagmati, which later meets the holy river Ganges. Hinduists from every corner of Nepal and India are arriving here to die.\n" +
                                "\n" +
                                "It is believed that those who die in Pashupatinath Temple are reborn as a human, regardless of any misconduct that could worsen their karma. The exact day of their death is predicted by astrologers of the temple. If you are attracted to the places where the spirit of death can be felt, then consider Pashupatinath as your first destination. It is a temple with special atmosphere of death; " +
                                "death is present in almost every ritual and every corner of it";
                        share.putExtra(Intent.EXTRA_TEXT,detils);
                        share.setType("Text/Plain");
                        startActivity(share.createChooser(share,"choose"));
                        return true;

                    case R.id.loc:
                        Intent h=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/26.8157164,75.8591939/Shree+Pashupatinath+Temple,+Pashupati+Nath+Road+44621,+Kathmandu+44600,+Nepal/@27.8039662,76.0937554,6z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x39eb197922ea1e89:0x739090deff2ba4a6!2m2!1d85.3485809!2d27.71062!3e0"));
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
    public void psupati(View view)
    {
        Intent h=new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(h);


    }

}
