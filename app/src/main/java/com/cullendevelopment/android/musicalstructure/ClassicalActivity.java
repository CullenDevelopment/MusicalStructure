package com.cullendevelopment.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Layout for the word list
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Vaughan Williams", "The Lark Ascending", R.drawable.music_notes));
        words.add(new Word("Pachelbel", "Canon in D, P.37", R.drawable.music_notes));
        words.add(new Word("Ludvicio Einaudi", "I Giorni", R.drawable.music_notes));
        words.add(new Word("Gershwin", "Rhapsody in Blue", R.drawable.music_notes));
        words.add(new Word("Barber", "Adagio for Strings, Op.11", R.drawable.music_notes));
        words.add(new Word("Holst", "The Planets, Op 32-4", R.drawable.music_notes));
        words.add(new Word("Debussey", "Clare de Lune", R.drawable.music_notes));
        words.add(new Word("Allegri", "Miserere Mei", R.drawable.music_notes));
        words.add(new Word("Elgar", "The Enigma Variations - Nimrod", R.drawable.music_notes));
        words.add(new Word("Vivaldi", "THe Four Seasons - Spring", R.drawable.music_notes));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
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
    }

}