package com.example.musicstructure;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Min-Pc on 7/18/2017.
 */

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_items);
        View home = findViewById(R.id.home_button);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeInt = new Intent(Albums.this, MainActivity.class);
                startActivity(homeInt);
            }
        });

        //Now Playing button
        View nowPlaying = findViewById(R.id.nowplaying_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowInt = new Intent(Albums.this, NowPlaying.class);
                startActivity(nowInt);
            }
        });

        View artistsButton = findViewById(R.id.artists_button);
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(Albums.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        View payButton = findViewById(R.id.pay_button);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent payIntent = new Intent(Albums.this, Payment.class);
                startActivity(payIntent);
            }
        });
    }
}
