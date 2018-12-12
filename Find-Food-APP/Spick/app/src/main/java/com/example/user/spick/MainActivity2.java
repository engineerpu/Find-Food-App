package com.example.user.spick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton listbtn=findViewById(R.id.listbtn);
        listbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent( MainActivity2.this, shoplistActivity.class);
                startActivity(intent);
            }
        });

        ImageButton favbtn=findViewById(R.id.favbtn);
        favbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent2 = new Intent( MainActivity2.this, favoriteActivity.class);
                startActivity(intent2);
            }
        });

        ImageButton blackbtn=findViewById(R.id.blackbtn);
        blackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent3 = new Intent( MainActivity2.this, blacklistActivity.class);
                startActivity(intent3);
            }
        });
    }
}
