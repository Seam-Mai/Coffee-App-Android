package com.oudevit.devit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Username, password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.signupRedirectText);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SignUp.class);
                startActivity(intent);
            }
        });


        Username =(EditText) findViewById(R.id.login_username);
        password = (EditText)findViewById(R.id.login_password);
       Login = (Button) findViewById(R.id.login_button);

       Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNameText = Username.getText().toString();
                String lastNameText = password.getText().toString();
                Toast.makeText(getApplicationContext(),password.getText(),Toast.LENGTH_LONG);
                if(firstNameText.equals("")){
                    Username.setError("Please input your Username");
                    Username.requestFocus();
                } else if (firstNameText.equals("Mai")) {
                    Toast.makeText(getApplicationContext(),"is conrrect Usernsme",Toast.LENGTH_LONG);
                    if(lastNameText.equals("030104")){
                        startActivity(new Intent(MainActivity.this,SecondActivity.class));
                    }else {
                        password.setError("Inconrrect  password");
                        password.requestFocus();
                    }

                } else{
                    Username.setError("input correct your Username");
                    Username.requestFocus();
                }

            }
        });
    }

}