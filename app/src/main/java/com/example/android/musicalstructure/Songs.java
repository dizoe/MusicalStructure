package com.example.android.musicalstructure;


public class Songs {

    private String mArtist;
    private String mSong;

    public Songs(String author, String title) {
        mArtist = author;
        mSong = title;
    }

    public String getAuthor() {

        return mArtist;
    }

    public String getTitle() {
        return mSong;
    }
}

