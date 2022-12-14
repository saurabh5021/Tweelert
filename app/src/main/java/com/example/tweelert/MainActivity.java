package com.example.tweelert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText movieET;
    Button searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieET=findViewById(R.id.movieeditText);

        searchBtn=findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String movieName=movieET.getText().toString();
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("movie",movieName);
                if(!movieName.equals("")){
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Add a Movie Name", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}