package com.example.onlinetutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signOp extends AppCompatActivity {

    Button stOp;
    Button trOp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_op);
        stOp = findViewById(R.id.stbtn);
        trOp = findViewById(R.id.trbtn);

        stOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signStudentPage();
            }

        });

        trOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signTutorPage();
            }
        });

    }
    private void signStudentPage() {
        Intent info = new Intent(this, stsignin.class);
        startActivity(info);
    }
    private void signTutorPage() {
        Intent info = new Intent(this, trsignin.class);
        startActivity(info);
    }
}