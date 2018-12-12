package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class nramdon11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nramdon11);

        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/maps/place/%E5%B9%B8%E7%A6%8F%E9%BA%B5%E9%A4%A8-%E7%B2%A5%E9%BA%B5%E9%A3%AF%E5%93%81/@24.2278261,120.5746292,17z/data=!4m12!1m6!3m5!1s0x346915aa99f79267:0xad0a5885f46eafa7!2z5bm456aP6bq16aSoLeeypem6temjr-WTgQ!8m2!3d24.2278261!4d120.5746292!3m4!1s0x346915aa99f79267:0xad0a5885f46eafa7!8m2!3d24.2278261!4d120.5746292");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });





        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon11.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon11.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nramdon11.this, menu11.class);
                startActivity(intent);
            }
        });
    }
}
