package com.zmj.zlibrary.Control;

import com.zmj.zlibrary.Resources.RControl;

/**
 * 控制器
 * 2019-11-8
 */
public class ZLibrary {

    /**
     * 初始化
     */
    public static void init() {

    }

    /**
     * 调试
     *
     * @param debug
     */
    public static void Debug(Boolean debug) {
        RControl.debug = debug;
    }

    /**
     * 调试
     * 输出首
     *
     * @param debug
     * @param destr
     */
    public static void Debug(Boolean debug, String destr) {
        RControl.debug = debug;
        RControl.deStr = destr;
    }

}
