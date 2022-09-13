package com.example.onlinetutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class afterLogstudent extends AppCompatActivity {
    Button addpostbtn;
    Button stinfo;
    String nam,cls,ins,number,mail,adr,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_logstudent);
        nam = getIntent().getStringExtra("name");
        cls = getIntent().getStringExtra("cls");
        ins = getIntent().getStringExtra("ins");
        number = getIntent().getStringExtra("number");
        mail = getIntent().getStringExtra("email");
        adr = getIntent().getStringExtra("address");
        pass = getIntent().getStringExtra("password");
        stinfo = findViewById(R.id.student_info_btn);
        stinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoStudentInformation();
            }
        });

        addpostbtn = findViewById(R.id.addpostbtn);
        addpostbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoaddpostpage();
            }
        });

    }

    private void gotoStudentInformation() {
        Intent in = new Intent(this, studentInformationActivity.class);
        in.putExtra("name",nam);
        in.putExtra("cls",cls);
        in.putExtra("ins",ins);
        in.putExtra("number",number);
        in.putExtra("email",mail);
        in.putExtra("address",adr);
        in.putExtra("password",pass);
        startActivity(in);
    }

    public void gotoaddpostpage(){
        Intent n = new Intent(this, postformactivity.class);
        n.putExtra("number",number);
        startActivity(n);
    }
}