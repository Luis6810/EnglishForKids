package com.example.englishfor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public Button btnNumbers;
    public Button btnBody;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNumbers = (Button) findViewById(R.id.Numbers);

        btnBody = (Button) findViewById(R.id.Body);

        btnNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hola",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Numbers.class);
                startActivity(intent);
            }
        });



    }









}