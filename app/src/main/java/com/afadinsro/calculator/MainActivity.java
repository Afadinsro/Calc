package com.afadinsro.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "in method onCreate()");
        setContentView(R.layout.activity_main);

        Button addBtn = (Button)findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumText = (EditText)findViewById(R.id.firstNumPT);
                EditText secondNumText = (EditText)findViewById(R.id.secondNumPT);
                TextView resultTV = (TextView)findViewById(R.id.resultTV);

                int x = Integer.parseInt(firstNumText.getText().toString());
                int y = Integer.parseInt(secondNumText.getText().toString());
                int sum = x + y;

                resultTV.setText(sum);
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "in method onResume()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "in method onStart()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "in method onStop()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "in method onPause()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "in method onDestroy()");
    }

}
