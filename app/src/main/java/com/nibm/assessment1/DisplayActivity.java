package com.nibm.assessment1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DisplayActivity extends AppCompatActivity {

    TextView tvName, tvEmail, tvMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_display);

        getSupportActionBar().hide();

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvMobile = findViewById(R.id.tvMobile);

        tvName.setText("Name: " + getIntent().getStringExtra("name"));
        tvEmail.setText("Email: " + getIntent().getStringExtra("email"));
        tvMobile.setText("Mobile: " + getIntent().getStringExtra("mobile"));

    }
}