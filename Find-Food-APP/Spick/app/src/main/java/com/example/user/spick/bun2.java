package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bun2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bun2);
        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/search?tbm=lcl&ei=uBwRXL2AGIei8QWPhb6gDg&q=%E5%96%AC%E6%A8%82%E6%99%A8%E5%9D%8A+%E9%9D%9C%E5%AE%9C&oq=%E5%96%AC%E6%A8%82%E6%99%A8%E5%9D%8A+%E9%9D%9C%E5%AE%9C&gs_l=psy-ab.3..0i30k1.1498.3207.0.3511.7.7.0.0.0.0.134.396.6j1.7.0....0...1c.1j4.64.psy-ab..0.2.182...0.0.mcwP-cOVgO0#rlfi=hd:;si:5327731344700280951;mv:!1m2!1d24.255907104376927!2d120.67363970068311!2m2!1d24.206284693212268!2d120.55811159399366!4m2!1d24.231098316612105!2d120.61587564733838!5i13");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });



        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bun2.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bun2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bun2.this, menubun2.class);
                startActivity(intent);
            }
        });
    }
}