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

public class PretestPasanganActivity2 extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    Class[] c = new Class[8];
    Random r = new Random();
    AlertDialog dialog;
    PretestAngka p;
    int count, nilai;
    String key = "pretest_pasangan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pretest_pasangan2);

        ctx = this;
        c[0] = PretestPasanganActivity9.class;
        c[1] = PretestPasanganActivity1.class;
        c[2] = PretestPasanganActivity3.class;
        c[3] = PretestPasanganActivity4.class;
        c[4] = PretestPasanganActivity5.class;
        c[5] = PretestPasanganActivity6.class;
        c[6] = PretestPasanganActivity7.class;
        c[7] = PretestPasanganActivity8.class;
    }

    void ins(String s){
        DBHelper helper = new DBHelper(ctx);
        SQLiteDatabase db;
        db = helper.getWritableDatabase();
        String query = "insert into hasil values(null, 'pretest_pasangan', '"+s+"')";
        db.execSQL(query);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), PasanganActivity.class));
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
                                ins(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                                startActivity(new Intent(getApplicationContext(), PasanganActivity.class));
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
                                ins(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                                startActivity(new Intent(getApplicationContext(), PasanganActivity.class));
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
                                ins(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)));
                                startActivity(new Intent(getApplicationContext(), PasanganActivity.class));
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