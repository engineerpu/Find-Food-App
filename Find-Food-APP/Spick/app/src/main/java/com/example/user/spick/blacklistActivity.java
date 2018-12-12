package com.example.user.spick;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class blacklistActivity extends AppCompatActivity {
    private LinearLayout parentLinearLayout;
    private EditText textView1;
    private EditText textView2;
    private Button addbtn;
    private Button deletebtn;

    ArrayList<EditText> txt = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blacklist);

        textView1 = findViewById(R.id.txt_edit1);
        textView2 = findViewById(R.id.txt_edit2);
        addbtn = findViewById(R.id.addbtn);
        parentLinearLayout = findViewById(R.id.parentlinearLayout);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater  = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View rowView = inflater.inflate(R.layout.textbox,null);
                EditText add_txt1 = rowView.findViewById(R.id.edit_text1);
                EditText add_txt2 = rowView.findViewById(R.id.edit_text2);
                parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount()-1);
                txt.add(add_txt1);
                txt.add(add_txt2);
            }
        });
    }

    public void onDelete(View v){	        parentLinearLayout.removeView((View) v.getParent());

    }
}
