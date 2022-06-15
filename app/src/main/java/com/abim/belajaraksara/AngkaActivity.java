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

public class AngkaActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);
        getSupportActionBar().setTitle("Angka Jawa");

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
        tv.setText("Skor Pretest Kamu : " + String.valueOf(helper.pre("pretest_angka")));
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        mp = null;

        if (id == R.id.satu){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.satu);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.satu);

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

        else if (id == R.id.dua){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.dua);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.dua);

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

        else if (id == R.id.tiga){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.tiga);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.tiga);

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

        else if (id == R.id.empat){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.empat);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.empat);

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

        else if (id == R.id.lima){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.lima);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.lima);

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

        else if (id == R.id.enam){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.enam);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.enam);

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

        else if (id == R.id.tujuh){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.tujuh);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.tujuh);

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

        else if (id == R.id.delapan){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.delapan);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.delapan);

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

        else if (id == R.id.sembilan){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.sembilan);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.sembilan);

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

        else if (id == R.id.nol){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.nol);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.nol);

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
            startActivity(new Intent(getApplicationContext(), PretestAngkaActivity.class));
        }

        else if (id == R.id.latihan){
            startActivity(new Intent(getApplicationContext(), LatihanAngkaActivity.class));
        }
    }
}