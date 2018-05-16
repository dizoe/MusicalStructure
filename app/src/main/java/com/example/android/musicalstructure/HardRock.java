package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HardRock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // List of songs
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Rainbow", "Catch The Rainbow"));
        songs.add(new Songs("Pearl Jam", "Alive"));
        songs.add(new Songs("A Perfect Circle", "The Outsider"));
        songs.add(new Songs("Led Zeppelin", "Stairway to Heaven"));
        songs.add(new Songs("Deep Purple", "Smoke On The Water"));
        songs.add(new Songs("Scorpions", "Wind Of Change"));
        songs.add(new Songs("Avenged Sevenfold", "Hail To The King"));

        Adapter adapter = new Adapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent playingNowIntent = new Intent(HardRock.this, NowPlaying.class);

                startActivity(playingNowIntent);
            }
        });
    }

}
