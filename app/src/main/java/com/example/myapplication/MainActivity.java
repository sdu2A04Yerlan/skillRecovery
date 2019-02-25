package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button login;
    protected EditText username;
    protected EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.LoginProceed);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.LoginProceed:
                    if (username.getTextSize()>0){
                        Toast.makeText(this, username.getText(), Toast.LENGTH_SHORT);
                    }
            }
    }
}
