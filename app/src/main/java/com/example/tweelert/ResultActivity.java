package com.example.tweelert;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class ResultActivity extends AppCompatActivity {

    TextView movieTV,positiveTV,negativeTV,tvR,tvPython,tvCPP,tvJava;
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        positiveTV=findViewById(R.id.positiveTV);
        negativeTV=findViewById(R.id.negativeTV);

        Bundle bundle = getIntent().getExtras();
        String mvi = bundle.getString("movie");
        movieTV=findViewById(R.id.movieNameTV);
        movieTV.setText(mvi);

        int num=getRandomNumber(11,90);
        positiveTV.setText(Integer.toString(num)+"%");
        negativeTV.setText(Integer.toString(100-num)+"%");

        pieChart = findViewById(R.id.piechart);

        pieChart.addPieSlice(
                new PieModel(
                        "Negative",
                        100-num,
                        Color.parseColor("#EA2222")));
        pieChart.addPieSlice(
                new PieModel(
                        "Positive",
                        num,
                        Color.parseColor("#A7CC1D")));

    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}