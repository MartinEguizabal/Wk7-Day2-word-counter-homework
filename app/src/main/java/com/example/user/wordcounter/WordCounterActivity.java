package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText enteredText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        Log.d(getClass().toString(), "onCreate called");

        enteredText = (EditText)findViewById(R.id.text_block);
        button = (Button)findViewById(R.id.button);
    }

    public void onButtonClicked(View button){
        Log.d(getClass().toString(), "onButtonClicked was called");
        String text = enteredText.getText().toString();
        Log.d(getClass().toString(), "The text entered was '" + text + "'");
    }
}
