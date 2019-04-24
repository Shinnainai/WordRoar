package com.example.shinn.wordroar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MatchTwoActivity extends AppCompatActivity {

    CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10;
    TextView card1_tv, card2_tv, card3_tv, card4_tv, card5_tv, card6_tv, card7_tv, card8_tv, card9_tv,
            card10_tv;
    ImageView card1_img, card2_img, card3_img, card4_img, card5_img, card6_img, card7_img, card8_img,
            card9_img, card10_img;


    String[] images = {"ambulance.jpeg", "apple.jpg", "ball.png", "banana.png", "binoculars.jpg",
            "blue.png", "bread.png", "breakfast.jpg", "carrot.jpeg", "chair.jpg", "cheese.png",
            "clothes.jpg", "cow.png", "crab.png", "deer.jpg", "elephant.jpg", "ghost.png", "glasses.jpg",
            "grass.png", "green.jpg", "hospital.png", "ice.png", "island.jpg", "lobster.png", "music.png",
            "rabbit.jpg", "red.jpg", "scissors.jpg", "sheep.png", "six.jpg", "spaghetti.jpg",
            "squirrel.jpg", "star.jpg", "strawberry.jpg", "van.png", "yellow.png"};
    String[] imageNames = {"ambulance", "apple", "ball", "banana", "binoculars", "blue", "bread",
            "breakfast", "carrot", "chair", "cheese", "clothes", "cow", "crab", "deer", "elephant",
            "ghost", "glasses", "grass", "green", "hospital", "ice", "island", "lobster", "music",
            "rabbit", "red", "scissors", "sheep", "six", "spaghetti", "squirrel", "star", "strawberry",
            "van", "yellow"};
    List<String> selectedImages = new ArrayList<>();
    List<String> selectedImagesNames = new ArrayList<>();
    final boolean[] isMatch = {false};
    final int[] numbFlipped = {0};
    List<String> clicked = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_two);
        setViews();

        ImageButton homeBtn = findViewById(R.id.home_button);
        homeBtn.setOnClickListener((view) -> {
            finish();
        });

        card1.setOnClickListener(view -> {
            checkForReflip(card1_tv);
            card1_img.setVisibility(View.VISIBLE);
            card1_tv.setVisibility(View.VISIBLE);
        });
        card2.setOnClickListener(view -> {
            checkForReflip(card2_tv);
            card2_img.setVisibility(View.VISIBLE);
            card2_tv.setVisibility(View.VISIBLE);
        });
        card3.setOnClickListener(view -> {
            checkForReflip(card3_tv);
            card3_img.setVisibility(View.VISIBLE);
            card3_tv.setVisibility(View.VISIBLE);
        });
        card4.setOnClickListener(view -> {
            checkForReflip(card4_tv);
            card4_img.setVisibility(View.VISIBLE);
            card4_tv.setVisibility(View.VISIBLE);
        });
        card5.setOnClickListener(view -> {
            checkForReflip(card5_tv);
            card5_img.setVisibility(View.VISIBLE);
            card5_tv.setVisibility(View.VISIBLE);
        });
        card6.setOnClickListener(view -> {
            checkForReflip(card6_tv);
            card6_img.setVisibility(View.VISIBLE);
            card6_tv.setVisibility(View.VISIBLE);
        });
        card7.setOnClickListener(view -> {
            checkForReflip(card7_tv);
            card7_img.setVisibility(View.VISIBLE);
            card7_tv.setVisibility(View.VISIBLE);
        });
        card8.setOnClickListener(view -> {
            checkForReflip(card8_tv);
            card8_img.setVisibility(View.VISIBLE);
            card8_tv.setVisibility(View.VISIBLE);
        });
        card9.setOnClickListener(view -> {
            checkForReflip(card9_tv);
            card9_img.setVisibility(View.VISIBLE);
            card9_tv.setVisibility(View.VISIBLE);
        });
        card10.setOnClickListener(view -> {
            checkForReflip(card10_tv);
            card10_img.setVisibility(View.VISIBLE);
            card10_tv.setVisibility(View.VISIBLE);
        });
        System.out.println("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void setViews() {
        card1 = findViewById(R.id.match_two_card1);
        card1_img =  findViewById(R.id.match_two_img1);
        card1_tv =  findViewById(R.id.match_two_tv1);
        card2 =  findViewById(R.id.match_two_card2);
        card2_img = findViewById(R.id.match_two_img2);
        card2_tv = findViewById(R.id.match_two_tv2);
        card3 = findViewById(R.id.match_two_card3);
        card3_img = findViewById(R.id.match_two_img3);
        card3_tv = findViewById(R.id.match_two_tv3);
        card4 = findViewById(R.id.match_two_card4);
        card4_img = findViewById(R.id.match_two_img4);
        card4_tv = findViewById(R.id.match_two_tv4);
        card5 = findViewById(R.id.match_two_card5);
        card5_img = findViewById(R.id.match_two_img5);
        card5_tv = findViewById(R.id.match_two_tv5);
        card6 = findViewById(R.id.match_two_card6);
        card6_img = findViewById(R.id.match_two_img6);
        card6_tv = findViewById(R.id.match_two_tv6);
        card7 = findViewById(R.id.match_two_card7);
        card7_img = findViewById(R.id.match_two_img7);
        card7_tv = findViewById(R.id.match_two_tv7);
        card8 = findViewById(R.id.match_two_card8);
        card8_img = findViewById(R.id.match_two_img8);
        card8_tv = findViewById(R.id.match_two_tv8);
        card9 = findViewById(R.id.match_two_card9);
        card9_img = findViewById(R.id.match_two_img9);
        card9_tv = findViewById(R.id.match_two_tv9);
        card10 = findViewById(R.id.match_two_card10);
        card10_img = findViewById(R.id.match_two_img10);
        card10_tv = findViewById(R.id.match_two_tv10);
    }

    private void checkForReflip(TextView card_tv) {
        if(numbFlipped[0] == 2 && isMatch[0]) {
            numbFlipped[0] = 0;
            clicked.remove(0);
            clicked.remove(0);
            isMatch[0] = false;
        } else if(numbFlipped[0] == 2 && !isMatch[0]){
            resetAllViews();
            clicked.remove(0);
            clicked.remove(0);
            numbFlipped[0] = 0;
        } else if(numbFlipped[0] == 1) {
            if(clicked.get(0).equalsIgnoreCase((String) card_tv.getText())) {
                isMatch[0] = true;
            }
        }
        clicked.add((String) card_tv.getText());
        numbFlipped[0] += 1;
    }

    private void resetAllViews() {
        card1_img.setVisibility(View.INVISIBLE);
        card1_tv.setVisibility(View.INVISIBLE);
        card2_img.setVisibility(View.INVISIBLE);
        card2_tv.setVisibility(View.INVISIBLE);
        card3_img.setVisibility(View.INVISIBLE);
        card3_tv.setVisibility(View.INVISIBLE);
        card4_img.setVisibility(View.INVISIBLE);
        card4_tv.setVisibility(View.INVISIBLE);
        card5_img.setVisibility(View.INVISIBLE);
        card5_tv.setVisibility(View.INVISIBLE);
        card6_img.setVisibility(View.INVISIBLE);
        card6_tv.setVisibility(View.INVISIBLE);
        card7_img.setVisibility(View.INVISIBLE);
        card7_tv.setVisibility(View.INVISIBLE);
        card8_img.setVisibility(View.INVISIBLE);
        card8_tv.setVisibility(View.INVISIBLE);
        card9_img.setVisibility(View.INVISIBLE);
        card9_tv.setVisibility(View.INVISIBLE);
        card10_img.setVisibility(View.INVISIBLE);
        card10_tv.setVisibility(View.INVISIBLE);
    }
}
