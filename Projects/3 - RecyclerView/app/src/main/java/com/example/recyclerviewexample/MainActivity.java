package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView ProgrammingList = findViewById(R.id.programming_list);
        ProgrammingList.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"Python" , "Java" , "html" , "css" , "js" , "kotlin" , "android","Python" , "Java" , "html" , "css" , "js" , "kotlin" , "android"};
        ProgrammingList.setAdapter(new ProgrammingAdapter(languages));
    }
}