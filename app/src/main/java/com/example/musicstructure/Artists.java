package com.example.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Min-Pc on 7/18/2017.
 */

public class Artists extends AppCompatActivity {

    @Override//home button
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_items);
        View home = findViewById(R.id.home_button);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeInt = new Intent(Artists.this, MainActivity.class);
                startActivity(homeInt);
            }
        });

        //Now Playing button
        View nowPlaying = findViewById(R.id.nowplaying_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowInt = new Intent(Artists.this, NowPlaying.class);
                startActivity(nowInt);
            }
        });

        //albums button
        View albumsButton = findViewById(R.id.albums_button);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(Artists.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        //pay button
        View payButton = findViewById(R.id.pay_button);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent payIntent = new Intent(Artists.this, Payment.class);
                startActivity(payIntent);
            }
        });
    }
}
