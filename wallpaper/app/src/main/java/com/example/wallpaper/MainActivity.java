package com.example.wallpaper;

import android.app.WallpaperManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Button changewp;
    Timer mytimer;
    Drawable drawable;
    WallpaperManager wpm;

    int sjb =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytimer = new Timer();
        wpm = WallpaperManager.getInstance(this);
        changewp = findViewById(R.id.button);
        changewp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWallpaper();
            }
        });
    }
    private void setWallpaper(){
        mytimer.schedule(new TimerTask() {
            @Override
            public void run() {
                drawable = getResources().getDrawable(R.drawable.img2);
                sjb = 2;
            }
        });
    }
}