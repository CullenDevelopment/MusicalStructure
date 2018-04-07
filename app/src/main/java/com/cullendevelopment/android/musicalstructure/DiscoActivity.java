package com.cullendevelopment.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class DiscoActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);  //Set Activity page to song_list

        // Create a list of songs/Music
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Chic", "Good Times", R.drawable.music_notes));
        songs.add(new Song("Village People", "Y.M.C.A.", R.drawable.music_notes));
        songs.add(new Song("Abba", "Dancing Queen", R.drawable.music_notes));
        songs.add(new Song("Ottawan", "D.I.S.C.O.", R.drawable.music_notes));
        songs.add(new Song("Lipps Inc.", "Funkytown", R.drawable.music_notes));
        songs.add(new Song("Boney M.", "Rasputin", R.drawable.music_notes));
        songs.add(new Song("Kool & The Gang", "Celebration", R.drawable.music_notes));
        songs.add(new Song("Donna Summer", "I Feel Love", R.drawable.music_notes));
        songs.add(new Song("George McCrae", "Rock Your Baby", R.drawable.music_notes));
        songs.add(new Song("Rose Royce", "Car Wash", R.drawable.music_notes));

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
                // Create a new intent to open the {@link PopActivity}
                Intent playIntent = new Intent(DiscoActivity.this, PlayActivity.class);

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
                Intent listHomeIntent = new Intent(DiscoActivity.this, MainActivity.class);
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
                Intent listClassicalIntent = new Intent(DiscoActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(listClassicalIntent); // opens up the Classical Activity
            }
        });

        // Find the View that shows the song list Country Activity button
        ImageView listCountry = findViewById(R.id.list_country_button);

        // Set a click listener on that View
        listCountry.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiscoActivity}
                Intent listCountryIntent = new Intent(DiscoActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(listCountryIntent); // opens up the Country Activity
            }
        });

        // Find the View that shows the Classical Activity button in the song list activity
        ImageView listDisco = findViewById(R.id.list_disco_button);
        //and hides it
        listDisco.setVisibility(View.INVISIBLE);



        // Find the View that shows the song list Pop Activity button
        ImageView listPop = findViewById(R.id.list_pop_button);

        // Set a click listener on that View
        listPop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent listPopIntent = new Intent(DiscoActivity.this, PopActivity.class);

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
                Intent listRockIntent = new Intent(DiscoActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(listRockIntent); // opens up the Rock Activity
            }
        });
    }
}
