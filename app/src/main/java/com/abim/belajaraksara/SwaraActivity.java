package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SwaraActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swara);
        getSupportActionBar().setTitle("Aksara Swara");

        ctx = this;

        setText();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
        finish();
    }

    void setText(){
        DBHelper helper = new DBHelper(ctx);
        TextView tv = findViewById(R.id.tv_nilai);
        tv.setText("Skor Pretest Kamu : " + String.valueOf(helper.pre("pretest_swara")));
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.a){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.a);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
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
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.e);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
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
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.i);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
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
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.o);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
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
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.u);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
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

        else if (id == R.id.pretest){
            startActivity(new Intent(getApplicationContext(), PretestSwaraActivity.class));
        }

        else if (id == R.id.latihan){
            startActivity(new Intent(getApplicationContext(), LatihanSwaraActivity.class));
        }
    }
}