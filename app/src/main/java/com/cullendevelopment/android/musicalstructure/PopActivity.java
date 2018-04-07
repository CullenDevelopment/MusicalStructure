package com.cullendevelopment.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Rita Ora", "Your Song", R.drawable.music_notes));
        songs.add(new Song("One Direction", "History", R.drawable.music_notes));
        songs.add(new Song("Train", "Play That Song", R.drawable.music_notes));
        songs.add(new Song("Duo Lipa", "Be The One", R.drawable.music_notes));
        songs.add(new Song("Sia", "The Greatest", R.drawable.music_notes));
        songs.add(new Song("Bruno Mars", "24K Magic", R.drawable.music_notes));
        songs.add(new Song("Galantis", "No Money", R.drawable.music_notes));
        songs.add(new Song("Disciples", "On My Mind", R.drawable.music_notes));
        songs.add(new Song("Louisa Johnson", "Best Behaviour", R.drawable.music_notes));
        songs.add(new Song("Fleur East", "Sax", R.drawable.music_notes));

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
                Intent playIntent = new Intent(PopActivity.this, PlayActivity.class);

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
                Intent listHomeIntent = new Intent(PopActivity.this, MainActivity.class);
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
                Intent listClassicalIntent = new Intent(PopActivity.this, ClassicalActivity.class);

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
                // Create a new intent to open the {@link CountryActivity}
                Intent listCountryIntent = new Intent(PopActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(listCountryIntent); // opens up the Country Activity
            }
        });

        // Find the View that shows the song list Disco Activity button
        ImageView listDisco = findViewById(R.id.list_disco_button);

        // Set a click listener on that View
        listDisco.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiscoActivity}
                Intent listDiscoIntent = new Intent(PopActivity.this, DiscoActivity.class);

                // Start the new activity
                startActivity(listDiscoIntent); // opens up the Disco Activity
            }
        });

        // Find the View that shows the Pop Activity button in the song list activity
        ImageView listPop = findViewById(R.id.list_pop_button);
        //and hides it
        listPop.setVisibility(View.GONE);



        // Find the View that shows the playing now Rock Activity button
        ImageView listRock = findViewById(R.id.list_rock_button);

        // Set a click listener on that View
        listRock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockActivity}
                Intent listRockIntent = new Intent(PopActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(listRockIntent); // opens up the Rock Activity
            }
        });
    }
}
