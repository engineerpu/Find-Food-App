package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class rice10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice10);
        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/maps/place/%E3%84%A8%E9%BA%BB%E5%B0%B9+%E6%97%A5%E5%BC%8F%E7%81%AB%E9%8D%8B%E6%8B%89%E9%BA%B5%E4%B8%BC%E9%A3%AF-%E5%8F%B0%E4%B8%AD%E6%B2%99%E9%B9%BF%E5%BA%97/@24.1443904,120.4185835,11z/data=!4m8!1m2!2m1!1z44So6bq75bC5CQkJ!3m4!1s0x346915001de1a197:0x84bf28e9e15b346b!8m2!3d24.2298083!4d120.572889");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });





        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rice10.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rice10.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rice10.this, menurice10.class);
                startActivity(intent);
            }
        });
    }
}