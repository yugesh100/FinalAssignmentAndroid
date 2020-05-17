package com.example.finalassignment;


import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.finalassignment.tasks.MainActivity;

public class Court_counterActivity extends AppCompatActivity {

    public static final String TAG = "Court_counterActivity";
    public static final String TEAM_A_SCORE = "team_a_score";
    private ScoreViewModelActivity viewModel;


    private TextView textViewTeamA;
    private TextView textViewTeamB;
    private Button endgamecourt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);

        textViewTeamA = findViewById(R.id.team_a_score);
        textViewTeamB = findViewById(R.id.team_b_score);
        endgamecourt = (Button)findViewById(R.id.game_court_count);
        Log.i( "Court_counterActivity", "ViewModelProviders called");
        viewModel = ViewModelProviders.of(this).get(ScoreViewModelActivity.class);
        displayScoreForTeamA(viewModel.teamAScore);
        displayScoreForTeamB(viewModel.teamBScore);


        endgamecourt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endcourtcount();
            }
        });
    }


    public void add3ForTeamA(View view) {
        viewModel.teamAScore =viewModel.teamAScore + 3;
        displayScoreForTeamA(viewModel.teamAScore);

    }
    public void add2ForTeamA(View view){
        viewModel.teamAScore =viewModel.teamAScore +2;
        displayScoreForTeamA(viewModel.teamAScore);
    }
    public void add1ForTeamA(View view){
        viewModel.teamAScore =viewModel.teamAScore +1;
        displayScoreForTeamA(viewModel.teamAScore);
    }
    public void add3ForTeamB(View view){
        viewModel.teamBScore =viewModel.teamBScore +3;
        displayScoreForTeamB(viewModel.teamBScore);
    }
    public void add2ForTeamB(View view){
        viewModel.teamBScore =viewModel.teamBScore +2;
        displayScoreForTeamB(viewModel.teamBScore);
    }
    public void add1ForTeamB(View view){
        viewModel.teamBScore =viewModel.teamBScore +1;
        displayScoreForTeamB(viewModel.teamBScore);
    }

    public void displayScoreForTeamA(int score){
        textViewTeamA.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score){
        textViewTeamB.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        viewModel.teamAScore = 0;
        viewModel.teamBScore = 0;
        displayScoreForTeamA(viewModel.teamAScore);
        displayScoreForTeamB(viewModel.teamBScore);

    }
    @Override
    protected void onStart(){
        super.onStart();
        //Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //  Log.d(TAG,"onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Log.d(TAG,"onRestart");
    }
public void endcourtcount(){
        Intent endgamecourt=new Intent(Court_counterActivity.this, MainActivity.class);
        startActivity(endgamecourt);
}

}
