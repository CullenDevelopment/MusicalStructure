package com.cullendevelopment.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.now_playing);
        // This page is invoked when "Now Playing" button is pressed

        //This view doesn't do much at the moment but could be linked to show "Playing Now"
        // by setText commands on Artist and track fields. We are viewing a list of Artists and
        // Tracks at the moment which is not interactive so I cannot return one artist and track to
        // dynamically fill these fields.

    }

}