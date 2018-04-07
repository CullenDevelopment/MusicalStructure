package com.cullendevelopment.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Queen", "We Will Rock You", R.drawable.music_notes));
        songs.add(new Song("Bryan Adams", "Summer Of '69", R.drawable.music_notes ));
        songs.add(new Song("The Who", "Pinball Wizard", R.drawable.music_notes));
        songs.add(new Song("Alice Cooper", "School's Out", R.drawable.music_notes));
        songs.add(new Song("Black Sabbath", "Paranoid", R.drawable.music_notes));
        songs.add(new Song("Kiss", "Crazy Crazy Nights", R.drawable.music_notes ));
        songs.add(new Song("Free", "All Right Now", R.drawable.music_notes));
        songs.add(new Song("Steppenwolf", "Born To Be Wild", R.drawable.music_notes ));
        songs.add(new Song("Robert Palmer", "Addicted To Love", R.drawable.music_notes));
        songs.add(new Song("Meatloaf", "Bat Out Of Hell", R.drawable.music_notes));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter =
                new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml file.
        ListView listView =findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Find the View that shows the Now Playing button
        ImageView play = findViewById(R.id.playing_now_button);


        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(RockActivity.this, PlayActivity.class);

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
                Intent listHomeIntent = new Intent(RockActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(listHomeIntent); // opens up the Home/Main Page Activity
            }
        });

        // Find the View that shows the playing now Classical Activity button
        ImageView listClassical = findViewById(R.id.list_classical_button);

        // Set a click listener on that View
        listClassical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Classical button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent listClassicalIntent = new Intent(RockActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(listClassicalIntent); // opens up the Classical Activity
            }
        });

        // Find the View that shows the song list Country Activity button
        ImageView listCountry = findViewById(R.id.list_country_button);

        // Set a click listener on that View
        listCountry.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Country button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CountryActivity}
                Intent listCountryIntent = new Intent(RockActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(listCountryIntent); // opens up the Country Activity
            }
        });

        // Find the View that shows the song list Disco Activity button
        ImageView listDisco = findViewById(R.id.list_disco_button);

        // Set a click listener on that View
        listDisco.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Disco button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiscoActivity}
                Intent listDiscoIntent = new Intent(RockActivity.this, DiscoActivity.class);

                // Start the new activity
                startActivity(listDiscoIntent); // opens up the Disco Activity
            }
        });





        // Find the View that shows the playing now Pop Activity button
        ImageView listPop = findViewById(R.id.list_pop_button);

        // Set a click listener on that View
        listPop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Pop button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent listPopIntent = new Intent(RockActivity.this, PopActivity.class);

                // Start the new activity
                startActivity(listPopIntent); // opens up the Pop Activity
            }
        });

        // Find the View that shows the Rock Activity button in the song list activity
        ImageView listRock = findViewById(R.id.list_rock_button);
        //and hides it
        listRock.setVisibility(View.INVISIBLE);
    }
}
