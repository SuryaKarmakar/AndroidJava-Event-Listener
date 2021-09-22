package com.cybextron.eventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "setOnClickListener", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Lambda Expressions", Toast.LENGTH_SHORT).show();
        });

        View.OnClickListener viewOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "View OnClickListener", Toast.LENGTH_SHORT).show();
            }
        };
        btn3.setOnClickListener(viewOnClickListener);
    }
}