package com.cullendevelopment.android.musicalstructure;

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
        setContentView(R.layout.word_list); //Show the word list ContentView

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dolly Parton", "Jolene", R.drawable.music_notes));
        words.add(new Word("Glen Campbell", "Wichita Lineman", R.drawable.music_notes));
        words.add(new Word("Billy Ray Cyrus", "Achy Breaky Heart", R.drawable.music_notes));
        words.add(new Word("John Denver", "Annie's Song", R.drawable.music_notes));
        words.add(new Word("Tammy Wynette", "Stand By Your Man", R.drawable.music_notes));
        words.add(new Word("Hunter Hayes", "Wanted", R.drawable.music_notes));
        words.add(new Word("Willie Nelson", "Always On My Mind", R.drawable.music_notes));
        words.add(new Word("Bobbie Gentry", "Ode To Billie Joe", R.drawable.music_notes));
        words.add(new Word("Lynn Anderson", "Rose Garden", R.drawable.music_notes));
        words.add(new Word("Patsy Cline", "Crazy", R.drawable.music_notes));

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
                Intent playIntent = new Intent(CountryActivity.this, PlayActivity.class);

                // Start the new activity - opens up "Playing now" Activity view.
                startActivity(playIntent);
            }
        });
    }
}
