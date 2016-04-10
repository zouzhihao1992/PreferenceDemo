package com.zzh.preferencedemo;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by zzh on 16/4/10.
 */
public class settingActivity1 extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
