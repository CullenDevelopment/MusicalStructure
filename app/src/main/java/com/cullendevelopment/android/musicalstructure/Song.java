package com.cullendevelopment.android.musicalstructure;

public class Song{

    /**
     * private string value
     * Artist Translation
     */
    private String mArtistName;

    /**
     * private string value
     * Track Translation
     */
    private String mTrackName;

    // Drawable resource ID
    private int mImageResourceId;

    // Constructor for the list items in the Word ArrayList
    public Song(String artistTranslation, String trackTranslation, int playImage) {
        mArtistName = artistTranslation;
        mTrackName = trackTranslation;
        mImageResourceId = playImage;
    }

    /**
     * Get the Artist Translation
     */
    public String getArtistName() {

        return mArtistName; // Returns each version of the Artist in Word Arraylist object
    }

    /**
     * Get the Track Translation
     */
    public String getTrackName() {

        return mTrackName; //  Returns each version of the track in Word Arraylist object
    }

    /**
     * Get the image resource ID
     */
    public int getPlayImage() {

        return mImageResourceId;
        //returns the image resource associated with each Word Arraylist object
    }
}


