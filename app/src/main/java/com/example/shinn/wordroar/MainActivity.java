package com.example.shinn.wordroar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton matchTwoBtn = findViewById(R.id.match_two_img);
        matchTwoBtn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, MatchTwoActivity.class);
            startActivity(intent);
        });

        ImageButton matchCardsBtn = findViewById(R.id.match_cards_img);
        matchCardsBtn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, MatchCardsActivity.class);
            startActivity(intent);
        });

        ImageButton grammarGameBtn = findViewById(R.id.grammar_game_img);
        grammarGameBtn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, GrammarGameActivity.class);
            startActivity(intent);
        });

        ImageButton contextGameBtn = findViewById(R.id.context_game_img);
        contextGameBtn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, ContextGameActivity.class);
            startActivity(intent);
        });

        ImageButton timerGameBtn = findViewById(R.id.timer_game_img);
        timerGameBtn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, TimerGameActivity.class);
            startActivity(intent);
        });
    }
}
