package com.stringbox.adapterframework.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.stringbox.adapterframework.R;
import com.stringbox.adapterframework.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_main, new MainFragment()).commit();
    }
}
