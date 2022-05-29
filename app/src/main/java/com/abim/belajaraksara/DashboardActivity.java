package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();
        ctx = this;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.card_materi){
            startActivity(new Intent(getApplicationContext(), MateriDashboardActivity.class));
        }
        else if (id == R.id.card_evaluasi){
            startActivity(new Intent(getApplicationContext(), SoalEvaluasiActivity.class));
        }
    }
}