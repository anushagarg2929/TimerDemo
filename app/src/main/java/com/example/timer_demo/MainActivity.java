package com.example.timer_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // First method
        Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //Insert code to be run every second
                Log.i("Runnable has run!", "A second must have passed.....");

                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);

        // Second Method
        new CountDownTimer(10000,1000){
            public void onTick(long millisecondUntilDone){
                // CountDown is counting down(every second)
                Log.i("Seconds left", String.valueOf(millisecondUntilDone/1000));
            }
            public void onFinish(){
                // Countdown is finished! (after 10 seconds)
                Log.i("Done!", "Countdown Timer Finished.");
            }
        };
    }
}