package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    private EditText txt_alass;
    private EditText txt_tinggis;
    private EditText txt_sisias;
    private EditText txt_sisibs;
    private EditText txt_sisics;
    private EditText hasil;
    private Button luSegitiga;
    private Button keSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        txt_alass = (EditText) findViewById(R.id.txt_alass);
        txt_tinggis = (EditText) findViewById(R.id.txt_tinggis);
        txt_sisias = (EditText) findViewById(R.id.txt_sisias);
        txt_sisibs = (EditText) findViewById(R.id.txt_sisibs);
        txt_sisics = (EditText) findViewById(R.id.txt_sisics);
        hasil = (EditText) findViewById(R.id.hasil);
        luSegitiga = (Button) findViewById(R.id.luSegitiga);
        keSegitiga = (Button) findViewById(R.id.keSegitiga);

    }

    public void lSegitiga(View view) {
        try {
            int a = Integer.parseInt(txt_alass.getText().toString());
            int t = Integer.parseInt(txt_tinggis.getText().toString());
            int luas = (a * t) / 2;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kSegitiga(View view) {
        try {
            int a1 = Integer.parseInt(txt_sisias.getText().toString());
            int b = Integer.parseInt(txt_sisibs.getText().toString());
            int c = Integer.parseInt(txt_sisics.getText().toString());
            int keliling = a1+b+c;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembalis(View view) {
        finish();
    }
}