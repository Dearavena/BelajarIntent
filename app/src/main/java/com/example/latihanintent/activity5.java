package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity5 extends AppCompatActivity implements View.OnClickListener {
    Button tombol5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5);
        tombol5 = (Button) findViewById(R.id.btn4);
        tombol5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn4:
                Intent tombol5 = new Intent(this, activity6.class);
                startActivity(tombol5);
                break;
        }

    }
}
