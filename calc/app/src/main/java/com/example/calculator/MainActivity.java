package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double i1 = 0, i2 =0;
    TextView edittext1;
    boolean Add, Sub, Mul, Div, Rem, deci;
    Button but0,but1, but2, but3, but4, but5, but6, but7, but8, but9, but_Add, but_Sub, but_Mul,but_Div,
            but_Equ, but_Del, but_Dot, but_Rem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but0 = (Button) findViewById(R.id.button0);
        but1 = (Button) findViewById(R.id.button1);
        but2 = (Button) findViewById(R.id.button2);
        but3 = (Button) findViewById(R.id.button3);
        but4 = (Button) findViewById(R.id.button4);
        but5 = (Button) findViewById(R.id.button5);
        but6 = (Button) findViewById(R.id.button6);
        but7 = (Button) findViewById(R.id.button7);
        but8 = (Button) findViewById(R.id.button8);
        but9 = (Button) findViewById(R.id.button9);

        but_Add = (Button) findViewById(R.id.button11);
        but_Sub = (Button) findViewById(R.id.button12);
        but_Mul = (Button) findViewById(R.id.button13);
        but_Div= (Button) findViewById(R.id.button14);
        but_Equ = (Button) findViewById(R.id.button15);
        but_Rem = (Button) findViewById(R.id.button18);
        but_Del = (Button) findViewById(R.id.button16);
        but_Dot = (Button) findViewById(R.id.button10);

        edittext1 = (TextView) findViewById(R.id.textView);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "1");
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "3");
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "4");
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "5");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "6");
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "7");
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "8");
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "9");
            }
        });
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext1.setText(edittext1.getText() + "0");
            }
        });

        but_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittext1.getText().length() != 0 ){
                    i1 = Float.parseFloat(edittext1.getText() + "");

                    Add = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        but_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittext1.getText().length() != 0 ){
                    i1 = Float.parseFloat(edittext1.getText() + "");

                    Sub = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        but_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittext1.getText().length() != 0 ){
                    i1 = Float.parseFloat(edittext1.getText() + "");

                    Mul = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        but_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittext1.getText().length() != 0 ){
                    i1 = Float.parseFloat(edittext1.getText() + "");

                    Div = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        but_Rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittext1.getText().length() != 0 ){
                    i1 = Float.parseFloat(edittext1.getText() + "");

                    Rem = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        but_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add || Sub || Mul || Div || Rem){
                    i2 = Float.parseFloat(edittext1.getText() + "");
                }
                if(Add) {
                    edittext1.setText(i1 +i2 + "");
                    Add = false;
                }
                if(Sub){
                    edittext1.setText(i1-i2+"");
                    Sub = false;
                }
                if(Mul){
                    edittext1.setText(i1*i2+"");
                    Mul = false;
                }
                if(Div){
                    edittext1.setText(i1/i2+"");
                    Div = false;
                }
                if(Rem){
                    edittext1.setText(i1%i2+"");
                    Rem = false;
                }

            }
        });

        but_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("");
                i1 = 0.0;
                i2 = 0.0;
            }
        });

        but_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(deci){

                }
                else {
                    edittext1.setText(edittext1.getText() + ".");
                    deci = true;
                }
            }
        });
    }
}