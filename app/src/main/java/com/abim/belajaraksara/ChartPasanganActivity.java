package com.abim.belajaraksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ChartPasanganActivity extends AppCompatActivity {
    Context ctx;
    ArrayList<BarEntry> arrayList;
    LineChart bar;
    ArrayList<ILineDataSet> iLineDataSets = new ArrayList<>();
    LineDataSet lds;
    BarDataSet ds;
    BarData data;
    SQLiteDatabase db;
    DBHelper helper;
    ArrayList l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_pasangan);

        ctx = this;

        bar = findViewById(R.id.chart);
        helper = new DBHelper(ctx);
//        arrayList = new ArrayList();
//        arrayList = helper.getData("select * from hasil where nama = 'pasangan'");
//        ds = new BarDataSet(arrayList, "Hasil");
//        data = new BarData(ds);
//        bar.setData(data);
//        ds.setColors(ColorTemplate.COLORFUL_COLORS);
//        ds.setValueTextColor(Color.BLACK);
//        ds.setValueTextSize(16f);

        lds = new LineDataSet(helper.getLine("select * from hasil where nama = 'pasangan'"), "Hasil");
        iLineDataSets.add(lds);
        LineData ld = new LineData(iLineDataSets);
        lds.setColor(Color.BLUE);
        lds.setCircleColor(Color.GREEN);
        lds.setDrawCircles(true);
        lds.setDrawCircleHole(true);
        lds.setLineWidth(5);
        lds.setCircleRadius(5);
        lds.setCircleHoleRadius(10);
        lds.setValueTextSize(15);
        lds.setValueTextColor(Color.BLACK);
        YAxis y = bar.getAxisLeft();
        YAxis ya = bar.getAxisRight();
        y.setAxisMaximum(100);
        y.setAxisMinimum(0);
        ya.setAxisMaximum(100);
        ya.setAxisMinimum(0);
        bar.setData(ld);
        bar.invalidate();
        getSupportActionBar().setTitle("Grafik Pasangan");
    }
}