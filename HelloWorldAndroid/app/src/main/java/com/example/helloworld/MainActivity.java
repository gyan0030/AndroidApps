package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloText = findViewById(R.id.helloText);
        Button helloButton = findViewById(R.id.helloButton);

        helloButton.setOnClickListener(view ->
                helloText.setText("Hello, Android!")
        );
    }
}
