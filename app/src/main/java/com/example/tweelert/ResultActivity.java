package com.example.tweelert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView movieTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getExtras();
        String mvi = bundle.getString("movie");
        movieTV=findViewById(R.id.movieNameTV);
        movieTV.setText(mvi);

    }
}