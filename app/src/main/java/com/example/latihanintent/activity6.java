package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity6 extends AppCompatActivity implements View.OnClickListener {
    Button tombol6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity6);
        tombol6 = (Button) findViewById(R.id.btn5);
        tombol6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn5:
                Intent tombol6 = new Intent(this, MainActivity.class);
                startActivity(tombol6);
                break;
        }

    }
}
