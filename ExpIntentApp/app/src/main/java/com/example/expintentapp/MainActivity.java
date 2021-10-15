package com.example.expintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // mendeklarasikan String
    EditText name;
    // mendeklarasikan button
    Button btnSend;
    // mendeklarasikan string dengan private
    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mengambil nilai nama dari MainActivy berdasarkan id
        name = (EditText) findViewById(R.id.edt_nama);
        // mengambil nilai nama dari MainActivy berdasarkan id
        btnSend = (Button) findViewById(R.id.btn_send);
        // menjalankan fungsi apabila button ditekan
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // mengambil nilai dari variabel name
                    String nama = name.getText().toString();
                    // mengecek apakah variabel name kosong
                    if (nama != ""){
                        Intent i = new Intent(MainActivity.this, MainActivity2.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);
                    // jika kosong maka program akan menampilkan pesan peringatan
                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }
                    // jika terjadi error maka program akan menampilkan pesan error
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
                }
            }
        });

    }
}