package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlternativeRock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // List of songs
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Nirvana", "Smells Like Teen Spirit"));
        songs.add(new Songs("Radiohead", "Go Slowly"));
        songs.add(new Songs("Sonic Youth", "Superstar"));
        songs.add(new Songs("Oasis", "Wonderwall"));
        songs.add(new Songs("Joy Division", "Love Will Tear Us Apart"));
        songs.add(new Songs("Red Hot Chili Peppers", "Under The Bridge"));
        songs.add(new Songs("Depeche Mode", "Suffer Well"));

        Adapter adapter = new Adapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent playingNowIntent = new Intent(AlternativeRock.this, NowPlaying.class);

                startActivity(playingNowIntent);
            }
        });
    }

}
