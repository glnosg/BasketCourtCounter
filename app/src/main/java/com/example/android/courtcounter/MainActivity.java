package com.example.android.courtcounter;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_main);
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

    public void addOneTeamA(View view) {
        scoreTeamA++;
        displayScoreTeamA(scoreTeamA);
    }

    public void addTwoTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void addThreeTeamA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_view_team_a);
        scoreView.setText(Integer.toString(score));
    }

    public void addOneTeamB(View view) {
        scoreTeamB++;
        displayScoreTeamB(scoreTeamB);
    }

    public void addTwoTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void addThreeTeamB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_view_team_b);
        scoreView.setText(Integer.toString(score));
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}
