package com.example.gadgetzone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText nameText,idText,phoneText,searchiD ;
    TextView nameview,phoneview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idText=findViewById(R.id.idEditTextid);
        nameText=findViewById(R.id.nameEditTextid);
        phoneText=findViewById(R.id.phoneEditTextid);
        searchiD=findViewById(R.id.searchTextiD);
        nameview=findViewById(R.id.idoutput);
        phoneview=findViewById(R.id.phoneoutput);
    }


    public void SaveData(View view) {
        String idData,nameData,phoneData;
        idData =idText.getText().toString();
        nameData =nameText.getText().toString();
        phoneData=phoneText.getText().toString();
        insertionClass data=new insertionClass(nameData,phoneData);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Customers");
        myRef.child(idData).setValue(data);
        Toast.makeText(this, "User Data Saved Successful", Toast.LENGTH_SHORT).show();
        idText.setText("");
        nameText.setText("");
        phoneText.setText("");
    }

    public void showData(View view) {
        String searchdata = searchiD.getText().toString();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Customers").child(searchdata);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String n,p;
                n=snapshot.child("name").getValue().toString();
                p=snapshot.child("phone").getValue().toString();
                nameview .setText("Name: "+n);
                phoneview .setText("Phone: "+p);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    public void Ordergadget(View view) {
        Intent myIntent=new Intent(MainActivity.this,MainActivity2.class );
        startActivity(myIntent);
    }
}