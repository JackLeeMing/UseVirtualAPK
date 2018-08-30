package com.ttl.ljk.com.napplication;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.util.Log;
import android.view.View;

import com.didi.virtualapk.PluginManager;

import java.io.File;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("TAG","onCreate");
        CustomActivityOnCrash.install(this);
        load1();
        load2();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        PluginManager.getInstance(base).init();
        Log.e("TAG","attach");
    }

    public void load1(){
        PluginManager pluginManager = PluginManager.getInstance(this);
        //此处是当查看插件apk是否存在,如果存在就去加载(比如修改线上的bug,把插件apk下载到sdcard的根目录下取名为Demo.apk)
        File apk = new File(Environment.getExternalStorageDirectory()+ File.separator + "cityrms" + File.separator + "app/lib.apk");
        //File apk = new File(Environment.getExternalStorageDirectory(), "Demo.apk");
        if (apk.exists()) {
            try {
                pluginManager.loadPlugin(apk);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void load2(){
        PluginManager pluginManager = PluginManager.getInstance(this);
        //此处是当查看插件apk是否存在,如果存在就去加载(比如修改线上的bug,把插件apk下载到sdcard的根目录下取名为Demo.apk)
        File apk = new File(Environment.getExternalStorageDirectory()+ File.separator + "cityrms" + File.separator + "app/lpp.apk");
        //File apk = new File(Environment.getExternalStorageDirectory(), "Demo.apk");
        if (apk.exists()) {
            try {
                pluginManager.loadPlugin(apk);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
