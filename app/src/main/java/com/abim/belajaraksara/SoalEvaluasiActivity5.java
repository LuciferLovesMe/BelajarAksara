package com.abim.belajaraksara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class SoalEvaluasiActivity5 extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    Class[] c = new Class[8];
    Random r = new Random();
    AlertDialog dialog;
    PretestAngka p;
    int count, nilai;
    String key = "evaluasi";
    DBHelper helper;
    SQLiteDatabase db ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_evaluasi5);

        ctx = this;
        helper = new DBHelper(ctx);
        db = helper.getWritableDatabase();

        c[0] = SoalEvaluasiActivity9.class;
        c[1] = SoalEvaluasiActivity2.class;
        c[2] = SoalEvaluasiActivity3.class;
        c[3] = SoalEvaluasiActivity4.class;
        c[4] = SoalEvaluasiActivity1.class;
        c[5] = SoalEvaluasiActivity6.class;
        c[6] = SoalEvaluasiActivity7.class;
        c[7] = SoalEvaluasiActivity8.class;

        setTitle();
    }

    private void setTitle(){
        int num = getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) + 1;
        getSupportActionBar().setTitle("Soal Nomor " + String.valueOf(num));
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
        finish();
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
            dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
                        startActivity(new Intent(getApplicationContext(), c[r.nextInt(c.length)]));
                    }
                    else{
                        dialog = new AlertDialog.Builder(ctx).create();
                        dialog.setTitle("Latihan Selesai");
                        dialog.setMessage("Nilai Kamu " + String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                        dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                db.execSQL("insert into hasil values(null, 'evaluasi', '"+String.valueOf(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)))+"');");
                                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                            }
                        });
                        dialog.show();
                    }
                }
            });
            dialog.show();
        }
        else if (id == R.id.b){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Benar");
            dialog.setMessage("Jawaban Kamu Benar");
            editor.putInt("nilai", nilai + 10).commit();
            editor.putInt("count", count + 1).commit();
            dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
                        startActivity(new Intent(getApplicationContext(), c[r.nextInt(c.length)]));
                    }
                    else{
                        dialog = new AlertDialog.Builder(ctx).create();
                        dialog.setTitle("Latihan Selesai");
                        dialog.setMessage("Nilai Kamu " + String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                        dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                db.execSQL("insert into hasil values(null, 'evaluasi', '"+String.valueOf(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)))+"');");
                                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                            }
                        });
                        dialog.show();
                    }
                }
            });
            dialog.show();
        }
        else if (id == R.id.c){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Salah");
            dialog.setMessage("Jawaban Kamu Salah");
            editor.putInt("nilai", nilai + 0).commit();
            editor.putInt("count", count + 1).commit();
            dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
                        startActivity(new Intent(getApplicationContext(), c[r.nextInt(c.length)]));
                    }
                    else{
                        dialog = new AlertDialog.Builder(ctx).create();
                        dialog.setTitle("Latihan Selesai");
                        dialog.setMessage("Nilai Kamu " + String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                        dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                db.execSQL("insert into hasil values(null, 'evaluasi', '"+String.valueOf(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)))+"');");
                                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                            }
                        });
                        dialog.show();
                    }
                }
            });
            dialog.show();
        }
        else if (id == R.id.d){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setTitle("Salah");
            dialog.setMessage("Jawaban Kamu Salah");
            editor.putInt("nilai", nilai + 0).commit();
            editor.putInt("count", count + 1).commit();
            dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
                        startActivity(new Intent(getApplicationContext(), c[r.nextInt(c.length)]));
                    }
                    else{
                        dialog = new AlertDialog.Builder(ctx).create();
                        dialog.setTitle("Latihan Selesai");
                        dialog.setMessage("Nilai Kamu " + String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                        dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                db.execSQL("insert into hasil values(null, 'evaluasi', '"+String.valueOf(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)))+"');");
                                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                            }
                        });
                        dialog.show();
                    }
                }
            });
            dialog.show();
        }
    }
}