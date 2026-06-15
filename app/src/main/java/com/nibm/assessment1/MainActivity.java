package com.nibm.assessment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(
                view ->{
                    Intent intent = new Intent(MainActivity.this,Lesson1.class);
                    startActivity(intent);
                }

        );

        button2.setOnClickListener(
                view ->{
                    Intent intent = new Intent(MainActivity.this,Lesson2.class);
                    startActivity(intent);
                }

        );

        button3.setOnClickListener(
                view ->{
                    Intent intent = new Intent(MainActivity.this,Lesson3.class);
                    startActivity(intent);
                }

        );

    }
}