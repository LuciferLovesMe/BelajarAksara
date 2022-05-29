package com.abim.belajaraksara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class PretestAngkaActivity8 extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    Class[] c = new Class[8];
    Random r = new Random();
    AlertDialog dialog;
    PretestAngka p;
    int count, nilai;
    String key = "pretest_angka";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pretest_angka8);

        ctx = this;
        p = new PretestAngka(ctx);
        count = p.getCount();

        c[0] = PretestAngkaActivity1.class;
        c[1] = PretestAngkaActivity9.class;
        c[2] = PretestAngkaActivity3.class;
        c[3] = PretestAngkaActivity4.class;
        c[4] = PretestAngkaActivity5.class;
        c[5] = PretestAngkaActivity6.class;
        c[6] = PretestAngkaActivity7.class;
        c[7] = PretestAngkaActivity2.class;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        SharedPreferences.Editor editor = getSharedPreferences(key, MODE_PRIVATE).edit();
        nilai = getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0);
        count = getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0);
        if (id == R.id.a){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Salah");
            dialog.setMessage("Jawaban Kamu Salah");
            editor.putInt("nilai", nilai + 0).commit();
            editor.putInt("count", count + 1).commit();
            if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
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
                dialog.setMessage("Nilai Kamu " + String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), AngkaActivity.class));
                    }
                });
                dialog.show();
            }
        }
        else if (id == R.id.b){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Salah");
            dialog.setMessage("Jawaban Kamu Salah");
            editor.putInt("nilai", nilai + 0).commit();
            editor.putInt("count", count + 1).commit();
            if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
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
                dialog.setMessage("Nilai Kamu " + String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), AngkaActivity.class));
                    }
                });
                dialog.show();
            }
        }
        else if (id == R.id.c){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Benar");
            dialog.setMessage("Jawaban Kamu Benar");
            editor.putInt("nilai", nilai + 10).commit();
            editor.putInt("count", count + 1).commit();
            if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
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
                dialog.setMessage("Nilai Kamu " + String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), AngkaActivity.class));
                    }
                });
                dialog.show();
            }
        }
    }
}