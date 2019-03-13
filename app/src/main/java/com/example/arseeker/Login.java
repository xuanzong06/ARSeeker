package com.example.arseeker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button loginbutton;
    private EditText accountText;
    private EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbutton = findViewById(R.id.loginbtn);
        accountText = findViewById(R.id.account);
        passwordText = findViewById(R.id.password);

        loginbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Login123();
            }
        });
    }

    public void Login123(){


        if(accountText.getText().toString().equals("a") &&passwordText.getText().toString().equals("123")){
            Toast.makeText(this, "帳號密碼正確", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "帳號密碼錯誤", Toast.LENGTH_SHORT).show();

        }
    }
}
