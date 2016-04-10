package com.zzh.preferencedemo;

import android.preference.PreferenceActivity;

import java.util.List;

/**
 * Created by zzh on 16/4/10.
 */
public class settingActivity3 extends PreferenceActivity {

    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preferences_header, target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }
}
