package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class PasanganActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasangan);
        getSupportActionBar().setTitle("Aksara Pasangan");

        ctx = this;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
    }
}