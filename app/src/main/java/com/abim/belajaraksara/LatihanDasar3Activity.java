package com.abim.belajaraksara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class LatihanDasar3Activity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    Class[] c = new Class[9];
    Random r = new Random();
    AlertDialog dialog;
    LatihanDasar l;
    int count, nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_dasar3);

        ctx = this;
        l = new LatihanDasar(ctx);
        count = l.getCount();

        c[0] = LatihanDasar1Activity.class;
        c[1] = LatihanDasar2Activity.class;
        c[2] = LatihanDasarActivity.class;
        c[3] = LatihanDasar4Activity.class;
        c[4] = LatihanDasar5Activity.class;
        c[5] = LatihanDasar6Activity.class;
        c[6] = LatihanDasar7Activity.class;
        c[7] = LatihanDasar8Activity.class;
        c[8] = LatihanDasar9Activity.class;
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        if (id == R.id.a){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Salah");
            dialog.setMessage("Jawaban Kamu Salah");
            l.setPrefs(count + 1, nilai + 0);
            if (l.getCount() < 10){
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(ctx, c[r.nextInt(c.length)]));
                    }
                });
                dialog.show();
            }
            else{
                dialog = new AlertDialog.Builder(ctx).create();
                dialog.setTitle("Latihan Selesai");
                dialog.setMessage("Nilai Kamu " + String.valueOf(l.getNilai()));
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), DasarActivity.class));
                    }
                });
                dialog.show();
            }
        }
        else if (id == R.id.b){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Salah");
            dialog.setMessage("Jawaban Kamu Salah");
            l.setPrefs(count + 1, nilai + 0);
            if (l.getCount() < 10){
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(ctx, c[r.nextInt(c.length)]));
                    }
                });
                dialog.show();
            }
            else{
                dialog = new AlertDialog.Builder(ctx).create();
                dialog.setTitle("Latihan Selesai");
                dialog.setMessage("Nilai Kamu " + String.valueOf(l.getNilai()));
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), DasarActivity.class));
                    }
                });
                dialog.show();
            }
        }
        else if (id == R.id.c){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Benar");
            dialog.setMessage("Jawaban Kamu Salah");
            l.setPrefs(count + 1, nilai + 0);
            if (l.getCount() < 10){
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(ctx, c[r.nextInt(c.length)]));
                    }
                });
                dialog.show();
            }
            else{
                dialog = new AlertDialog.Builder(ctx).create();
                dialog.setTitle("Latihan Selesai");
                dialog.setMessage("Nilai Kamu " + String.valueOf(l.getNilai()));
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), DasarActivity.class));
                    }
                });
                dialog.show();
            }
        }
    }
}