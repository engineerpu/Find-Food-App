package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.nio.file.FileVisitOption;

public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/maps/place/%E9%BE%8D%E9%96%80%E5%AE%A2%E6%A3%A7/@24.2123146,120.5534479,13z/data=!4m8!1m2!2m1!1z6b6N6ZaA5a6i5qOn!3m4!1s0x0:0x6467868fde62104d!8m2!3d24.2273005!4d120.5746186");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
        }
    });





                ImageButton reset = findViewById(R.id.reset);
                reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(resultActivity.this, chooseActivity.class);
                        startActivity(intent);
                    }
                });
                ImageButton homebtn = findViewById(R.id.homebtn);
                homebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(resultActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });

            }
        }
