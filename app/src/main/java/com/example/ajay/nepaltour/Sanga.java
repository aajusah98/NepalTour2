package com.example.ajay.nepaltour;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Sanga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanga);
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
                        String detils="Kailashnath Mahadev Statue (Nepali: कैलाशनाथ महादेव) is the world's tallest Shiva statue.It is situated in Sanga, on the border of the Bhaktapur and Kavrepalanchwok districts in Nepal, about 20 km from Kathmandu.\n" +
                                "\n" +
                                "The statue is 143 feet (43.5 m) in height, and was made using copper, zinc, concrete, and steel." +
                                " According to the List of statues by height," +
                                " Kailashnath Mahadev is the world's fortieth-tallest statue, " +
                                "four places after the Statue of Liberty. ";
                        share.putExtra(Intent.EXTRA_TEXT,detils);
                        share.setType("Text/Plain");
                        startActivity(share.createChooser(share,"choose"));
                        return true;

                    case R.id.loc:
                        Intent h=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/dir/26.821013,75.8618016/Sanga,+Nepal/@26.4030229,75.9351775,6z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb0f08e1c3c3e5:0x197473cab017cf42!2m2!1d85.4839604!2d27.6347385"));
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
