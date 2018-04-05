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
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Queen", "We Will Rock You", R.drawable.music_notes));
        words.add(new Word("Bryan Adams", "Summer Of '69", R.drawable.music_notes ));
        words.add(new Word("The Who", "Pinball Wizard", R.drawable.music_notes));
        words.add(new Word("Alice Cooper", "School's Out", R.drawable.music_notes));
        words.add(new Word("Black Sabbath", "Paranoid", R.drawable.music_notes));
        words.add(new Word("Kiss", "Crazy Crazy Nights", R.drawable.music_notes ));
        words.add(new Word("Free", "All Right Now", R.drawable.music_notes));
        words.add(new Word("Steppenwolf", "Born To Be Wild", R.drawable.music_notes ));
        words.add(new Word("Robert Palmer", "Addicted To Love", R.drawable.music_notes));
        words.add(new Word("Meatloaf", "Bat Out Of Hell", R.drawable.music_notes));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView =findViewById(R.id.list);

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
                Intent playIntent = new Intent(RockActivity.this, PlayActivity.class);

                // Start the new activity - opens up "Playing now" Activity view.
                startActivity(playIntent);
            }
        });
    }
}
