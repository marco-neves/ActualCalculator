package com.example.therealcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity{

    private TextView calculatorText;
    private static final String TAG = "MainActivity";

    double mValueOne, mValueTwo;

    boolean addition, subtract, multiplication, division, negation, remainder, dot, sine, cos;
    /*
    * onCreate() - Activity is actually being created
    * onStart() - Activity is being called to foreground
    * onResume() - Activity is actually visible to the user at this point
    * onPause() - Activity is partially visible
    * onStop() - Activity is no longer visible to the user
    * onRestart() -
    * onDestroy() - Activity has been destroyed
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        calculatorText = findViewById(R.id.my_textView);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    public void onButtonClick(View view){
        String newText = "";

        switch (view.getId())
        {
            case R.id.one_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.two_button:
                newText = calculatorText.getText().toString().trim()+2;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.three_button:
                newText = calculatorText.getText().toString().trim()+3;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.four_button:
                newText = calculatorText.getText().toString().trim()+4;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.five_button:
                newText = calculatorText.getText().toString().trim()+5;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.six_button:
                newText = calculatorText.getText().toString().trim()+6;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.seven_button:
                newText = calculatorText.getText().toString().trim()+7;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.eight_button:
                newText = calculatorText.getText().toString().trim()+8;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.nine_button:
                newText = calculatorText.getText().toString().trim()+9;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;
            case R.id.zero_button:
                newText = calculatorText.getText().toString().trim();
                if(!newText.equals("0")) {
                    newText = newText + 0;
                    calculatorText.setText(newText);
                    Log.d(TAG, newText);
                }

                break;
            case R.id.pi_button:
                newText = calculatorText.getText().toString().trim()+3.1459;
                calculatorText.setText(newText);
                Log.d(TAG, newText);

                break;

            case R.id.ac_button:
                calculatorText.setText("0");
                Log.d(TAG, newText);

                break;
            case R.id.plus_button:
                if (calculatorText == null || calculatorText.getText().toString() == "0") {
                    calculatorText.setText("");
                    Log.d(TAG, newText);
                } else {
                    mValueOne = Float.parseFloat(calculatorText.getText() + "");
                    addition = true;
                    calculatorText.setText(null);
                }

                break;
            case R.id.minus_button:
                mValueOne = Float.parseFloat(calculatorText.getText() + "");
                subtract = true;
                calculatorText.setText(null);

                break;

            case R.id.dot_button:
                mValueOne = Float.parseFloat(calculatorText.getText() + "");
                dot = true;
                calculatorText.setText(mValueOne + ".");

            case R.id.division_button:
                mValueOne = Float.parseFloat(calculatorText.getText() + "");
                division = true;
                calculatorText.setText(null);

                break;
            case R.id.x_button:
                mValueOne = Float.parseFloat(calculatorText.getText() + "");
                multiplication = true;
                calculatorText.setText(null);

                break;

            case R.id.remainder_button:
                mValueOne = Float.parseFloat(calculatorText.getText() + "");
                remainder = true;
                calculatorText.setText(null);

                break;

            case R.id.negation_button:
                mValueOne = Float.parseFloat(calculatorText.getText() + "");
                mValueOne*=-1;
                negation = true;
                calculatorText.setText( mValueOne +"" );

                break;

            case R.id.sin_button:
                mValueOne = Float.parseFloat(calculatorText.getText() + "");
                sine = true;

                calculatorText.setText(Math.sin( (Math.toRadians(mValueOne)) ) + "");

                break;

            case R.id.cos_button:
                mValueOne = Float.parseFloat(calculatorText.getText() + "");
                cos = true;
                calculatorText.setText(Math.cos( (Math.toRadians(mValueOne)) ) + "");

                break;

            case R.id.equals_button:
                mValueTwo = Float.parseFloat(calculatorText.getText() + "");

                if (addition == true) {
                    newText = mValueOne + mValueTwo + "";
                    calculatorText.setText(newText);
                    Log.d(TAG, newText);
                    addition = false;
                }

                if (subtract == true) {
                    newText = mValueOne - mValueTwo + "";
                    calculatorText.setText(newText);
                    Log.d(TAG, newText);
                    subtract = false;
                }

                if (multiplication == true) {
                    newText = mValueOne * mValueTwo + "";
                    calculatorText.setText(newText);
                    Log.d(TAG, newText);
                    multiplication = false;
                }

                if (division == true) {
                    newText = mValueOne / mValueTwo + "";
                    calculatorText.setText(newText);
                    Log.d(TAG, newText);
                    division = false;
                }


                if (remainder == true) {
                    newText = mValueOne % mValueTwo + "";
                    calculatorText.setText(newText);
                    Log.d(TAG, newText);
                    remainder = false;
                }

//                if (sine == true) {
//                    newText = Math.sin( (Math.toRadians(mValueOne)) ) + "";
//                    calculatorText.setText(newText);
//                    Log.d(TAG, newText);
//                    remainder = false;
//                }
//
//                if (sine == true) {
//                    newText = Math.cos( (Math.toRadians(mValueOne)) ) + "";
//                    calculatorText.setText(newText);
//                    Log.d(TAG, newText);
//                    remainder = false;
//                }

                break;
        }
    }
}
