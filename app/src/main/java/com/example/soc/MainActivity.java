package com.example.soc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton btn, btnS, btnT, btnP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.imageButton7);
        btnS = findViewById(R.id.imageButton6);
        btnP = findViewById(R.id.imageButton5);
        btnS.setOnClickListener(v -> openSlavActivity());
        btnT = findViewById(R.id.imageButton4);
        btnP.setOnClickListener(v -> openParsActivity());
        btnT.setOnClickListener(v -> openTheoryActivity());
        btn.setOnClickListener(v -> openHistActivity());
    }
    public void openHistActivity() {
        Intent open = new Intent(this, HistActivity.class);
        startActivity(open);
    };
    private void openSlavActivity() {
        Intent openS = new Intent(this, SlaverActivity.class);
        startActivity(openS);
    };
    public void openParsActivity() {
        Intent openP = new Intent(this, ParsActivity.class);
        startActivity(openP);
    };
    public void openTheoryActivity() {
        Intent openT = new Intent(this, TheoryActivity.class);
        startActivity(openT);
    }
    }
