package com.example.worldclock2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class MainActivity extends AppCompatActivity {

    //variables
    ImageView image1, image2, image3, image4, image5, image6;
    TextView timezone1, timezone2, timezone3, timezone4, timezone5, timezone6;
    TextView country1, country2, country3, country4, country5, country6;
    TextView clock1, clock2, clock3, clock4, clock5, clock6;
    Button changeFormat24, changeFormat12;

//Create time format for each country

    //Dubai
    SimpleDateFormat dtwentyfourDF = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat dtwelveDF = new SimpleDateFormat("hh:mm:ss a");
    //London
    SimpleDateFormat ltwentyfourDF = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat ltwelveDF = new SimpleDateFormat("hh:mm:ss a");
    //Tokyo
    SimpleDateFormat t24DF = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat t12DF = new SimpleDateFormat("hh:mm:ss a");
    //Sydney
    SimpleDateFormat s24DF = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat s12DF = new SimpleDateFormat("hh:mm:ss a");

    //Ney York
    SimpleDateFormat n24DF = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat n12DF = new SimpleDateFormat("hh:mm:ss a");

    //Singapore
    SimpleDateFormat c24DF = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat c12DF = new SimpleDateFormat("hh:mm:ss a");

    Calendar c = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //declare views
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);

        timezone1 = findViewById(R.id.timezone1);
        timezone2 = findViewById(R.id.timezone2);
        timezone3 = findViewById(R.id.timezone3);
        timezone4 = findViewById(R.id.timezone4);
        timezone5 = findViewById(R.id.timezone5);
        timezone6 = findViewById(R.id.timezone6);

        country1 = findViewById(R.id.country1);
        country2 = findViewById(R.id.country2);
        country3 = findViewById(R.id.country3);
        country4 = findViewById(R.id.country4);
        country5 = findViewById(R.id.country5);
        country6 = findViewById(R.id.country6);


        clock1 = findViewById(R.id.clock1);
        clock2 = findViewById(R.id.clock2);
        clock3 = findViewById(R.id.clock3);
        clock4 = findViewById(R.id.clock4);
        clock5 = findViewById(R.id.clock5);
        clock6 = findViewById(R.id.clock6);


        changeFormat24 = findViewById(R.id.changeFormat24);
        changeFormat12 = findViewById(R.id.changeFormat12);


        //set the variables for my views
        timezone1.setText("Dubai");
        timezone2.setText("London");
        timezone3.setText("Tokyo");
        timezone4.setText("New York");
        timezone5.setText("Sydney");
        timezone6.setText("Singapore");


        country1.setText("United Arab Emirates");
        country2.setText("United Kingdom");
        country3.setText("Japan");
        country4.setText("United States of America");
        country5.setText("Australia");
        country6.setText("Singapore");


        //set time zones 12 hrs

        dtwelveDF.setTimeZone(TimeZone.getTimeZone("GMT+4")); // dubai

        ltwelveDF.setTimeZone(TimeZone.getTimeZone("GMT+1")); // london

        t12DF.setTimeZone(TimeZone.getTimeZone("GMT+9")); // tokyo

        s12DF.setTimeZone(TimeZone.getTimeZone("GMT+10")); //syd

        n12DF.setTimeZone(TimeZone.getTimeZone("GMT-4")); //New York

        c12DF.setTimeZone(TimeZone.getTimeZone("GMT+8")); //china


        //set time zones 24hrs

        dtwentyfourDF.setTimeZone(TimeZone.getTimeZone("GMT+4")); // dubai

        ltwentyfourDF.setTimeZone(TimeZone.getTimeZone("GMT+1")); // london


        t24DF.setTimeZone(TimeZone.getTimeZone("GMT+9")); // tokyo

        s24DF.setTimeZone(TimeZone.getTimeZone("GMT+10")); //syd


        n24DF.setTimeZone(TimeZone.getTimeZone("GMT-4")); //New York

        c24DF.setTimeZone(TimeZone.getTimeZone("GMT+8")); //china


        //set text to 12hr
        clock1.setText(dtwelveDF.format(c.getTime()));
        clock2.setText(ltwelveDF.format(c.getTime()));
        clock3.setText(t12DF.format(c.getTime()));
        clock4.setText(n12DF.format(c.getTime()));
        clock5.setText(s12DF.format(c.getTime()));
        clock6.setText(c12DF.format(c.getTime()));


        //create a button to change to 24hr format
        changeFormat24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cD = Calendar.getInstance();
                clock1.setText(dtwentyfourDF.format(cD.getTime()));

                Calendar cL = Calendar.getInstance();
                clock2.setText(ltwentyfourDF.format(cL.getTime()));

                Calendar cT = Calendar.getInstance();
                clock3.setText(t24DF.format(cL.getTime()));

                Calendar cS = Calendar.getInstance();
                clock5.setText(s24DF.format(cS.getTime()));

                Calendar cN = Calendar.getInstance();
                clock4.setText(n24DF.format(cN.getTime()));

                Calendar cC = Calendar.getInstance();
                clock6.setText(c24DF.format(cN.getTime()));


            }
        });
        //create a button to change to 12hr format
        changeFormat12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cD = Calendar.getInstance();
                clock1.setText(dtwelveDF.format(cD.getTime()));

                Calendar cL = Calendar.getInstance();
                clock2.setText(ltwelveDF.format(cL.getTime()));

                Calendar cT = Calendar.getInstance();
                clock3.setText(t12DF.format(cT.getTime()));

                Calendar cS = Calendar.getInstance();
                clock5.setText(s12DF.format(cS.getTime()));

                Calendar cN = Calendar.getInstance();
                clock4.setText(n12DF.format(cN.getTime()));

                Calendar cC = Calendar.getInstance();
                clock6.setText(c12DF.format(cN.getTime()));

            }
        });
    }
}