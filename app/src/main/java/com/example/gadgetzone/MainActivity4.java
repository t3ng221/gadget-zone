package com.example.gadgetzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    RadioGroup myRadiogroup;
    RadioButton selectedRadiobutton;
    String selectedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        myRadiogroup=findViewById(R.id.radioGroupID);
    }

    public void submitFunction(View view) {
        int radioButtonid=myRadiogroup.getCheckedRadioButtonId();
        selectedRadiobutton=findViewById(radioButtonid);
        selectedValue=selectedRadiobutton.getText().toString();
        if(selectedValue.equals("Memory Card")){
            Toast.makeText(this, "Memory Card Order Succesful", Toast.LENGTH_SHORT).show();
        }
        else if(selectedValue.equals("Charger"))
        {
            Toast.makeText(this, "Charger Order Succesful", Toast.LENGTH_SHORT).show();
        }
        else if(selectedValue.equals("Screen Protector"))
        {
            Toast.makeText(this, "Screen Protector Order Succesful", Toast.LENGTH_SHORT).show();
        }
        Intent myIntent=new Intent(MainActivity4.this,molast.class );
        startActivity(myIntent);
    }
}