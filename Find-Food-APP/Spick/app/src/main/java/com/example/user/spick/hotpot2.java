package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hotpot2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotpot2);
        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/maps/place/%E4%B8%89%E5%AA%BD%E8%87%AD%E8%87%AD%E9%8D%8B%EF%BC%88%E6%B2%99%E9%B9%BF%E5%8C%97%E5%8B%A2%E6%9D%B1%E8%B7%AF%E5%BA%97%EF%BC%89/@24.2299071,120.5350089,13z/data=!4m8!1m2!2m1!1z5LiJ5aq9Jw!3m4!1s0x346915aa5b9c5adf:0xab87e2efa4281ef3!8m2!3d24.2260646!4d120.5756938");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });



        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hotpot2.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hotpot2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hotpot2.this, menuhotpot2.class);
                startActivity(intent);
            }
        });
    }
}