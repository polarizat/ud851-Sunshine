package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();
        if (intent.getStringExtra(Intent.EXTRA_TEXT) != null) {
            String weather = getIntent().getStringExtra(Intent.EXTRA_TEXT);
            Toast.makeText(this, weather, Toast.LENGTH_SHORT).show();

        }
    }
}