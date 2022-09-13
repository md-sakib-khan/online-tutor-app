package com.example.onlinetutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AfterLogTutor extends AppCompatActivity {
    Button viewpost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_log_tutor);

        viewpost = findViewById(R.id.viewtutionsbtn);

        viewpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoPostspage();
            }
        });
    }

    private void gotoPostspage() {
        Intent in = new Intent(this,tutionposts.class);
        startActivity(in);
    }
}