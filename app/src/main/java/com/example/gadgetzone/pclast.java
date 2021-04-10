package com.example.gadgetzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pclast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pclast);
    }

    public void TryagainFunction(View view) {
        Intent myIntent=new Intent(pclast.this,MainActivity2.class );
        startActivity(myIntent);
    }
}