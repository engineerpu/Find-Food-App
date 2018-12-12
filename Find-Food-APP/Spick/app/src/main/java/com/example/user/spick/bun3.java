package com.example.user.spick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bun3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bun3);
        ImageButton map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com.tw/search?tbm=lcl&ei=vBwRXN3UKsiW8gWL5Jb4CQ&q=%E6%AF%8F%E4%B8%80%E5%A4%A9+%E9%9D%9C%E5%AE%9C&oq=%E6%AF%8F%E4%B8%80%E5%A4%A9+%E9%9D%9C%E5%AE%9C&gs_l=psy-ab.3..0i8i30k1.28328.32938.0.33248.17.16.0.0.0.0.154.1117.11j4.16.0....0...1c.1j4.64.psy-ab..3.10.791.6..0j35i39k1j0i131k1j0i3k1j0i5i30k1j33i160k1.102.4RpBhNKY0ng#rlfi=hd:;si:3810961325766187012;mv:!1m2!1d24.2261818!2d120.5772902!2m2!1d24.2257812!2d120.5754434");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });



        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bun3.this, chooseActivity.class);
                startActivity(intent);
            }
        });
        ImageButton homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bun3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bun3.this, menubun3.class);
                startActivity(intent);
            }
        });
    }
}