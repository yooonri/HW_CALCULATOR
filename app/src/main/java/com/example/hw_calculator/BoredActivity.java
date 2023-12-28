package com.example.hw_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BoredActivity extends AppCompatActivity {
    private TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bored_activity);
        textView = findViewById(R.id.result);
        Intent intent = getIntent();
        int data = intent.getIntExtra("key", 0);
        textView.setText(Integer.toString(data));

        Spinner spinner = findViewById(R.id.spinner);
        String[] data1 = {"Type 1", "Type 2", "Type 3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            onRestart();
        });
    }
}