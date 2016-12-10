package com.example.leidong.fragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by leidong on 2016/12/10.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2, button3, button4, button5, button6, button7;
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Fragment1 fragment1 = new Fragment1();
                /*transaction.add(R.id.line, fragment1);
                transaction.commit();*/
                transaction.replace(R.id.line, fragment1, "fragment1");
                transaction.addToBackStack("fragment1");
                transaction.commit();
                break;
            case R.id.button2:
                Fragment2 fragment2 = new Fragment2();
                /*transaction.add(R.id.line, fragment2);
                transaction.commit();*/
                transaction.replace(R.id.line, fragment2, "fragment2");
                transaction.addToBackStack("fragment2");
                transaction.commit();
                break;
            case R.id.button3:
                Fragment3 fragment3 = new Fragment3();
                /*transaction.add(R.id.line, fragment3);
                transaction.commit();*/
                transaction.replace(R.id.line, fragment3, "fragment3");
                transaction.addToBackStack("fragment3");
                transaction.commit();
                break;
            case R.id.button4:
                Fragment4 fragment4 = new Fragment4();
                /*transaction.add(R.id.line, fragment4);
                transaction.commit();*/
                transaction.replace(R.id.line, fragment4, "fragment4");
                transaction.addToBackStack("fragment4");
                transaction.commit();
                break;
            case R.id.button5:
                Fragment5 fragment5 = new Fragment5();
                /*transaction.add(R.id.line, fragment5);
                transaction.commit();*/
                transaction.replace(R.id.line, fragment5, "fragment5");
                transaction.addToBackStack("fragment5");
                transaction.commit();
                break;
            case R.id.button6:
                Fragment6 fragment6 = new Fragment6();
                /*transaction.add(R.id.line, fragment6);
                transaction.commit();*/
                transaction.replace(R.id.line, fragment6, "fragment6");
                transaction.addToBackStack("fragment6");
                transaction.commit();
                break;
            case R.id.button7:
                Fragment7 fragment7 = new Fragment7();
                /*transaction.add(R.id.line, fragment7);
                transaction.commit();*/
                transaction.replace(R.id.line, fragment7, "fragment7");
                transaction.addToBackStack("fragment7");
                transaction.commit();
                break;
        }
    }
}
