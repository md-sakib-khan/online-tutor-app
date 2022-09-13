package com.example.onlinetutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class stsignin extends AppCompatActivity {
    Button sign;
    EditText name;
    EditText institute;
    EditText cls;
    EditText mobile;
    EditText address;
    EditText email;
    EditText password;
    FirebaseDatabase database;
    DatabaseReference myRef;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stsignin);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Student");

        name = findViewById(R.id.stname);
        institute = findViewById(R.id.stinstitute);
        cls = findViewById(R.id.stclass);
        mobile = findViewById(R.id.stmobile);
        address = findViewById(R.id.staddress);
        email = findViewById(R.id.stmail);
        password = findViewById(R.id.stpass);
        sign = findViewById(R.id.stsignbtn);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nam = name.getText().toString().trim();
                String koiPore= institute.getText().toString().trim();
                String konClass = cls.getText().toString().trim();
                String number = mobile.getText().toString().trim();
                String basha = address.getText().toString().trim();
                String mail = email.getText().toString().trim();
                String pass = password.getText().toString().trim();
                Student student = new Student(nam,koiPore,konClass,number,mail, pass, basha);
                if (nam.isEmpty() || number.isEmpty()|| koiPore.isEmpty() || konClass.isEmpty() ||basha.isEmpty() || mail.isEmpty()|| pass.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Provide All Information", Toast.LENGTH_LONG).show();
                }
                else{
                    userRegister(student);
                }
            }
        });
    }
    public void userRegister(Student student){
        myRef.child(student.mob).setValue(student);
        Toast.makeText(getApplicationContext(),"Student Information added, Go back and Log in", Toast.LENGTH_LONG).show();
    }
}