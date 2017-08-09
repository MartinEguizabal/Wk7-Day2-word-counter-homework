package com.example.user.wordcounter;

import android.app.ActionBar;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.BitSet;

/**
 * Created by user on 09/08/2017.
 */

public class AnswerProvider {

    EditText enteredText;

    private ArrayList<String> words;

    public AnswerProvider() {
        words = new ArrayList<String>();
        splitPushToWords();
    }

    private String[] splitPushToWords() {
        String text = enteredText.getText().toString();
        words.add(text);

        for(String word : words) {
            String[] split_words = word.split(" ");
        }
        return split_words;
        for(int i = 0; split_words.length(); i++
    }
}
