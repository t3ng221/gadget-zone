package com.example.gadgetzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup myRadiogroup;
    RadioButton selectedRadiobutton;
    String selectedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myRadiogroup=findViewById(R.id.radioGroupID);
    }

    public void nextfunction(View view) {
        int radioButtonid=myRadiogroup.getCheckedRadioButtonId();
        selectedRadiobutton=findViewById(radioButtonid);
        selectedValue=selectedRadiobutton.getText().toString();
        if(selectedValue.equals("PC Components")){
            Intent myIntent=new Intent(MainActivity2.this,MainActivity3.class );
            startActivity(myIntent);
        }
        else if(selectedValue.equals("Mobile Components"))
        {
            Intent myIntent=new Intent(MainActivity2.this,MainActivity4.class );
            startActivity(myIntent);
        }
        else if(selectedValue.equals("Hardware"))
        {
            Intent myIntent=new Intent(MainActivity2.this,MainActivity5.class );
            startActivity(myIntent);
        }
    }
    public void FirstPage(View view) {
        Intent myIntent=new Intent(MainActivity2.this,MainActivity.class );
        startActivity(myIntent);

    }


}