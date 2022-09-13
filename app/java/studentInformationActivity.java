package com.example.onlinetutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class studentInformationActivity extends AppCompatActivity {
    String nam,cls,ins,number,mail,adr,pass;
    TextView nameinfo, instituteinfo, classinfo, numberinfo, emailinfo,addressinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_information);
        nam = getIntent().getStringExtra("name");
        cls = getIntent().getStringExtra("cls");
        ins = getIntent().getStringExtra("ins");
        number = getIntent().getStringExtra("number");
        mail = getIntent().getStringExtra("email");
        adr = getIntent().getStringExtra("address");
        pass = getIntent().getStringExtra("password");
        nameinfo = findViewById(R.id.nameinfo);
        instituteinfo = findViewById(R.id.institutioninfo);
        classinfo = findViewById(R.id.classinfo);
        numberinfo = findViewById(R.id.numberinfo);
        emailinfo = findViewById(R.id.emailinfo);
        addressinfo = findViewById(R.id.addressinfo);
        nameinfo.setText("NAME : "+ nam);
        instituteinfo.setText("INSTITUTION : "+ins);
        classinfo.setText("CLASS : "+cls);
        numberinfo.setText("NUMBER : "+number);
        emailinfo.setText("EMAIL : "+mail);
        addressinfo.setText("ADDRESS : "+adr);
    }
}