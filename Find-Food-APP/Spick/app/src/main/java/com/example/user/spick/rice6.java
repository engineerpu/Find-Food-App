package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class rice6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice6);
        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/maps/place/%E5%AE%8C%E9%A3%9F+%E8%A1%8C%E5%8B%95%E9%A4%90%E8%BB%8A+-+%E7%89%9B%E4%B8%BC%E3%80%81%E8%B1%9A%E4%B8%BC%E3%80%81%E3%82%AB%E3%83%AC%E3%83%BC%E5%B0%88%E9%96%80/@24.21871,120.5770559,17z/data=!3m1!4b1!4m5!3m4!1s0x346915a5df8c163f:0xc28edc7da9681c23!8m2!3d24.21871!4d120.57925");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });





        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rice6.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rice6.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rice6.this, menurice6.class);
                startActivity(intent);
            }
        });
    }
}