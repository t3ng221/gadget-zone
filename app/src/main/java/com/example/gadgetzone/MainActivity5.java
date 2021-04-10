package com.example.gadgetzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    RadioGroup myRadiogroup;
    RadioButton selectedRadiobutton;
    String selectedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        myRadiogroup=findViewById(R.id.radioGroupID);
    }


    public void submitFunction(View view) {
        int radioButtonid=myRadiogroup.getCheckedRadioButtonId();
        selectedRadiobutton=findViewById(radioButtonid);
        selectedValue=selectedRadiobutton.getText().toString();
        if(selectedValue.equals("Air Condition")){
            Toast.makeText(this, "Air Condition Order Succesful", Toast.LENGTH_SHORT).show();
        }
        else if(selectedValue.equals("Oven"))
        {
            Toast.makeText(this, "Oven Order Succesful", Toast.LENGTH_SHORT).show();
        }
        else if(selectedValue.equals("Washing Machine"))
        {
            Toast.makeText(this, "Washing Machine Order Succesful", Toast.LENGTH_SHORT).show();
        }
        Intent myIntent=new Intent(MainActivity5.this,hardlast.class );
        startActivity(myIntent);
    }
    }
