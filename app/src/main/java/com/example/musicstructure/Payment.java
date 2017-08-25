package com.example.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Min-Pc on 7/18/2017.
 */

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_items);
        View home = findViewById(R.id.home_button);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeInt = new Intent(Payment.this, MainActivity.class);
                startActivity(homeInt);
            }
        });

        //Now Playing button
        View nowPlaying = findViewById(R.id.nowplaying_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowInt = new Intent(Payment.this, NowPlaying.class);
                startActivity(nowInt);
            }
        });


        View albumsButton = findViewById(R.id.albums_button);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(Payment.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        View artistsButton = findViewById(R.id.artists_button);
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(Payment.this, Artists.class);
                startActivity(artistsIntent);
            }
        });
    }
}