package com.example.hamzeh.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get reference to UI elements
        Button rollButton = (Button) findViewById(R.id.roll_btn);
        final ImageView leftDice = (ImageView) findViewById(R.id.img_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.img_rightDice);

        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2,R.drawable.dice3,
                          R.drawable.dice4, R.drawable.dice5,R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenerator = new Random();
                int randomNumber = randomNumberGenerator.nextInt(6);
                leftDice.setImageResource(diceArray[randomNumber]);
                Log.d("Dicee","randomNumber = " + randomNumber);

                int randomNumber2 = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[randomNumber2]);
                Log.d("Dicee","randomNumber = " + randomNumber2);
            }
        });


    }
}
