package com.nibm.assessment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson2 extends AppCompatActivity {

    EditText editName, editEmail, editMobile;
    Button btnSubmit, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson2);

        getSupportActionBar().hide();

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editMobile = findViewById(R.id.editMobile);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);

        btnSubmit.setOnClickListener(v -> {

            String name = editName.getText().toString().trim();
            String email = editEmail.getText().toString().trim();
            String mobile = editMobile.getText().toString().trim();

            if (name.isEmpty()) {
                editName.setError("Please enter your name");
                return;
            }

            if (email.isEmpty()) {
                editEmail.setError("Please enter your email");
                return;
            }

            if (mobile.isEmpty()) {
                editMobile.setError("Please enter your mobile number");
                return;
            }

            Intent intent = new Intent(Lesson2.this, DisplayActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("mobile", mobile);

            startActivity(intent);
        });

        btnClear.setOnClickListener(v -> {
            editName.setText("");
            editEmail.setText("");
            editMobile.setText("");
            editName.requestFocus();
        });



    }
}