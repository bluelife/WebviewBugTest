package com.bluelife.test.webviewbugtest;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by slomka.jin on 2016/1/26.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(this,"900018237",true);
    }
}
