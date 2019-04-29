package com.example.telljokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private TextView jokeTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeTextView = findViewById(R.id.tv_joke);

        Intent intent = getIntent();

        String jokeString;

        if (intent.hasExtra(Intent.EXTRA_TEXT)) {

            jokeString = intent.getStringExtra(Intent.EXTRA_TEXT);

        } else {

            jokeString = "No joke! :(";

        }

        jokeTextView.setText(jokeString);
    }

}
