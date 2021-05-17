package com.example.soc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HistActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1980, b1970, b1960, b1950, b1940, b1997, b1920, btnFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hist);
        btnFirst = findViewById(R.id.btnFIRST);
        //b1920 = findViewById(R.id.button1920);
        b1997 = findViewById(R.id.b1997);
        //b1940 = findViewById(R.id.button1940);
        //b1950 = findViewById(R.id.button1950);
        //b1960 = findViewById(R.id.button1960);
        //b1970 = findViewById(R.id.button1970);
        b1980 = findViewById(R.id.button1980);

        btnFirst.setOnClickListener(this);
        b1980.setOnClickListener(this);
        b1997.setOnClickListener(this);
        // button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFIRST:
                Toast.makeText(this, "Возникла социология как система научного знания!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b1997:
                Toast.makeText(this, "Г.П. Бурдье говорит о неопределенности", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1980:
                Toast.makeText(this, "Всемирная стратегия ООС", Toast.LENGTH_SHORT).show();
                break;
            //case R.id.button3: editText.setText("Нажата кнопка Button3"); break;
        }
    }
}