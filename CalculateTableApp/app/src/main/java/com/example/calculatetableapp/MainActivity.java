package com.example.calculatetableapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.calculatetableapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    /*TODO Step 3: Create object of dataBinding: XML name and binding in the end*/
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*TODO Step 4: initiate the layout*/
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

       binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this , "Button CLicked" , Toast.LENGTH_LONG).show();

                if(binding.getTableValue.length() <= 0){
                    binding.showTable.setText("");

                    Toast.makeText(MainActivity.this , "Invalid Number !" , Toast.LENGTH_LONG).show();
                }
                else{
                    int number = Integer.parseInt(binding.getTableValue.getText().toString());
//                    Toast.makeText((Context) MainActivity.this, "Data is Here" , Toast.LENGTH_LONG).show();
                    binding.showTable.setText("");
                    for(int i = 1 ; i<= 10 ; i++){
                        binding.showTable.append(number+" * "+i +" = "+number*i+"\n");
                    }
                    binding.getTableValue.setText("");
                }


            }
        });


    }

    public void clear(View v){
        binding.getTableValue.setText("");
        binding. showTable.setText("");

    }
}