package com.example.login_validation;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void login(View view){
        EditText username = (EditText)findViewById(R.id.UserName);
        EditText password = (EditText)findViewById(R.id.Password);
        TextView op = (TextView)findViewById(R.id.output);
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            op.setText("Correct");
            Toast.makeText(MainActivity.this,"Validation Successful",Toast.LENGTH_LONG).show();
        }else{
            op.setText("Wrong");
            Toast.makeText(MainActivity.this,"Validation Error",Toast.LENGTH_LONG).show();
        }
    }
}