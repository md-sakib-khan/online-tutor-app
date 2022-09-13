package com.example.onlinetutorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class LogOp extends AppCompatActivity {

    EditText num;
    EditText pass;

    Button loginDonebtn;
    DatabaseReference reff1,reff2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_op);
        num = findViewById(R.id.numbergivenbox);
        pass = findViewById(R.id.passwordgivenbox);
        loginDonebtn = findViewById(R.id.loginDonebtn);
        loginDonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoafterLog(num.getText().toString().trim(), pass.getText().toString().trim());
            }
        });
    }
    public void gotoafterLog(final String n, final String p){
        reff1 = FirebaseDatabase.getInstance().getReference("Student");
        Query check = reff1.orderByChild("mob").equalTo(n);
        check.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String passfromdb = snapshot.child(n).child("pass").getValue(String.class);
                    if (passfromdb.equals(p)){
                        String namefromdb = snapshot.child(n).child("name").getValue(String.class);
                        String numberfromdb = snapshot.child(n).child("mob").getValue(String.class);
                        String emailfromdb = snapshot.child(n).child("email").getValue(String.class);
                        String classfromdb = snapshot.child(n).child("cls").getValue(String.class);
                        String addressfromdb = snapshot.child(n).child("address").getValue(String.class);
                        String institutionfromdb = snapshot.child(n).child("institution").getValue(String.class);
                        gotostudentpage(namefromdb,classfromdb,institutionfromdb,numberfromdb,emailfromdb,addressfromdb,passfromdb);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Number Match , Password Mismatch", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    //check for tutor
                    reff2 = FirebaseDatabase.getInstance().getReference("Tutor");
                    Query check2 = reff2.orderByChild("mobilenumber").equalTo(n);
                    check2.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if(snapshot.exists()){
                                String passfromdb = snapshot.child(n).child("password").getValue(String.class);
                                if(passfromdb.equals(p)){
                                    String cvfromdb = snapshot.child(n).child("cvlink").getValue(String.class);
                                    String namefromdb = snapshot.child(n).child("name").getValue(String.class);
                                    String genderfromdb = snapshot.child(n).child("gender").getValue(String.class);
                                    String institutionfromdb = snapshot.child(n).child("institute").getValue(String.class);
                                    String semesterfromdb = snapshot.child(n).child("semester").getValue(String.class);
                                    String studuareafromdb = snapshot.child(n).child("studyarea").getValue(String.class);
                                    String currentresultfromdb = snapshot.child(n).child("currentresult").getValue(String.class);
                                    String nidfromdb = snapshot.child(n).child("nidnumber").getValue(String.class);
                                    String mobilefromdb = snapshot.child(n).child("mobilenumber").getValue(String.class);
                                    String emailfromdb = snapshot.child(n).child("email").getValue(String.class);
                                    String addressfromdb = snapshot.child(n).child("address").getValue(String.class);
                                    gotoTutorPage(cvfromdb,namefromdb,genderfromdb,institutionfromdb,semesterfromdb,studuareafromdb,
                                            currentresultfromdb,nidfromdb,mobilefromdb,emailfromdb,addressfromdb);
                                }
                                else{
                                    Toast.makeText(getApplicationContext(),"Number Match , Password Mismatch", Toast.LENGTH_LONG).show();
                                }
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"User not found", Toast.LENGTH_LONG).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            //No work
                        }
                    });
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

    private void gotoTutorPage(String cvfromdb, String namefromdb, String genderfromdb, String institutionfromdb, String semesterfromdb, String studuareafromdb, String currentresultfromdb, String nidfromdb, String mobilefromdb, String emailfromdb, String addressfromdb) {
        Intent in = new Intent(this, AfterLogTutor.class);
        in.putExtra("cv",cvfromdb);
        in.putExtra("name",namefromdb);
        in.putExtra("gender",genderfromdb);
        in.putExtra("institution", institutionfromdb);
        in.putExtra("semester",semesterfromdb);
        in.putExtra("studyarea", studuareafromdb);
        in.putExtra("currentresult", currentresultfromdb);
        in.putExtra("nid", nidfromdb);
        in.putExtra("mobile", mobilefromdb);
        in.putExtra("email", emailfromdb);
        in.putExtra("address", addressfromdb);
        startActivity(in);
    }

    private void gotostudentpage(String nam,String cls, String ins, String number, String mail, String adr, String pass) {
        Intent in = new Intent(this, afterLogstudent.class);
        in.putExtra("name",nam);
        in.putExtra("cls",cls);
        in.putExtra("ins",ins);
        in.putExtra("number",number);
        in.putExtra("email",mail);
        in.putExtra("address",adr);
        in.putExtra("password",pass);
        startActivity(in);
    }
}