package com.example.therealcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void buttonClick(View view){
        Intent intent = null;

        switch (view.getId()){
            case R.id.calculator_button:
                intent  = new Intent( this, MainActivity.class); //Explicit Intent
                break;
        }
        if( intent != null)
            startActivity(intent);
    }
}
