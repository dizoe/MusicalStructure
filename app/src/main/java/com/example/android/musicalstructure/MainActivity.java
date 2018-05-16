package com.example.android.musicalstructure;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Alternative rock category
        Button alternative = (Button) findViewById(R.id.alternative);

        alternative.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent alterIntent = new Intent(MainActivity.this, AlternativeRock.class);

                startActivity(alterIntent);
            }
        });

        // Hard rock category
        Button hard = (Button) findViewById(R.id.hard);


        hard.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent hardIntent = new Intent(MainActivity.this, HardRock.class);

                startActivity(hardIntent);
            }
        });

        // Punk rock category
        Button punk = (Button) findViewById(R.id.punk);

        punk.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent punkIntent = new Intent(MainActivity.this, PunkRock.class);

                startActivity(punkIntent);
            }
        });

        // Rock and Roll category
        Button rocknroll = (Button) findViewById(R.id.rocknroll);


        rocknroll.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent rocknrollIntent = new Intent(MainActivity.this, RocknRoll.class);

                startActivity(rocknrollIntent);
            }
        });

    }

}
