package com.example.amorozov.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    FrameLayout frame1, frame2, frame3 ;
    TextView tvOut, tvOut2, tvOut3;

    int a = 0;
    int a2 = 0;
    int a3 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.textView2);
        tvOut2 = (TextView) findViewById(R.id.textView22);
        tvOut3 = (TextView) findViewById(R.id.textView23);

        frame1 = (FrameLayout) findViewById(R.id.frame1);
        frame2 = (FrameLayout) findViewById(R.id.frame2);
        frame3 = (FrameLayout) findViewById(R.id.frame3);

        //final int[] counter = {0};

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
switch(v.getId()){
    case R.id.frame1:
        a++;
        tvOut.setText(String.valueOf(a));
        break;
    case R.id.frame2:
        a2=a2+10;
        tvOut2.setText(String.valueOf(a2));
        break;

    case R.id.frame3:
        a3=a3+100;
        tvOut3.setText(String.valueOf(a3));
        break;
}
                //counter[0] = counter[0] + 1;
                //a++;
                //tvOut.setText(String.valueOf(a));


            }
        };

        frame1.setOnClickListener(oclBtnOk);
        frame2.setOnClickListener(oclBtnOk);
        frame3.setOnClickListener(oclBtnOk);



    }
}
