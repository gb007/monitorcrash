package com.hollysmart.catchcrashapplication;

import android.app.Application;
import android.content.Context;
import com.hollysmart.monitorcrash.crash.CrashHandler;
import com.hollysmart.monitorcrash.crash.CrashListener;
import com.hollysmart.monitorcrash.crash.CrashToolUtils;

public class App extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        initCrash();

        sContext = this;

    }

    public static Context getAppContext() {
        return sContext;
    }

    private void initCrash() {

        CrashHandler.getInstance().init(this, new CrashListener() {
            /**
             * 重启app
             */
            @Override
            public void againStartApp() {
                System.out.println("崩溃重启----------againStartApp------");
//                System.exit(0);
                CrashToolUtils.reStartApp1(App.this,2000);
                //CrashToolUtils.reStartApp2(App.this,2000, MainActivity.class);
                //CrashToolUtils.reStartApp3(App.this);
            }

            /**
             * 自定义上传crash，支持开发者上传自己捕获的crash数据
             * @param ex                        ex
             */
            @Override
            public void recordException(Throwable ex) {
                System.out.println("崩溃重启----------recordException------");
                //自定义上传crash，支持开发者上传自己捕获的crash数据
                //StatService.recordException(getApplication(), ex);
            }
        });
    }
}
