package com.example.ajay.nepaltour;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Bhaktapur_Darbar_Square extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhaktapur__darbar__square);

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
                        String detils="Bhaktapur Durbar Square is the plaza in front of the royal palace of the old Bhaktapur Kingdom, 1,400 metres (4,600 ft) above sea level." +
                                " It is a UNESCO World Heritage Site.\n" +
                                "\n" +
                                "The Bhaktapur Durbar Square is located in the current town of Bhaktapur, " +
                                "also known as Bhadgaon,[1] which lies 13 km east of Kathmandu. " +
                                "While the complex consists of at least four distinct squares (Durbar Square," +
                                " Taumadhi Square, Dattatreya Square and Pottery Square)";
                        share.putExtra(Intent.EXTRA_TEXT,detils);
                        share.setType("Text/Plain");
                        startActivity(share.createChooser(share,"choose"));
                        return true;

                    case R.id.loc:
                        Intent h=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/dir/26.821013,75.8618016/Bhaktapur+Durbar+Square,+Durbar+square,+Bhaktapur+44800,+Nepal/@26.4030229,75.9072883,6z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb1aafec32df31:0xdda339e731af9bfd!2m2!1d85.4281023!2d27.6720744"));
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
