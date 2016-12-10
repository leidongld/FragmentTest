package com.example.leidong.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by leidong on 2016/12/10.
 */

public class Fragment5 extends Fragment {
    private String TAG = "Fragment5";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Fragment5 --->>> onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment5, null);
        Log.i(TAG, "Fragment5 --->>> onCreateView");
        return view;
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG, "Fragment --->>> onPause");
    }
}
