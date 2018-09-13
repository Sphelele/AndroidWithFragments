package com.example.academy_intern.stric_code;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.academy_intern.stric_code.fragment.fragmentLogin;
import com.example.academy_intern.stric_code.fragment.fragmentSplash;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(5000, 1000) { //5 seconds
            public void onTick(long millisUntilFinished) {

                getFragmentManager().beginTransaction().add(R.id.mainId , new fragmentSplash()).commit();

            }

            public void onFinish() {
                getFragmentManager().beginTransaction().replace(R.id.mainId , new fragmentLogin()).commit();
            }

        }.start();


    }
}
