package com.stringbox.adapterframework.holder;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.stringbox.adapterframework.base.BaseViewHolder;
import com.stringbox.adapterframework.util.Util;
import com.stringbox.adapterframework.R;

/**
 * Created by Administrator on 2016/7/10.
 */
public class AppViewHolder<T> extends BaseViewHolder<T> {
    private static final String TAG = "MainViewHolder";
    public TextView mView;
    public Button mButton;

    @Override
    public View setView() {
//        Log.e(TAG, "setView: " + root);
        View root = View.inflate(Util.getContext(), R.layout.lv_item, null);
        Log.d(TAG, "setView: " + root);
        mView = (TextView) root.findViewById(R.id.tv_show);
        mButton = (Button) root.findViewById(R.id.btn_show);
        return root;
    }

    @Override
    public void setData(T data) {
        mView.setText(data + "");
        mButton.setText(data + "");
    }

}
