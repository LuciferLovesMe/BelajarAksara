package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SandhanganActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandhangan);
        getSupportActionBar().setTitle("Sandhangan");

        ctx = this;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.pretest){
            startActivity(new Intent(getApplicationContext(), PretestSandhanganActivity.class));
        }

        else if (id == R.id.latihan){
            startActivity(new Intent(getApplicationContext(), LatihanSandhanganActivity.class));
        }
    }
}