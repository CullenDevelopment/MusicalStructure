package com.cullendevelopment.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main); //Set Opening View to Main page

        // Find the View that shows the classical category
        TextView classical = findViewById(R.id.classical);

        // Set a click listener on that View
        classical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                startActivity(classicalIntent); // opens up the Classical list
            }
        });

        // Find the View that shows the country category
        TextView country = findViewById(R.id.country);

        // Set a click listener on that View
        country.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CountryActivity}
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(countryIntent); // opens up the Country list
            }
        });

        // Find the View that shows the disco category
        TextView disco = findViewById(R.id.disco);

        // Set a click listener on that View
        disco.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiscoActivity}
                Intent discoIntent = new Intent(MainActivity.this, DiscoActivity.class);

                // Start the new activity
                startActivity(discoIntent); // opens up the Disco list
            }
        });

        // Find the View that shows the pop category
        TextView pop = findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                // Start the new activity
                startActivity(popIntent); // opens up the Pop list
            }
        });

        // Find the View that shows the rock category
        TextView rock = findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(rockIntent); // opens up the Rock list
            }
        });
    }
}
