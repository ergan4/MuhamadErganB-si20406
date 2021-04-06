package com.example.si20406uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button tambah;
    CheckBox belum;
    CheckBox selesai;
    Button hapus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        tambah = findViewById(R.id.tambah);
        belum = findViewById(R.id.belum);
        selesai = findViewById(R.id.selesai);
        hapus = findViewById(R.id.hapus);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belum.setText(input.getText().toString());
                input.getText().clear();

            }
        });

        belum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selesai.setText(belum.getText().toString());
            }
        });


        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                belum.setText(input.getText().toString());
                input.getText().clear();

            }
        });

    }

}