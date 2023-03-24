package com.ajdev.intentnavigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText=findViewById(R.id.urltxt);
        Button btn=findViewById(R.id.urlbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = editText.getText().toString();

                if (editText.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please Enter some url....", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+url));
                    startActivity(intent);
                    editText.setText("");
                }



            }
        });


    }
}