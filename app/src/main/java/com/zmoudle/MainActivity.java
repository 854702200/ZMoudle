package com.zmoudle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zmj.zlibrary.Skin.Skin;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Skin.init("室内防水的");
    }
}
