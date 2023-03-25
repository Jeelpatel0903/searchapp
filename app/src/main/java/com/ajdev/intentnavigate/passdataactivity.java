package com.ajdev.intentnavigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class passdataactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passdataactivity);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String str=getIntent().getExtras().getString("msg");

        textView.setText(str);
    }
}