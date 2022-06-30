package com.example.texttospeech;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText pitch, rate, textInput;
    Button speak;
    TextToSpeech t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pitch = findViewById(R.id.pitch);
        rate = findViewById(R.id.speech);
        textInput = findViewById(R.id.textInput);

        t = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    t.setLanguage(Locale.ENGLISH);
                }
                else {
                    Toast.makeText(MainActivity.this,"text to speech cannot be initalized",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void speak(View v){
        String text = textInput.getText().toString();
        if(pitch.getText().toString().equals("")){
            t.setPitch(1.0f);
        }
        else {
            t.setPitch(Float.parseFloat(pitch.getText().toString()));
        }
        if(rate.getText().toString().equals("")){
            t.setSpeechRate(1.0f);
        }
        else {
            t.setSpeechRate(Float.parseFloat(rate.getText().toString()));
        }
        t.speak(text,TextToSpeech.QUEUE_FLUSH,null);
    }


}

//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