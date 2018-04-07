package com.cullendevelopment.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

        // Find the View that shows the playing now home button
        ImageView home = findViewById(R.id.home_button);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(PlayActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent); // opens up the Home/Main Page Activity
            }
        });

        // Find the View that shows the playing now Classical Activity button
        ImageView classical = findViewById(R.id.classical_button);

        // Set a click listener on that View
        classical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent classicalIntent = new Intent(PlayActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(classicalIntent); // opens up the Classical Activity
            }
        });

        // Find the View that shows the playing now Country Activity button
        ImageView country = findViewById(R.id.country_button);

        // Set a click listener on that View
        country.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CountryActivity}
                Intent countryIntent = new Intent(PlayActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(countryIntent); // opens up the Country Activity
            }
        });

        // Find the View that shows the playing now Disco Activity button
        ImageView disco = findViewById(R.id.disco_button);

        // Set a click listener on that View
        disco.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiscoActivity}
                Intent discoIntent = new Intent(PlayActivity.this, DiscoActivity.class);

                // Start the new activity
                startActivity(discoIntent); // opens up the Disco Activity
            }
        });

        // Find the View that shows the playing now Pop Activity button
        ImageView pop = findViewById(R.id.pop_button);

        // Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent popIntent = new Intent(PlayActivity.this, PopActivity.class);

                // Start the new activity
                startActivity(popIntent); // opens up the Home/Main Page Activity
            }
        });

        // Find the View that shows the playing now Rock Activity button
        ImageView rock = findViewById(R.id.rock_button);

        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockActivity}
                Intent rockIntent = new Intent(PlayActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(rockIntent); // opens up the Rock Activity
            }
        });
    }

}