package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerviewexample.interfaces.AppInterfaces;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView ProgrammingList = findViewById(R.id.programming_list);
        ProgrammingList.setLayoutManager(new LinearLayoutManager(this)); //to arrange the recycler view
        String[] languages = {"Python" , "Java" , "html" , "css" , "js" , "kotlin" , "android","Python" , "Java" , "html" , "css" , "js" , "kotlin" , "android"};

        ProgrammingList.setAdapter(new ProgrammingAdapter(languages , new AppInterfaces.AdapterClick() {
            @Override
            public void onClick(int position) {

                Toast.makeText(MainActivity.this, String.format("Clicked language %s", languages[position]), Toast.LENGTH_SHORT).show();
            }
        }));
    }
}