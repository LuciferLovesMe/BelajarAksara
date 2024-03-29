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

public class LatihanAngkaActivity extends AppCompatActivity implements View.OnClickListener {
    Context ctx;
    Class[] c = new Class[9];
    Random r = new Random();
    AlertDialog dialog;
    PretestAngka p;
    int count, nilai;
    String key = "latihan_angka";
    DBHelper helper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_angka);

        ctx = this;
        helper = new DBHelper(ctx);
        db = helper.getWritableDatabase();
        SharedPreferences.Editor editor = getSharedPreferences(key, MODE_PRIVATE).edit();
        if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) > 0){
            editor.putInt("nilai", 0).commit();
            editor.putInt("count", 0).commit();
        }

        c[0] = LatihanAngkaActivity1.class;
        c[1] = LatihanAngkaActivity2.class;
        c[2] = LatihanAngkaActivity3.class;
        c[3] = LatihanAngkaActivity4.class;
        c[4] = LatihanAngkaActivity5.class;
        c[5] = LatihanAngkaActivity6.class;
        c[6] = LatihanAngkaActivity7.class;
        c[7] = LatihanAngkaActivity8.class;
        c[8] = LatihanAngkaActivity9.class;

        setTitle();
    }

    private void setTitle(){
        int num = getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) + 1;
        getSupportActionBar().setTitle("Soal Nomor " + String.valueOf(num));
    }

    public void check(){
        int c = helper.checking("angka");
        if (c >= 10){
            String query = "delete from hasil where nama = 'angka'";
            db.execSQL(query);
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), AngkaActivity.class));
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
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setTitle("Salah");
            dialog.setMessage("Jawaban Kamu Salah");
            editor.putInt("nilai", nilai + 0).commit();
            editor.putInt("count", count + 1).commit();
            if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        check();
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
                        db.execSQL("insert into hasil values(null, 'angka', '"+String.valueOf(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)))+"');");
                        startActivity(new Intent(getApplicationContext(), AngkaActivity.class));
                    }
                });
                dialog.show();
            }
        }
        else if (id == R.id.b){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setTitle("Salah");
            dialog.setMessage("Jawaban Kamu Salah");
            editor.putInt("nilai", nilai + 0).commit();
            editor.putInt("count", count + 1).commit();
            if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        check();
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
                        db.execSQL("insert into hasil values(null, 'angka', '"+String.valueOf(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)))+"');");
                        startActivity(new Intent(getApplicationContext(), AngkaActivity.class));
                    }
                });
                dialog.show();
            }
        }
        else if (id == R.id.c){
            dialog = new AlertDialog.Builder(ctx).create();
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setTitle("Benar");
            dialog.setMessage("Jawaban Kamu Benar");
            editor.putInt("nilai", nilai + 10).commit();
            editor.putInt("count", count + 1).commit();
            if (getSharedPreferences(key, MODE_PRIVATE).getInt("count", 0) < 10){
                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Lanjutkan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        check();
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
                        db.execSQL("insert into hasil values(null, 'angka', '"+String.valueOf(String.valueOf(getSharedPreferences(key, MODE_PRIVATE).getInt("nilai", 0)))+"');");
                        startActivity(new Intent(getApplicationContext(), AngkaActivity.class));
                    }
                });
                dialog.show();
            }
        }
    }
}