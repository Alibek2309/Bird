package com.example.balapan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private PlayView playView;
    private Handler handler=new Handler();
    private final static long TIMER_INTERVAL=30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playView=new PlayView(this);

        setContentView(playView);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                playView.invalidate();
            }
        },0,TIMER_INTERVAL);
    }
}
