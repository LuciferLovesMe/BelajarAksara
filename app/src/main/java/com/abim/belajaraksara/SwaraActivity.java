package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SwaraActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swara);
        getSupportActionBar().setTitle("Aksara Swara");

        ctx = this;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.a){
            mp = MediaPlayer.create(ctx, R.raw.a);

            mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mp.start();
                }
            });

            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mp.release();
                }
            });
        }

        else if (id == R.id.e){
            mp = MediaPlayer.create(ctx, R.raw.e);

            mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mp.start();
                }
            });

            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mp.release();
                }
            });
        }

        else if (id == R.id.i){
            mp = MediaPlayer.create(ctx, R.raw.i);

            mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mp.start();
                }
            });

            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mp.release();
                }
            });
        }

        else if (id == R.id.o){
            mp = MediaPlayer.create(ctx, R.raw.o);

            mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mp.start();
                }
            });

            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mp.release();
                }
            });
        }

        else if (id == R.id.u){
            mp = MediaPlayer.create(ctx, R.raw.u);

            mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mp.start();
                }
            });

            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mp.release();
                }
            });
        }
    }
}