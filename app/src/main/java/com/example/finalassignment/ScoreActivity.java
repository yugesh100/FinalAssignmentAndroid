package com.example.finalassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalassignment.tasks.MainActivity;

public class ScoreActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private Button EndQuizgames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        setContentView(R.layout.activity_score);
        textView = findViewById(R.id.textView);
        EndQuizgames =(Button) findViewById(R.id.EndQuizgame);
        button = findViewById(R.id.button);
        Intent intent = getIntent();
        String score = intent.getStringExtra("SCORE");
        textView.setText(score);
        EndQuizgames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endquizgame();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this, StartQuizActivity.class);
                startActivity(intent);
            }
        });
    }


public void endquizgame()
{
    Intent quizofyugesh=new Intent(ScoreActivity.this, MainActivity.class);
    startActivity(quizofyugesh);


}
}
