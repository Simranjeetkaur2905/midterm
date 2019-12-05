package com.example.simranjeet_764937_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

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

    ArrayList<Integer> customer = new ArrayList<Integer>();

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
                        dailyrent.setText("200");
                        break;
                    case "Volks Wagon" :
                        dailyrent.setText("210");
                        break;
                    case "Peugeot" :
                        dailyrent.setText("220");
                        break;
                }
                amount.setText(dailyrent.getText().toString());

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

               int totaldaysrent = progress * Integer.valueOf(dailyrent.getText().toString());
               dailyrent.setText(String.valueOf(totaldaysrent));




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
                    amount.setText(dailyrent.getText().toString());
                    double totalvalue = (increment * 13)/100;
                    double total = increment + totalvalue;
                    totalamount.setText(String.valueOf(total));

                }
                else if(checkedId == R.id.radio2){
                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent + 0;
                   // dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"nothing is added",Toast.LENGTH_SHORT).show();
                    amount.setText(dailyrent.getText().toString());
                    double totalvalue = (increment * 13)/100;
                    double total = increment + totalvalue;
                    totalamount.setText(String.valueOf(total));

                }
                else if(checkedId == R.id.radio3){
                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent - 10;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"10 dollars discount is given to user ",Toast.LENGTH_SHORT).show();
                    amount.setText(dailyrent.getText().toString());
                    double totalvalue = (increment * 13)/100;
                    double total = increment + totalvalue;
                    totalamount.setText(String.valueOf(total));
                }

            }
        });


        gps1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                        int rent = Integer.valueOf(dailyrent.getText().toString());
                        int increment = rent + 5;
                        dailyrent.setText(String.valueOf(increment));
                        Toast.makeText(MainActivity.this,"5 added to daily rent",Toast.LENGTH_SHORT).show();
                    amount.setText(dailyrent.getText().toString());
                    double totalvalue = (increment * 13)/100;
                    double total = increment + totalvalue;
                    totalamount.setText(String.valueOf(total));
                    }
                else {
                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent + 0;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"nothing is added to daily rent",Toast.LENGTH_SHORT).show();

                }

            }
        });

        childseat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent + 7;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"7 added to daily rent",Toast.LENGTH_SHORT).show();

                    amount.setText(dailyrent.getText().toString());
                    double totalvalue = (increment * 13)/100;
                    double total = increment + totalvalue;
                    totalamount.setText(String.valueOf(total));                }
                else {
                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent + 0;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"nothing is added to daily rent",Toast.LENGTH_SHORT).show();

                }

            }
        });
        unlimitedmilage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent + 10;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"10 added to daily rent",Toast.LENGTH_SHORT).show();
                    amount.setText(dailyrent.getText().toString());
                    double totalvalue = (increment * 13)/100;
                    double total = increment + totalvalue;
                    totalamount.setText(String.valueOf(total));

                }

                else {
                    int rent = Integer.valueOf(dailyrent.getText().toString());
                    int increment = rent + 0;
                    dailyrent.setText(String.valueOf(increment));
                    Toast.makeText(MainActivity.this,"nothing is added to daily rent",Toast.LENGTH_SHORT).show();

                }

            }
        });



        viewdetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dailytext1 = dailyrent.getText().toString();
                String numberofdays1 = numberofdays.getText().toString();
                String value = amount.getText().toString();
                String totalvalue = totalamount.getText().toString();
                String spinnertext = spinner.getSelectedItem().toString();

                if (dailytext1.isEmpty() || numberofdays1.isEmpty() || value.isEmpty() || totalvalue.isEmpty() || spinnertext.equals("Please choose a car name")) {
                    Toast.makeText(MainActivity.this, " you might have empty fields!!!!", Toast.LENGTH_SHORT).show();
                }
                    else{


                        customer.add(Integer.parseInt(value));


                                  Toast.makeText(MainActivity.this, " car selected successfully", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                       //String str1 = Integer.toString(customer.size());

                       i.putExtra("choose car",spinnertext);
                       i.putExtra("dailyrentvalue", dailytext1);
                       i.putExtra("numberofdaysss",numberofdays1);
                       i.putExtra("value without tax",value);
                       i.putExtra("total amount",totalvalue);

                        startActivity(i);


                    }
            }
        });
//
//

    }
}
