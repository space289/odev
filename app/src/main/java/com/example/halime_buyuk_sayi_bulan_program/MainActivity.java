package com.example.halime_buyuk_sayi_bulan_program;

import static android.app.ProgressDialog.show;
import static java.util.TimeZone.LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextsayi1;
    EditText editTextsayi2;
    Button kontrolEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kontrolEt = findViewById(R.id.kontrol_et);
        editTextsayi1 = findViewById(R.id.editText1_sayi);
        editTextsayi2 = findViewById(R.id.editText2_sayi);
        kontrolEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontrol(view);
            }
        });
    }

    public void kontrol(View view){
        int sayi1 = Integer.parseInt(editTextsayi1.getText().toString());
        int sayi2 = Integer.parseInt(editTextsayi2.getText().toString());
        if(sayi1>sayi2){
            Toast.makeText(MainActivity.this,"1. Sayı Daha Büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(sayi2>sayi1){
            Toast.makeText(MainActivity.this,"2. Sayı Daha Büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(sayi1==sayi2){
            Toast.makeText(MainActivity.this,"İki sayı birbirine eşittir.",Toast.LENGTH_LONG).show();
        }
    }
}