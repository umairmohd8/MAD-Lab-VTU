package com.example.testwp;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.BitSet;
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
                if(sjb ==1){
                    drawable = getResources().getDrawable(R.drawable.img1);
                    sjb = 2;
                }
                else if (sjb ==2){
                    drawable = getResources().getDrawable(R.drawable.img2);
                    sjb =3;
                }
                else if (sjb ==3){
                    drawable = getResources().getDrawable(R.drawable.img3);
                    sjb =4;
                }
                else if (sjb ==4){
                    drawable = getResources().getDrawable(R.drawable.img4);
                    sjb =5;
                }
                else if (sjb ==5){
                    drawable = getResources().getDrawable(R.drawable.img5);
                    sjb =1;
                }

                Bitmap wallpaper = ((BitmapDrawable) drawable).getBitmap();

                try {
                    wpm.setBitmap(wallpaper);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        },0,5000);
    }
}