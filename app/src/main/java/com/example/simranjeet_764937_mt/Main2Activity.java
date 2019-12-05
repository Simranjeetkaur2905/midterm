package com.example.simranjeet_764937_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView detailview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        detailview = findViewById(R.id.detail1);


        Intent i = getIntent();
        String  text = i.getExtras().getString("choose car");
        String  text1 = i.getExtras().getString("dailyrentvalue");
        String  text4 = i.getExtras().getString("numberofdaysss");
        String  text2 = i.getExtras().getString("value without tax");
        String  text3 = i.getExtras().getString("total amount");

        detailview.setText("car name" + "" + text + "" + "daily rent" + "  " +text1 +"number of days " +
                "" + text4 +" " + "value without text" + " "+ text2 + "" + "total amount" + " " + text3);



    }
}
