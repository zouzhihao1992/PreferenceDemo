package com.zzh.preferencedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zzh on 16/4/10.
 */
public class settingActivity2 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new settingFragment())
                .commit();
    }


}
