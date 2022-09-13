package com.example.onlinetutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class postformactivity extends AppCompatActivity {
    String number;
    EditText boxclass,boxsubject,boxuniversity,boxdays,boxarea,boxsalary;
    String classinfo, subjectinfo, universityinfo, daysinfo, areainfo,salaryinfo;
    Button donepost;
    Tution tution;
    FirebaseDatabase database;
    DatabaseReference Reff2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postformactivity);
        database = FirebaseDatabase.getInstance();
        Reff2 = database.getReference("Tutions");
        //Received Student Information

        number = getIntent().getStringExtra("number");

        //Post Information
        boxclass = findViewById(R.id.boxclass);
        boxsubject =  findViewById(R.id.boxsubject);
        boxuniversity =  findViewById(R.id.boxuniversity);
        boxdays = findViewById(R.id.boxdays);
        boxarea = findViewById(R.id.boxarea);
        boxsalary = findViewById(R.id.boxsalary);
        //Get values form post information
        //Post Button
        donepost = findViewById(R.id.donepostbtn);
        donepost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String konclass = boxclass.getText().toString().trim();
                String konsubject = boxsubject.getText().toString().trim();
                String konuniversity = boxuniversity.getText().toString().trim();
                String kotodin = boxdays.getText().toString().trim();
                String konarea = boxarea.getText().toString().trim();
                String betonkoto = boxsalary.getText().toString().trim();
                if (konclass.isEmpty() || konsubject.isEmpty()|| konuniversity.isEmpty() || kotodin.isEmpty() || konarea.isEmpty() || betonkoto.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Provide All Information", Toast.LENGTH_LONG).show();
                }
                else{
                    tution = new Tution(konclass,konsubject,konuniversity,kotodin,konarea,betonkoto);
                    Reff2.child(number).setValue(tution);
                    Toast.makeText(getApplicationContext(),"Post Information is added", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}