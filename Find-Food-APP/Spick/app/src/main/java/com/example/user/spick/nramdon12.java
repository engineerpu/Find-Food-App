package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class nramdon12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nramdon12);

        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/maps/place/%E5%A4%A7%E4%B8%B8%E6%97%A9%E5%8D%88%E9%A4%90%E5%BA%97/@24.219781,120.5797293,16.75z/data=!4m12!1m6!3m5!1s0x346915af2d8ce335:0x6f01d39caf7dda5c!2z5aSn5Li45pep5Y2I6aSQ5bqX!8m2!3d24.2196473!4d120.5799741!3m4!1s0x346915af2d8ce335:0x6f01d39caf7dda5c!8m2!3d24.2196473!4d120.5799741");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });





        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon12.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon12.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon12.this, menu12.class);
                startActivity(intent);
            }
        });
    }
}
