package com.stringbox.adapterframework.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.stringbox.adapterframework.base.BaseViewHolder;
import com.stringbox.adapterframework.base.SupperBaseAdapter;
import com.stringbox.adapterframework.util.Util;
import com.stringbox.adapterframework.R;
import com.stringbox.adapterframework.holder.AppViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/10.
 */
public class MainFragment extends Fragment{
    private ListView mShow;
    private List<String> mlist = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = View.inflate(Util.getContext(), R.layout.fragment_main, null);
        mlist.add("qwe");
        mlist.add("222");
        mlist.add("q2e");
        mlist.add("wq444e");
        mShow = (ListView) root.findViewById(R.id.lv_show);
        mShow.setAdapter(mSupperBaseAdapter);
        return root;
    }
    private SupperBaseAdapter mSupperBaseAdapter = new SupperBaseAdapter() {
        @Override
        protected BaseViewHolder getBaseHolder() {
            return new AppViewHolder();
        }

        @Override
        protected List getData() {
            return mlist;
        }
    };
}
