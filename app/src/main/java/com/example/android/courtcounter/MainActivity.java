package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int scoreCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOne(View view) {
        scoreCounter++;
        displayScore(scoreCounter);
    }

    public void addTwo(View view) {
        scoreCounter  += 2;
        displayScore(scoreCounter);
    }

    public void addThree(View view) {
        scoreCounter += 3;
        displayScore(scoreCounter);
    }

    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_view);
        scoreView.setText(Integer.toString(score));
    }
}
