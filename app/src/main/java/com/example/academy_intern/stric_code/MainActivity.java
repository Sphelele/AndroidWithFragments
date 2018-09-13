package com.example.academy_intern.stric_code;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.academy_intern.stric_code.fragment.fragmentLogin;

public class MainActivity extends AppCompatActivity {

    ImageView zoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(2000, 1000) { //5 seconds
            public void onTick(long millisUntilFinished) {

                zoom =  (ImageView) findViewById(R.id.imageView);
                final Animation zoomAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
                zoom.startAnimation(zoomAnimation);

            }

            public void onFinish() {
                zoom.setVisibility(View.GONE);
                getFragmentManager().beginTransaction().replace(R.id.mainId , new fragmentLogin()).commit();
            }

        }.start();


    }
}
