package com.example.onlinetutorapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {
    TextView cls,subject,university, area, days, salary;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        cls = itemView.findViewById(R.id.text1);
        subject = itemView.findViewById(R.id.text2);
        university = itemView.findViewById(R.id.text3);
        area = itemView.findViewById(R.id.text4);
        days = itemView.findViewById(R.id.text5);
        salary = itemView.findViewById(R.id.text6);

    }
}
