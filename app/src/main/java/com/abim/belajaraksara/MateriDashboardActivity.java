package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MateriDashboardActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_dashboard);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.card_dasar){
            startActivity(new Intent(getApplicationContext(), DasarActivity.class));
        }
        else if (id == R.id.card_angka){
            startActivity(new Intent(getApplicationContext(), AngkaActivity.class));
        }
        else if (id == R.id.card_swara){
            startActivity(new Intent(getApplicationContext(), SwaraActivity.class));
        }
        else if (id == R.id.card_sandhangan){
            startActivity(new Intent(getApplicationContext(), SandhanganActivity.class));
        }
        else if (id == R.id.card_pasangan){
            startActivity(new Intent(getApplicationContext(), PasanganActivity.class));
        }
    }
}