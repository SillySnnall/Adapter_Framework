package com.stringbox.adapterframework.base;

import android.view.View;

/**
 * Created by Administrator on 2016/7/10.
 */
public abstract class BaseViewHolder<T> {

    public abstract View setView();

    public abstract void setData(T data);
}
