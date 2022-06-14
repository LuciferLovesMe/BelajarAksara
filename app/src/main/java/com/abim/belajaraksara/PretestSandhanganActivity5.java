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

public class PretestSandhanganActivity5 extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    Class[] c = new Class[8];
    Random r = new Random();
    AlertDialog dialog;
    PretestAngka p;
    int count, nilai;
    String key = "pretest_sandhangan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pretest_sandhangan5);

        ctx = this;

        c[0] = PretestSandhanganActivity1.class;
        c[1] = PretestSandhanganActivity2.class;
        c[2] = PretestSandhanganActivity3.class;
        c[3] = PretestSandhanganActivity4.class;
        c[4] = PretestSandhanganActivity9.class;
        c[5] = PretestSandhanganActivity6.class;
        c[6] = PretestSandhanganActivity7.class;
        c[7] = PretestSandhanganActivity8.class;

        setTitle();
    }

    private void setTitle(){
        int num = getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) + 1;
        getSupportActionBar().setTitle("Soal Nomor " + String.valueOf(num));
    }

    void ins(String s){
        DBHelper helper = new DBHelper(ctx);
        SQLiteDatabase db;
        db = helper.getWritableDatabase();
        String query = "insert into hasil values(null, 'pretest_sandhangan', '"+s+"')";
        db.execSQL(query);
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
                                startActivity(new Intent(getApplicationContext(), SandhanganActivity.class));
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
                                startActivity(new Intent(getApplicationContext(), SandhanganActivity.class));
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
                                startActivity(new Intent(getApplicationContext(), SandhanganActivity.class));
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