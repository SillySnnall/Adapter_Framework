package com.stringbox.adapterframework.appliction;

import android.app.Application;

import com.stringbox.adapterframework.util.Util;

/**
 * Created by Administrator on 2016/7/10.
 */
public class AdapterAppliction extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Util.init(this);
    }
}
