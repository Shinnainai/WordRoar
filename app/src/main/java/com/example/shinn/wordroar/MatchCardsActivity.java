package com.example.shinn.wordroar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

public class MatchCardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_cards);

        ImageButton homeBtn = findViewById(R.id.home_button);
        homeBtn.setOnClickListener((view) -> {
            finish();
        });
    }
}
