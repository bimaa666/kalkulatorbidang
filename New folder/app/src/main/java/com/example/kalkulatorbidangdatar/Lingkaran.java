package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lingkaran extends AppCompatActivity {

    private EditText diameter;
    private EditText hasil3;
    private Button luas3;
    private Button keliling3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        diameter = (EditText) findViewById(R.id.diameter);
        hasil3 = (EditText) findViewById(R.id.hasil3);
        luas3 = (Button) findViewById(R.id.luas3);
        keliling3 = (Button) findViewById(R.id.keliling3);
    }

    public void lLingkaran(View view) {
        try {
            int r = Integer.parseInt(diameter.getText().toString());
            double phi = 3.14;
            double luas3 = phi * r * r / 2;
            hasil3.setText(String.valueOf(luas3));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void kLingkaran(View view) {
        try {
            int d = Integer.parseInt(diameter.getText().toString());
            double phi = 3.14;
            double keliling3 = phi * d;
            hasil3.setText(String.valueOf(keliling3));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void kembalil(View view) {
        finish();
    }
}