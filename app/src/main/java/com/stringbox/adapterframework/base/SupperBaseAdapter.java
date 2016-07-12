package com.stringbox.adapterframework.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/7/10.
 */
public abstract class SupperBaseAdapter<T> extends BaseAdapter {

    private View mRoot;
    private BaseViewHolder mBaseViewHolder;

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            mBaseViewHolder = getBaseHolder();
            mRoot = mBaseViewHolder.setView();
            mRoot.setTag(mBaseViewHolder);
        } else {
            mBaseViewHolder = (BaseViewHolder) mRoot.getTag();
        }
        mBaseViewHolder.setData(getData().get(i));
        return mRoot;
    }

    @Override
    public int getCount() {
        if (getData() != null) {
            return getData().size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    protected abstract BaseViewHolder getBaseHolder();

    protected abstract List<T> getData();
}
