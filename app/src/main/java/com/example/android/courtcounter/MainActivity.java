package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;
import static java.util.logging.Logger.global;

public class MainActivity extends AppCompatActivity {

    int globalScoreA = 0;
    int globalScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set3PointsA (View View){
        globalScoreA+=3;
        displayForTeamA(globalScoreA);
    }


    public void set2PointsA (View View){
        globalScoreA+=2;
        displayForTeamA(globalScoreA);
    }

    public void set1PointA (View View){
        globalScoreA+=1;
        displayForTeamA(globalScoreA);
    }


    public void set3PointsB (View View){
        globalScoreB+=3;
        displayForTeamB(globalScoreB);
    }


    public void set2PointsB (View View){
        globalScoreB+=2;
        displayForTeamB(globalScoreB);
    }

    public void set1PointB (View View){
        globalScoreB+=1;
        displayForTeamB(globalScoreB);
    }

    public void resetScore (View v){
        globalScoreA = 0;
        globalScoreB = 0;
        displayForTeamA(globalScoreA);
        displayForTeamB(globalScoreB);
    }

    public void displayForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
