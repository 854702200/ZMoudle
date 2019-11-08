package com.zmoudle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.zmj.zlibrary.Utils.UtilShape;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.bt_2)
    Button bt_2;
    @BindView(R.id.dialog_menu_background)
    LinearLayout linearLayoutMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        UtilShape.init(this, 10);
    }


    @OnClick(R.id.bt_1)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_1:
                UtilShape.yellow(linearLayoutMenu);
                break;
        }
    }
}
