package com.example.shinn.wordroar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class GrammarGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_game);

        ImageButton homeBtn = findViewById(R.id.home_button);
        homeBtn.setOnClickListener((view) -> {
            finish();
        });

        Button submitBtn = findViewById(R.id.grammar_game_answer_button);
        submitBtn.setOnClickListener((view) -> {
            EditText editText = findViewById(R.id.answer_box_edittext);
            if(editText.getText().toString().equalsIgnoreCase("Do you think it will rain today?")) {
                displaySuccessPage();
            }
        });
    }

    private void displaySuccessPage() {
        Intent intent = new Intent(this, SuccessActivity.class);
        startActivity(intent);
        finish();
    }
}
