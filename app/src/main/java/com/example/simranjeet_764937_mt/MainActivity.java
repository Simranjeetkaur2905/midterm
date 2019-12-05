package com.example.simranjeet_764937_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText dailyrent;
    SeekBar seekBar;
    EditText numberofdays;
    RadioGroup radioGroup;
    CheckBox gps1;
    CheckBox childseat;
    CheckBox unlimitedmilage;
    EditText amount;
    EditText totalamount;
    Button viewdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.choosecar);
        dailyrent = findViewById(R.id.dailyrenttext);
        seekBar = findViewById(R.id.seekbarselector);
        numberofdays = findViewById(R.id.daystext);
        radioGroup = findViewById(R.id.radiogroup);
        gps1 = findViewById(R.id.checkbox1);
        childseat = findViewById(R.id.checkbox2);
        unlimitedmilage = findViewById(R.id.checkbox3);
        amount = findViewById(R.id.payment);
        totalamount = findViewById(R.id.total);
        viewdetail = findViewById(R.id.detail);

//spinner in order to choose different types of cars

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(spinner.getSelectedItem().toString()){
                    case "BMW" :
                        dailyrent.setText("150");
                        break;
                    case "cruise":
                        dailyrent.setText("160");
                        break;
                    case "lamboorgini" :
                        dailyrent.setText("170");
                        break;
                    case "frari" :
                        dailyrent.setText("270");
                        break;
                    case "koyta" :
                        dailyrent.setText("180");
                        break;
                    case "Audi" :
                        dailyrent.setText("190");
                        break;
                    case "Mercedes" :
                        dailyrent.setText("20000");
                        break;
                    case "Volks Wagon" :
                        dailyrent.setText("210");
                        break;
                    case "Peugeot" :
                        dailyrent.setText("220");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                dailyrent.setText("");

            }
        });

//        seekbar operation when seekbar changes its value display in edit text numberofdays

       seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               numberofdays.setText(String.valueOf(progress));


           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radio1){
                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent + 5;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"5 added to daily rent",Toast.LENGTH_SHORT).show();




                }
                else if(checkedId == R.id.radio2){
                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent + 0;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"nothing is added",Toast.LENGTH_SHORT).show();


                }
                else if(checkedId == R.id.radio3){
                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent - 10;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"10 dollars discount is given to user ",Toast.LENGTH_SHORT).show();


                }

            }
        });



    }
}
