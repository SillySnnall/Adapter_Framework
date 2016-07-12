package com.stringbox.adapterframework.util;

import android.content.Context;

/**
 * Created by Administrator on 2016/7/10.
 */
public class Util {

    private static Context mContext;
    public static void init(Context testAdapterAppliction) {
        mContext = testAdapterAppliction;
    }

    public static Context getContext(){
        return mContext;
    }
}
