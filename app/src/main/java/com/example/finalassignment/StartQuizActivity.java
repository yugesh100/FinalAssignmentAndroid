package com.example.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartQuizActivity extends AppCompatActivity {

    private Button startQuizButton;
    private Button startcourtcounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        startQuizButton = findViewById(R.id.start_button);
        startcourtcounter= (Button)findViewById(R.id.Button_Court_counter);
        startcourtcounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartCourtCounter();
            }
        });
        startQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartQuizActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });

    }
    public void StartCourtCounter(){
        Intent yugeshplaycountcounter=new Intent(StartQuizActivity.this,Court_counterActivity.class);
        startActivity(yugeshplaycountcounter);
    }
}
