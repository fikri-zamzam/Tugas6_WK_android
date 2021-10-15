package com.example.expintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    // mendeklarasikan TextView
    TextView txtHello;
    // mendeklarasikan String
    private String nama;
    // mendeklarasikan string dengan private
    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // mengambil textview dari id
        txtHello = (TextView) findViewById(R.id.txtHello);
        // mendeklarasikan bundle untuk mengakses data yang sebelumnya dikirim
        Bundle extras = getIntent().getExtras();
        // mengambil String dari variabel KEY_NAME
        nama = extras.getString(KEY_NAME);
        // Menampilkan Pesan beserta String nama
        txtHello.setText("Hello, " + nama + " !");
    }
}