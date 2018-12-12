package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class nramdon13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nramdon13);

        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/maps/place/%E9%A3%BD%E9%A3%9F/@24.2142185,120.5210797,11.75z/data=!4m8!1m2!2m1!1z6aO96aOf!3m4!1s0x346915c9d3c47f7b:0x4f4b6018f2f58abf!8m2!3d24.2258208!4d120.5756778");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });





        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon13.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon13.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon13.this, menu13.class);
                startActivity(intent);
            }
        });
    }
}
