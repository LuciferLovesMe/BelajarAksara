package com.abim.belajaraksara;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.IntegerRes;

import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    SQLiteDatabase sql;
    private static final String DB_NAME = "result.db", TABLE_NAME = "nilai", clm1 = "id", clm2 = "nama", clm3 = "nilai";
    private static final int DB_VERSION = 1;

    public DBHelper(Context ctx){
        super(ctx, DB_NAME, null, DB_VERSION);
        sql = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE hasil("+clm1+" INTEGER PRIMARY KEY AUTOINCREMENT, "+clm2+" TEXT NULL, "+clm3+" TEXT NULL)";
        Log.d("Data", "onCreate : "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DB_NAME);
    }

    public ArrayList<BarEntry> getData(String query){
        ArrayList<BarEntry> l = new ArrayList<>();
        DBHelper dh;
//        String query = "select * from hasil where nama = 'dasar'";
        Cursor cursor = getReadableDatabase().rawQuery(query, null);
        int i = 1;

        while (cursor.moveToNext()){
            l.add(new BarEntry(Float.valueOf(cursor.getString(0)), Float.valueOf(cursor.getString(2))));
        }
//        cursor.close();
//        l.add(new BarEntry(1, 20));
//        l.add(new BarEntry(1, 30));
//        l.add(new BarEntry(1, 40));
//        l.add(new BarEntry(1, 50));

        return l;
    }

    public int checking(String nama){
        String query = "select count(*) from hasil where nama = '"+nama+"'";
        Cursor cursor = getReadableDatabase().rawQuery(query, null);
        cursor.moveToFirst();
        int count = cursor.getInt(0);
        cursor.close();

        return  count;
    }

    public int pre(String nama){
        if (checking(nama) > 0){

            String query = "select * from hasil where nama = '"+nama+"' limit 1";
            Cursor cursor = getReadableDatabase().rawQuery(query, null);
            cursor.moveToFirst();
            int count = cursor.getInt(2);
            cursor.close();
            return count;
        }

        return 0;
    }
}
