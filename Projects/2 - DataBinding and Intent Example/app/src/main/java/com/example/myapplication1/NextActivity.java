package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication1.databinding.ActivityNextBinding;

public class NextActivity extends AppCompatActivity {

    ActivityNextBinding binding;

    private int seconds = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_next);


        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent back = new Intent(NextActivity.this , MainActivity.class);
//                startActivity(back);

//                onBackPressed();
                handler();
            }
        });

        binding.successBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NextActivity.this, "Data Bindig Success Full and Intent Working", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void handler() {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (seconds > 30) {
                    seconds--;
                    handler.postDelayed(this, 1000);
                } else {
                    onBackPressed();
                }
            }
        });
    }
}