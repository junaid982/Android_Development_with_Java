package com.example.calculatetableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText getTableValue;
    View submit;
    TextView showTable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTableValue = findViewById(R.id.getTableValue);
        submit = findViewById(R.id.submit);
        showTable = findViewById(R.id.showTable);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this , "Button CLicked" , Toast.LENGTH_LONG).show();

                if(getTableValue.length() <= 0){
                    showTable.setText("");

                    Toast.makeText(MainActivity.this , "Invalid Number !" , Toast.LENGTH_LONG).show();
                }
                else{
                    int number = Integer.parseInt(getTableValue.getText().toString());
//                    Toast.makeText((Context) MainActivity.this, "Data is Here" , Toast.LENGTH_LONG).show();
                    showTable.setText("");
                    for(int i = 1 ; i<= 10 ; i++){
                        showTable.append(number+" * "+i +" = "+number*i+"\n");
                    }
                    getTableValue.setText("");
                }


            }
        });


    }

    public void clear(View v){
        getTableValue.setText("");
        showTable.setText("");

    }
}