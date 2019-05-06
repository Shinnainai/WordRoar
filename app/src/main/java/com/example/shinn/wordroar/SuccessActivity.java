package com.example.shinn.wordroar;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        SharedPreferences sharedPref = this.getPreferences(MODE_PRIVATE);
        int currentHighScore = sharedPref.getInt(getString(R.string.saved_high_score_key), 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int newHighScore = currentHighScore + 100;
        editor.putInt(getString(R.string.saved_high_score_key), newHighScore);
        editor.apply();

        TextView total = findViewById(R.id.success_total);
        total.setText("You now have " + newHighScore + " points");
    }
}
