package com.adi.dicee;

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

        Button rollButton;

        rollButton=(Button)findViewById(R.id.rollButton);


        final ImageView leftDice,rightDice;
        final ImageView winner = (ImageView)findViewById(R.id.Winner);
        leftDice = (ImageView)findViewById(R.id.image_leftDice);
         rightDice=(ImageView)findViewById(R.id.image_rightDice);


         final int hi =R.drawable.winner;

       final int diceArray[]={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Hello Adi");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);

                Log.d("Dicee","Random Number is "+number);

                leftDice.setImageResource(diceArray[number]);

                int number2 = randomNumberGenerator.nextInt(6);

                rightDice.setImageResource(diceArray[number2]);



                    if(diceArray[number]==diceArray[number2]) {
                        winner.setVisibility(View.VISIBLE);
                        winner.setImageResource(hi);
                        }
                        else
                     {
                        winner.setVisibility(View.INVISIBLE);

                      }







            }
        });




    }
}
