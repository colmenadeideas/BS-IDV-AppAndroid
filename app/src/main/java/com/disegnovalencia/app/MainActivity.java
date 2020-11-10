package com.disegnovalencia.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        Intent i = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://app.disegnovalencia.com")
        );

        // Starts Implicit Activity
        startActivity(i);
        finish();
    }
}