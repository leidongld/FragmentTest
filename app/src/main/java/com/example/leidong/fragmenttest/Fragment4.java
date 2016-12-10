package com.example.leidong.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by leido on 2016/12/10.
 */

public class Fragment4 extends Fragment {
    private String TAG = "Fragment4";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Fragment4 --->>> onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment4, null);
        Log.i(TAG, "Fragment4 --->>> onCreateView");
        return view;
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG, "Fragment4 --->>> onPause");
    }
}
