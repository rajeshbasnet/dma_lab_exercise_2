package com.example.lab_ex_2_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int initialCount = 0;
    TextView showText;
    Button buttonZero;
    Button buttonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = findViewById(R.id.show_count);
        buttonZero = findViewById(R.id.button_zero);
        buttonCount = findViewById(R.id.button_count);
    }

    public void countUp(View view) {
        initialCount++;

        if(initialCount >= 0) {
            showText.setText(String.valueOf(initialCount));
            buttonZero.setBackgroundColor(getResources().getColor(R.color.pink));
            buttonCount.setBackgroundColor(getResources().getColor(R.color.lime));
        }
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void setToZero(View view) {
        initialCount = 0;
        buttonZero.setBackgroundColor(getResources().getColor(R.color.gray));
        buttonCount.setBackgroundColor(getResources().getColor(R.color.blue));
        showText.setText(String.valueOf(initialCount));
    }

}