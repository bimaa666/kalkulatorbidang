package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Persegi extends AppCompatActivity {

    private EditText txt_sisip;
    private EditText hasil1;
    private Button luas1;
    private Button keliling1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        txt_sisip = (EditText) findViewById(R.id.txt_sisip);
        hasil1 = (EditText) findViewById(R.id.hasil1);
        luas1 = (Button) findViewById(R.id.luas1);
        keliling1 = (Button) findViewById(R.id.keliling1);
    }

    public void lPersegi(View view) {
        try {
            int s = Integer.parseInt(txt_sisip.getText().toString());
            double luas1 = s * s;
            hasil1.setText(String.valueOf(luas1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kPersegi(View view) {
        try {
            int s = Integer.parseInt(txt_sisip.getText().toString());
            double keliling1 = 4 * s;
            hasil1.setText(String.valueOf(keliling1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembalip(View view) {
        finish();
    }
}