package com.example.android.musicalstructure;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class PunkRock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // List of songs
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Sex Pistols", "Anarchy In The U.K."));
        songs.add(new Songs("Ramones", "I Wanna Be Sedated"));
        songs.add(new Songs("The Clash", "London Calling"));
        songs.add(new Songs("Talking Heads", "Psycho Killer"));
        songs.add(new Songs("Good Charlotte", "The Anthem"));
        songs.add(new Songs("Green Day", "American Idiot"));
        songs.add(new Songs("The Offspring", "The Kids Aren't Alright"));

        Adapter adapter = new Adapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent playingNowIntent = new Intent(PunkRock.this, NowPlaying.class);

                startActivity(playingNowIntent);
            }
        });

    }

}
