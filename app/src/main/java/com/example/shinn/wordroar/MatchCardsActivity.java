package com.example.shinn.wordroar;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MatchCardsActivity extends AppCompatActivity {

    private final int REQ_CODE_SPEECH_INPUT = 100;
    private ImageView card1img;
    private ImageView card2img;
    private ImageView card3img;
    private TextView card1tv;
    private TextView card2tv;
    private TextView card3tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_cards);

        ImageButton homeBtn = findViewById(R.id.home_button);
        homeBtn.setOnClickListener((view) -> {
            finish();
        });

        card1img = findViewById(R.id.match_cards_img1);
        card2img = findViewById(R.id.match_cards_img2);
        card3img = findViewById(R.id.match_cards_img3);
        card1tv = findViewById(R.id.match_cards_tv1);
        card2tv = findViewById(R.id.match_cards_tv2);
        card3tv = findViewById(R.id.match_cards_tv3);

        Button record1 = findViewById(R.id.match_cards_record_button1);
        record1.setOnClickListener((view) -> {
            promptSpeechInput();
        });
        Button record2 = findViewById(R.id.match_cards_record_button2);
        record2.setOnClickListener((view) -> {
            promptSpeechInput();
        });
        Button record3 = findViewById(R.id.match_cards_record_button3);
        record3.setOnClickListener((view) -> {
            promptSpeechInput();
        });

    }

    /**
     * Showing google speech input dialog
     * */
    private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "Speak now");
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "Speech not supported on device",
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Receiving speech input
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    if(result.get(0).equalsIgnoreCase("crab")) {
                        card1img.setImageResource(R.drawable.green_tick);
                        card1tv.setVisibility(View.GONE);
                    } else if(result.get(0).equalsIgnoreCase("ball")) {
                        card2img.setImageResource(R.drawable.green_tick);
                        card2tv.setVisibility(View.GONE);
                    } else if(result.get(0).equalsIgnoreCase("strawberry")) {
                        card3img.setImageResource(R.drawable.green_tick);
                        card3tv.setVisibility(View.GONE);
                    } else {
                        Toast.makeText(this, "Sorry, try again!", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            }

        }
    }
}
