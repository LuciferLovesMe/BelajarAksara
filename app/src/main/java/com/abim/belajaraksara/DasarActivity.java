package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DasarActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    MediaPlayer mp;
    CardView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasar);
        ctx = this;
        getSupportActionBar().setTitle("Aksara Dasar");

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
        tv.setText("Skor Pretest Kamu : " + String.valueOf(helper.pre("pretest_dasar")));
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        mp = null;

        if (id == R.id.pretest){
            startActivity(new Intent(getApplicationContext(), LatihanDasarActivity.class));
        }

        else if (id == R.id.latihan){
            startActivity(new Intent(getApplicationContext(), PretestDasarActivity.class));
        }

        else if (id == R.id.ha){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ha);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ha);

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

        else if (id == R.id.na){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.na);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.na);

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

        else if (id == R.id.ca){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ca);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ca);

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

        else if (id == R.id.ra){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ra);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ra);

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

        else if (id == R.id.ka){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ka);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ka);

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

        else if (id == R.id.da){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.da);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.da);

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

        else if (id == R.id.ta){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ta);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ta);

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

        else if (id == R.id.sa){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.sa);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.sa);

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

        else if (id == R.id.wa){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.wa);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.wa);

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

        else if (id == R.id.la){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.la);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.la);

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

        else if (id == R.id.pa){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.pa);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.pa);

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

        else if (id == R.id.dha){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.dha);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.dha);

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

        else if (id == R.id.ja){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ja);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ja);

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

        else if (id == R.id.ya){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ya);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ya);

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

        else if (id == R.id.nya){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.nya);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.nya);

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

        else if (id == R.id.ma){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ma);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ma);

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

        else if (id == R.id.ga){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ga);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ga);

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

        else if (id == R.id.ba){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.ba);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.ba);

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

        else if (id == R.id.tha){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.tha);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.tha);

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

        else if (id == R.id.nga){
            final Handler handler = new Handler();
            CardView card = findViewById(R.id.nga);
            card.setBackgroundColor(getResources().getColor(R.color.sunflower));
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    card.setBackgroundColor(Color.WHITE);
                }
            }, 1000);
            mp = MediaPlayer.create(ctx, R.raw.nga);

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