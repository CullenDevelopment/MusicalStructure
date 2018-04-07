package com.cullendevelopment.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Layout for the word list
        setContentView(R.layout.song_list);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Vaughan Williams", "The Lark Ascending", R.drawable.music_notes));
        songs.add(new Song("Pachelbel", "Canon in D, P.37", R.drawable.music_notes));
        songs.add(new Song("Ludvicio Einaudi", "I Giorni", R.drawable.music_notes));
        songs.add(new Song("Gershwin", "Rhapsody in Blue", R.drawable.music_notes));
        songs.add(new Song("Barber", "Adagio for Strings, Op.11", R.drawable.music_notes));
        songs.add(new Song("Holst", "The Planets, Op 32-4", R.drawable.music_notes));
        songs.add(new Song("Debussey", "Clare de Lune", R.drawable.music_notes));
        songs.add(new Song("Allegri", "Miserere Mei", R.drawable.music_notes));
        songs.add(new Song("Elgar", "The Enigma Variations - Nimrod", R.drawable.music_notes));
        songs.add(new Song("Vivaldi", "THe Four Seasons - Spring", R.drawable.music_notes));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter =
                new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Find the View that shows the play now button
        ImageView play = findViewById(R.id.playing_now_button);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent playIntent = new Intent(ClassicalActivity.this, PlayActivity.class);

                // Start the new activity - opens up "Playing now" Activity view.
                startActivity(playIntent);
            }
        });

        // Find the View that shows the playing now home button
        ImageView listHome = findViewById(R.id.list_home_button);

        // Set a click listener on that View
        listHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent listHomeIntent = new Intent(ClassicalActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(listHomeIntent); // opens up the Home/Main Page Activity
            }
        });

        // Find the View that shows the Classical Activity button in the song list activity
        ImageView listClassical = findViewById(R.id.list_classical_button);
        //and hides it
        listClassical.setVisibility(View.INVISIBLE);

        // Find the View that shows the playing now Country Activity button
        ImageView listCountry = findViewById(R.id.list_country_button);

        // Set a click listener on that View
        listCountry.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CountryActivity}
                Intent listCountryIntent = new Intent(ClassicalActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(listCountryIntent); // opens up the Country Activity
            }
        });

        // Find the View that shows the playing now Disco Activity button
        ImageView listDisco = findViewById(R.id.list_disco_button);

        // Set a click listener on that View
        listDisco.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiscoActivity}
                Intent listDiscoIntent = new Intent(ClassicalActivity.this, DiscoActivity.class);

                // Start the new activity
                startActivity(listDiscoIntent); // opens up the Disco Activity
            }
        });

        // Find the View that shows the song list Pop Activity button
        ImageView listPop = findViewById(R.id.list_pop_button);

        // Set a click listener on that View
        listPop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent listPopIntent = new Intent(ClassicalActivity.this, PopActivity.class);

                // Start the new activity
                startActivity(listPopIntent); // opens up the Pop Activity
            }
        });

        // Find the View that shows the playing now Rock Activity button
        ImageView listRock = findViewById(R.id.list_rock_button);

        // Set a click listener on that View
        listRock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockActivity}
                Intent listRockIntent = new Intent(ClassicalActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(listRockIntent); // opens up the Rock Activity
            }
        });
    }

}
