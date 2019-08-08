package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity4 extends AppCompatActivity implements View.OnClickListener {
    Button tombol4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);
        tombol4 = (Button) findViewById(R.id.btn3);
        tombol4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn3:
                Intent tombol4 = new Intent(this, activity5.class);
                startActivity(tombol4);
                break;
        }

    }
}
