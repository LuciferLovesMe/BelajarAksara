package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.*;

import java.util.ArrayList;
import java.util.List;

public class ChartDasarActivity extends AppCompatActivity {
    Context ctx;
    ArrayList<BarEntry> arrayList;
    BarChart bar;
    BarDataSet ds;
    BarData data;
    SQLiteDatabase db;
    DBHelper helper;
    ArrayList l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_dasar);

        ctx = this;

        bar = findViewById(R.id.chart);
        helper = new DBHelper(ctx);
        arrayList = new ArrayList();
        arrayList = helper.getData("select * from hasil where nama = 'dasar'");
        ds = new BarDataSet(arrayList, "Hasil");
        data = new BarData(ds);
        bar.setData(data);
        ds.setColors(ColorTemplate.COLORFUL_COLORS);
        ds.setValueTextColor(Color.BLACK);
        ds.setValueTextSize(16f);
    }
}