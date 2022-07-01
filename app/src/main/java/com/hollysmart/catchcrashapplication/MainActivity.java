package com.hollysmart.catchcrashapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btn_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_test = (Button)findViewById(R.id.btn_test);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        Integer a = null;
//                        if(a > 5);
//                    }
//                },10000);


//                Integer a = null;
//                if(a > 5);

                Integer.parseInt("12.3");

            }
        });

    }
}