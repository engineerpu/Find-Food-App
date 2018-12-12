package com.example.user.spick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class shoplistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoplist);

        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon1.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon2.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon15.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon3.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon5.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon6.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon9.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon10.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton9 = findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon11.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton10 = findViewById(R.id.imageButton10);
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon12.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton11 = findViewById(R.id.imageButton11);
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon13.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton12 = findViewById(R.id.imageButton12);
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, nramdon14.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton13 = findViewById(R.id.imageButton13);
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, rice4Activity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton14 = findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, rice5.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton15 = findViewById(R.id.imageButton15);
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, rice6.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton16 = findViewById(R.id.imageButton16);
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, rice7.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton17 = findViewById(R.id.imageButton17);
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, rice8.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton18 = findViewById(R.id.imageButton18);
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, rice9.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton19 = findViewById(R.id.imageButton19);
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, rice10.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton20 = findViewById(R.id.imageButton20);
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, noodles1.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton21 = findViewById(R.id.imageButton21);
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, noodles2.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton22 = findViewById(R.id.imageButton22);
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, noodles3.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton23 = findViewById(R.id.imageButton23);
        imageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, noodles4.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton24 = findViewById(R.id.imageButton24);
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shoplistActivity.this, hotpot1.class);
                startActivity(intent);
            }
        });


    }
}
