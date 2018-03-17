package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0 ;
    int scoreTeamB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addthreepoints(View view)
    {
        scoreTeamA += 3 ;
        displayForTeamA(scoreTeamA);

    }
    public void addthreepoint(View view)
    {
        scoreTeamB += 3 ;
        displayForTeamB(scoreTeamB);

    }

    public void addtwopoints(View view){
        scoreTeamA += 2 ;
        displayForTeamA(scoreTeamA);

    }

    public void addtwopoint(View view){
        scoreTeamB += 2 ;
        displayForTeamB(scoreTeamB);

    }

    public void Freethrow(View view){
        scoreTeamA += 1 ;
        displayForTeamA(scoreTeamA);
    }

    public void Freethrows(View view){
        scoreTeamB += 1 ;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0 ;
        scoreTeamB = 0 ;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
