package com.example.josbo.utilesescolares;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ganaste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganaste);
        MediaPlayer mp=MediaPlayer.create(this, R.raw.ganaste);
        mp.start();
    }
    public void salir(View v) {
        finish();
    }
}
