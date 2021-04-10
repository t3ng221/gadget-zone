package com.example.gadgetzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hardlast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardlast);
    }

    public void TryagainFunction(View view) {
        Intent myIntent=new Intent(hardlast.this,MainActivity2.class );
        startActivity(myIntent);
    }
}