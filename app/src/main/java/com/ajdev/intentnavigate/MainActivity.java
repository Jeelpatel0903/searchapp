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
        EditText passtxt = findViewById(R.id.passtxt);
        Button passbtn = findViewById(R.id.passbtn);
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
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+url+".com"));
                    startActivity(intent);
                    editText.setText("");
                }
            }
        });
        passbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = passtxt.getText().toString();
                if(passtxt.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter some text...", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent2 = new Intent(getApplicationContext(),passdataactivity.class);
                    intent2.putExtra("msg",msg);
                    startActivity(intent2);
                }
            }
        });
    }
}