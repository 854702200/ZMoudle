package com.zmoudle.Application;

import android.app.Application;

import com.zmj.zlibrary.Control.ZLibrary;


public class WordCenter extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ZLibrary.Debug(true);
    }
}
