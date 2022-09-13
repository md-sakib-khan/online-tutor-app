package com.example.onlinetutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

public class trsignin extends AppCompatActivity {
    EditText inputcvlink,inputname,inputgender,inputinstitute,inputsemester, inputstudyarea, inputcurrentresult, inputnidnumber, inputmobilenumber, inputemail,inputnewpass,inputaddress;
    String cvlink, name,gender, institute, semester,studyarea, currentresult, nidnumber,mobilenumber , email, password, address;
    Button signinbtn;

    FirebaseDatabase database;
    DatabaseReference reff;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trsignin);

        database = FirebaseDatabase.getInstance();
        reff = database.getReference("Tutor");

        inputcvlink = findViewById(R.id.cvlinkbox);
        inputname = findViewById(R.id.tutornamebox);
        inputgender = findViewById(R.id.tutorgenderbox);
        inputinstitute = findViewById(R.id.tutorinstitutebox);
        inputsemester = findViewById(R.id.tutorsemesterbox);
        inputstudyarea = findViewById(R.id.tutorstudyareabox);
        inputcurrentresult = findViewById(R.id.tutorcurrentresultbox);
        inputnidnumber = findViewById(R.id.tutornidnumberbox);
        inputmobilenumber = findViewById(R.id.tutormobilebox);
        inputemail = findViewById(R.id.tutoremailbox);
        inputnewpass = findViewById(R.id.tutorpasswordbox);
        inputaddress = findViewById(R.id.tutoraddressbox);


        signinbtn = findViewById(R.id.tutorsigninbutton);

        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cvlink = inputcvlink.getText().toString().trim();
                name = inputname.getText().toString().trim();
                gender = inputgender.getText().toString().trim();
                institute = inputinstitute.getText().toString().trim();
                semester = inputsemester.getText().toString().trim();
                studyarea = inputstudyarea.getText().toString().trim();
                currentresult = inputcurrentresult.getText().toString().trim();
                nidnumber = inputnidnumber.getText().toString().trim();
                mobilenumber = inputmobilenumber.getText().toString().trim();
                email = inputemail.getText().toString().trim();
                password = inputnewpass.getText().toString().trim();
                address = inputaddress.getText().toString().trim();
                Log.d(cvlink+"Etai","this");
                if(cvlink.isEmpty() || name.isEmpty() || gender.isEmpty() || institute.isEmpty() || semester.isEmpty() || studyarea.isEmpty() ||
                currentresult.isEmpty()||nidnumber.isEmpty()||mobilenumber.isEmpty()||email.isEmpty()||password.isEmpty()||address.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Provide All Information", Toast.LENGTH_LONG).show();
                }
                else{
                    Tutor tutor = new Tutor(cvlink,name,gender,institute,semester,studyarea,currentresult,nidnumber,mobilenumber,email,password,address);
                    reff.child(tutor.mobilenumber).setValue(tutor);
                    Toast.makeText(getApplicationContext(),"Tutor Information is added, Go back and Log in", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}