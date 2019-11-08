package com.zmj.zlibrary.Utils;

import android.util.Log;

import com.zmj.zlibrary.Resources.RControl;

/**
 * 调试信息
 * 2019-11-8
 */
public class deBug {


    public static void e(String msg) {
        if (RControl.debug) {
            Log.e(RControl.deStr, msg);
        }
    }

    public static void i(String msg) {
        if (RControl.debug) {
            Log.i(RControl.deStr, msg);
        }
    }
}
