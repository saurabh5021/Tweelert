package com.example.tweelert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Button btnLogin;
    private TextView textRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextInputEditText email = findViewById(R.id.emaileditText);
        TextInputEditText password = findViewById(R.id.passwordeditText);
        String emailStr= email.getText().toString();
        String passwordStr= password.getText().toString();
        btnLogin  = findViewById(R.id.loginbutton4);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                startActivity(intent);

            }
        });

//        mAuth = FirebaseAuth.getInstance();
//        email = findViewById(R.id.emaileditText);
//        password = findViewById(R.id.passwordeditText);

//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                login();
//            }
//        });
//
//        textRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
//            }
//        });
//    }
//
//    private void login()
//    {
//        String user = email.getText().toString().trim();
//        String pass = password.getText().toString().trim();
//        if(user.isEmpty())
//        {            email.setError("Email can not be empty");        }
//        if(pass.isEmpty())
//        {            password.setError("Password can not be empty");        }
//        else
//        {
//            mAuth.signInWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task)
//                {
//                    if(task.isSuccessful())
//                    {
//                        Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                        startActivity(new Intent(LoginActivity.this , MainActivity.class));
//                    }
//                    else
//                    {
//                        Toast.makeText(LoginActivity.this, "Login Failed"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//        }
    }
}