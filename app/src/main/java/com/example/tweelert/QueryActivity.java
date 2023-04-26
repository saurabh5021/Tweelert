package com.example.tweelert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class QueryActivity extends AppCompatActivity {
    private AutoCompleteTextView yearTextView;
    private AutoCompleteTextView monthTextView;
    private AutoCompleteTextView stateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        yearTextView = findViewById(R.id.yearAutoCompleteTextView);
        monthTextView = findViewById(R.id.monthAutoCompleteTextView);
        stateTextView = findViewById(R.id.stateAutoCompleteTextView);

        // Provide options for yearTextView
        String[] years = {"2023", "2024"};
        ArrayAdapter<String> yearAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, years);
        yearTextView.setAdapter(yearAdapter);

        // Provide options for monthTextView
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, months);
        monthTextView.setAdapter(monthAdapter);

        // Provide options for stateTextView
        String[] states = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"};
        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, states);
        stateTextView.setAdapter(stateAdapter);
    }
}

