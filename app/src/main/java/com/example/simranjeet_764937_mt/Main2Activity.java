package com.example.simranjeet_764937_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText detailview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        detailview = findViewById(R.id.detail1);

        Intent i = getIntent();
        String  text = i.getExtras().getString("candidate");
        detailview.setText(text);

    }
}
