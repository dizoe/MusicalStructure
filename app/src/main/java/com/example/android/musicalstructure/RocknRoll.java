package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RocknRoll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Chuck Berry", "Johnny B. Goode"));
        songs.add(new Songs("Elvis Presley", "Jailhouse Rock"));
        songs.add(new Songs("Fats Domino", "Blueberry Hill"));
        songs.add(new Songs("Little Richard", "Good Golly Miss Molly"));
        songs.add(new Songs("The Everly Brothers", "Bye Bye Love"));
        songs.add(new Songs("The Kingsmen", "Louie Louie"));
        songs.add(new Songs("Eddie Cochran", "C'mon Everybody"));


        Adapter adapter = new Adapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent playingNowIntent = new Intent(RocknRoll.this, NowPlaying.class);

                startActivity(playingNowIntent);
            }
        });
    }

}
