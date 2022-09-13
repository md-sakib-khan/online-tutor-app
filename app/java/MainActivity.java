package com.example.onlinetutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button signbtn;
    Button logbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signbtn = findViewById(R.id.signbtn);
        logbtn = findViewById(R.id.logbtn);

        signbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignMenu();
            }
        });
        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logMenu();
            }
        });
    }
    private void SignMenu() {
        Intent signOption = new Intent(this, signOp.class);
        startActivity(signOption);
    }
    private void logMenu() {
        Intent signOption = new Intent(this, LogOp.class);
        startActivity(signOption);
    }
}