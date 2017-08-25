package com.example.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Min-Pc on 7/18/2017.
 */

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_items);
        View home = findViewById(R.id.home_button);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeInt = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(homeInt);
            }
        });

        View albumsButton = findViewById(R.id.albums_button);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(NowPlaying.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        View artistsButton = findViewById(R.id.artists_button);
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(NowPlaying.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        View payButton = findViewById(R.id.pay_button);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent payIntent = new Intent(NowPlaying.this, Payment.class);
                startActivity(payIntent);
            }
        });
    }
}
