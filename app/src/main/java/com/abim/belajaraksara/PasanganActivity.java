package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PasanganActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasangan);
        getSupportActionBar().setTitle("Aksara Pasangan");

        ctx = this;

        setText();
    }

    void setText(){
        DBHelper helper = new DBHelper(ctx);
        TextView tv = findViewById(R.id.tv_nilai);
        tv.setText("Skor Pretest Kamu : " + String.valueOf(helper.pre("pretest_pasangan")));
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.pretest){
            startActivity(new Intent(getApplicationContext(), PretestPasanganActivity.class));
        }

        else if (id == R.id.latihan){
            startActivity(new Intent(getApplicationContext(), LatihanPasanganActivity.class));
        }
    }
}