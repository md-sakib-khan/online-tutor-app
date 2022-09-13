package com.example.onlinetutorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.firebase.ui.database.SnapshotParser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class tutionposts extends AppCompatActivity {
    ArrayList<model> datalist;
    RecyclerView recview;
    DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutionposts);
        ref = FirebaseDatabase.getInstance().getReference().child("Tutions");
        recview = findViewById(R.id.recview);

        FirebaseRecyclerOptions<model> options;
        FirebaseRecyclerAdapter<model, myviewholder> adapter;

        recview.setHasFixedSize(true);
        recview.setLayoutManager(new LinearLayoutManager(this));

        options = new FirebaseRecyclerOptions.Builder<model>().setQuery(ref,model.class).build();
        adapter = new FirebaseRecyclerAdapter<model, myviewholder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {
                holder.cls.setText("Class : "+model.getClassinformation());
                holder.subject.setText("Subject : "+model.getSubjectinformation());
                holder.university.setText("Preferred University : "+model.getUniversityinformation());
                holder.days.setText("Days : "+model.getDaysinformation());
                holder.area.setText("Area : "+model.getAreainformation());
                holder.salary.setText("Salary : "+model.getSalaryinformation()+"\nContact : "+" (After Confirmation and Payment)");
            }

            @NonNull
            @Override
            public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item,parent,false);
                return new myviewholder(v);
            }
        };
        adapter.startListening();
        recview.setAdapter(adapter);
    }
}