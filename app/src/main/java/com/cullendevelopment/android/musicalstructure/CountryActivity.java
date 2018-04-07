package com.cullendevelopment.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list); //Show the Song list ContentView

        // Create a list of songs/Music
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Dolly Parton", "Jolene", R.drawable.music_notes));
        songs.add(new Song("Glen Campbell", "Wichita Lineman", R.drawable.music_notes));
        songs.add(new Song("Billy Ray Cyrus", "Achy Breaky Heart", R.drawable.music_notes));
        songs.add(new Song("John Denver", "Annie's Song", R.drawable.music_notes));
        songs.add(new Song("Tammy Wynette", "Stand By Your Man", R.drawable.music_notes));
        songs.add(new Song("Hunter Hayes", "Wanted", R.drawable.music_notes));
        songs.add(new Song("Willie Nelson", "Always On My Mind", R.drawable.music_notes));
        songs.add(new Song("Bobbie Gentry", "Ode To Billie Joe", R.drawable.music_notes));
        songs.add(new Song("Lynn Anderson", "Rose Garden", R.drawable.music_notes));
        songs.add(new Song("Patsy Cline", "Crazy", R.drawable.music_notes));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter =
                new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        // Find the View that shows the play now button
        ImageView play = findViewById(R.id.playing_now_button);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(CountryActivity.this, PlayActivity.class);

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
                Intent listHomeIntent = new Intent(CountryActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(listHomeIntent); // opens up the Home/Main Page Activity
            }
        });

        // Find the View that shows the playing now Classical Activity button
        ImageView listClassical = findViewById(R.id.list_classical_button);

        // Set a click listener on that View
        listClassical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent listClassicalIntent = new Intent(CountryActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(listClassicalIntent); // opens up the Classical Activity
            }
        });

        // Find the View that shows the Classical Activity button in the song list activity
        ImageView listCountry = findViewById(R.id.list_country_button);
        //and hides it
        listCountry.setVisibility(View.GONE);


        // Find the View that shows the playing now Disco Activity button
        ImageView listDisco = findViewById(R.id.list_disco_button);

        // Set a click listener on that View
        listDisco.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiscoActivity}
                Intent listDiscoIntent = new Intent(CountryActivity.this, DiscoActivity.class);

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
                Intent listPopIntent = new Intent(CountryActivity.this, PopActivity.class);

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
                Intent listRockIntent = new Intent(CountryActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(listRockIntent); // opens up the Rock Activity
            }
        });
    }
}
