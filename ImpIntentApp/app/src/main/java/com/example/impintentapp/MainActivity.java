package com.example.impintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // mendeklarasikan button
    Button button;
    // mendeklarasikan EditText
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // menngambil nilai dengan id
        button = findViewById(R.id.button);
        // mengambil String dengan id
        editText = findViewById(R.id.editText);
        // fungsi yang akan dijalankan apabila var button ditekan
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // mengambil url dari editText
                String url=editText.getText().toString();
                // menetapkan url
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                // menjalankan intent dan mengeksekusi url
                startActivity(intent);
            }
        });
    }
}