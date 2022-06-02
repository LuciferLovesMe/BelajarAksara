package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChartDashboardActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_dashboard);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.card_dasar){
            startActivity(new Intent(getApplicationContext(), ChartDasarActivity.class));
        }
        else if (id == R.id.card_angka){
            startActivity(new Intent(getApplicationContext(), ChartAngkaActivity.class));
        }
        else if (id == R.id.card_swara){
            startActivity(new Intent(getApplicationContext(), ChartSwaraActivity.class));
        }
        else if (id == R.id.card_sandhangan){
            startActivity(new Intent(getApplicationContext(), ChartSandhanganActivity.class));
        }
        else if (id == R.id.card_pasangan){
            startActivity(new Intent(getApplicationContext(), ChartPasanganActivity.class));
        }
        else if (id == R.id.card_evaluasi){
            startActivity(new Intent(getApplicationContext(), ChartEvaluasiActivity.class));
        }

    }
}