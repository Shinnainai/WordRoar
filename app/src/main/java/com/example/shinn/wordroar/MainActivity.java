package com.example.shinn.wordroar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPref;
    private int highScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        sharedPref = this.getPreferences(MODE_PRIVATE);
        SharedPreferences.OnSharedPreferenceChangeListener sharedPrefChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() {
            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
                highScore = sharedPref.getInt(getString(R.string.saved_high_score_key), 0);
                TextView scoreTV = findViewById(R.id.main_activity_score);
                scoreTV.setText("Total Points: " + Integer.toString(highScore));
            }
        };
        sharedPref.registerOnSharedPreferenceChangeListener(sharedPrefChangeListener);

        // On start app set score to 0
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(getString(R.string.saved_high_score_key), 0);
        editor.apply();

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
