package com.example.counter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Handler myhandler = new Handler();
    int i= 0;
    public Runnable Threadcount = new Runnable() {
        @Override
        public void run() {
            tv.setText(""+i);
            i++;
            myhandler.postDelayed(Threadcount,1000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView2);
    }

    public void startCount(View v){
        i =0;
        myhandler.postDelayed(Threadcount,1000);
    }

    public void stopCounter(View v){
        myhandler.removeCallbacks(Threadcount);
    }
}