package com.example.a7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayouts extends AppCompatActivity implements View.OnClickListener {
    Button btnl;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layouts);
        btnl = (Button) findViewById(R.id.button2);
        btnl.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(this, TableLayout.class);
        startActivity(in);
    }

}