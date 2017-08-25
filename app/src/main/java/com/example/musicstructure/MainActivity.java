package com.example.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Now Playing button
        View nowPlaying = findViewById(R.id.nowplaying_cat);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowInt = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowInt);
            }
        });

        View albumsButton = findViewById(R.id.albums_cat);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        View artistsButton = findViewById(R.id.artists_cat);
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        View payButton = findViewById(R.id.pay_cat);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent payIntent = new Intent(MainActivity.this, Payment.class);
                startActivity(payIntent);
            }
        });
    }
}

