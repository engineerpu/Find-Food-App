package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class nramdon9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nramdon9);

        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/maps/place/%E8%80%81%E7%89%8C%E7%9F%B3%E9%A0%AD%E5%B0%8F%E7%81%AB%E9%8D%8B/@24.2235561,120.5641393,15.5z/data=!4m24!1m18!4m17!1m8!2m2!1d120.5643225!2d24.2165855!3m4!1m2!1d120.5631455!2d24.2210527!3s0x3469150ff0a10ec3:0xf995c17f3b249708!1m6!1m2!1s0x34691500261382cf:0x1c5fd797f543376e!2z6ICB54mM55-z6aCt5bCP54Gr6Y2LIDQzM-WPsOeBo-WPsOS4reW4guaymem5v-WNgOWMl-WLouadsei3rzcwNuiZnw!2m2!1d120.5718147!2d24.2297589!3e0!3m4!1s0x34691500261382cf:0x1c5fd797f543376e!8m2!3d24.2297589!4d120.5718147");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });





        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon9.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon9.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon9.this, menu9.class);
                startActivity(intent);
            }
        });
    }
}
