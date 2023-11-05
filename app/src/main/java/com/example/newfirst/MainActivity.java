package com.example.newfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView txtName = new TextView(this);
        txtName.setTextSize(50);
        txtName.setText("Hello Android ");
        setContentView(txtName);
    }
}