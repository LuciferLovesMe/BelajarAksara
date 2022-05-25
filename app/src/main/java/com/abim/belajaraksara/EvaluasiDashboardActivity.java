package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EvaluasiDashboardActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi_dashboard);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.card_evaluasi){
            startActivity(new Intent(getApplicationContext(), EvaluasiActivity.class));
        }
        else if (id == R.id.card_tebak){
            startActivity(new Intent(getApplicationContext(), TebakActivity.class));
        }
        else if (id == R.id.card_baca){
            startActivity(new Intent(getApplicationContext(), BacaActivity.class));
        }
    }
}