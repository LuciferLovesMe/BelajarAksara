package com.abim.belajaraksara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    long backTime;

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

        else if (id == R.id.card_chart){
            startActivity(new Intent(getApplicationContext(), ChartDashboardActivity.class));
        }
    }

    @Override
    public void onBackPressed() {
        if (backTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }
        else{
            Toast.makeText(ctx, "Ketuk Sekali Lagi Untuk Keluar", Toast.LENGTH_SHORT).show();
        }
        backTime = System.currentTimeMillis();
    }
}