package com.x1opya.mydreamtimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
    }

    @Override
    protected void onStart() {
        super.onStart();

        final Calendar end = Calendar.getInstance();
        final Calendar now = Calendar.getInstance();
        end.set(2018,Calendar.OCTOBER,10,18,20,00);
        new CountDownTimer(end.getTimeInMillis()-now.getTimeInMillis(),1000){
            @Override
            public void onTick(long l) {
                FormatToTime time = new FormatToTime(l);
                tv.setText(time.toString());
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
