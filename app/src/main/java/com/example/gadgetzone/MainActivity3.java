package com.example.gadgetzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    RadioGroup myRadiogroup;
    RadioButton selectedRadiobutton;
    String selectedValue;
    public static String quizmarks2="I'm from BD";
    int marks2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        myRadiogroup=findViewById(R.id.radioGroupID);
    }

    public void submitFunction(View view) {
        int radioButtonid=myRadiogroup.getCheckedRadioButtonId();
        selectedRadiobutton=findViewById(radioButtonid);
        selectedValue=selectedRadiobutton.getText().toString();
        if(selectedValue.equals("Keyboard")){
            Toast.makeText(this, "Keyboard Order Succesful", Toast.LENGTH_SHORT).show();
        }
        else if(selectedValue.equals("Mouse"))
        {
            Toast.makeText(this, "Mouse Order Succesful", Toast.LENGTH_SHORT).show();
        }
        else if(selectedValue.equals("Pendrive"))
        {
            Toast.makeText(this, "Pendrive Order Succesful", Toast.LENGTH_SHORT).show();
        }
        Intent myIntent=new Intent(MainActivity3.this,pclast.class );
        startActivity(myIntent);
    }
}