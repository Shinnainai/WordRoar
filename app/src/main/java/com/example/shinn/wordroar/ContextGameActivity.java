package com.example.shinn.wordroar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ContextGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_game);

        ImageButton homeBtn = findViewById(R.id.home_button);
        homeBtn.setOnClickListener((view) -> {
            finish();
        });

        Button submitBtn = findViewById(R.id.context_game_submit_button);
        RadioGroup group = findViewById(R.id.answers_group);
        submitBtn.setOnClickListener((view) -> {
            RadioButton answer = findViewById(R.id.optB);
            if(answer.isChecked()) {
                showSuccessPage();
            } else
                showFailurePage();
        });

    }

    private void showSuccessPage() {
        Intent intent = new Intent(this, SuccessActivity.class);
        startActivity(intent);
        finish();
    }

    private void showFailurePage() {
        Intent intent = new Intent(this, FailureActivity.class);
        startActivity(intent);
    }
}
