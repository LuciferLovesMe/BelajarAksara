package com.abim.belajaraksara;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PretestDasar {
    SharedPreferences prefs;

    public PretestDasar(Context ctx) {
        this.prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public void setPrefs(int count, int nilai){
        prefs.edit().putInt("count", count).commit();
        prefs.edit().putInt("nilai", nilai).commit();
    }

    public int getCount(){
        return prefs.getInt("count", 1);
    }

    public int getNilai(){
        return prefs.getInt("nilai", 0);
    }
}
