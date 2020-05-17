package com.example.finalassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    private Button submitButton;
    private int score;
    private RadioGroup numOneRadionGroup;
    private RadioGroup numTwoRadionGroup;
    private RadioGroup numFiveRadionGroup;

    private EditText editText;
    private CheckBox firstCheckbox;
    private CheckBox secondCheckbox;
    private CheckBox thirdCheckbox;
    private CheckBox fourCheckbox;
    private CheckBox fiveCheckbox;
    private CheckBox sixCheckBox;
    private CheckBox sevenCheckBox;
    private CheckBox eightCheckBox;
    private CheckBox nineCheckBox;
    private CheckBox tenCheckBox;
    private CheckBox elevenCheckBox;
    private CheckBox twelveCheckBox;
    private CheckBox thirteenCheckBox;
    private CheckBox fourteenCheckBox;
    private CheckBox fifteenCheckBox;
    private RadioGroup sixteenradioBox;
    private RadioGroup eighteenradioBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton = findViewById(R.id.submit_button);
        editText = findViewById(R.id.edit_text);
        firstCheckbox = findViewById(R.id.first_checkbox);
        thirdCheckbox = findViewById(R.id.third_checkbox);
        fourCheckbox = findViewById(R.id.four_checkbox);
        secondCheckbox = findViewById(R.id.second_checkbox);
        numOneRadionGroup = findViewById(R.id.num_one_radio_group);
        numTwoRadionGroup = findViewById(R.id.num_two_radio_group);
        numFiveRadionGroup = findViewById(R.id.num_five_radio_group);
        fiveCheckbox =findViewById(R.id.five_checkbox);
        sixCheckBox = findViewById(R.id.six_checkbox);
        sevenCheckBox = findViewById(R.id.seven_checkbox);
        eightCheckBox = findViewById(R.id.eight_checkbox);
        nineCheckBox = findViewById(R.id.nine_checkbox);
        tenCheckBox = findViewById(R.id.ten_checkbox);
        elevenCheckBox = findViewById(R.id.eleven_checkbox);
        twelveCheckBox =findViewById(R.id.twelve_checkbox);
        thirteenCheckBox = findViewById(R.id.thirteen_checkbox);
        fourteenCheckBox = findViewById(R.id.fourteen_checkbox);
        fifteenCheckBox = findViewById(R.id.fifteen_checkbox);
        sixteenradioBox =findViewById(R.id.sixteen_radiobutton);
        eighteenradioBox=findViewById(R.id.eighteen_radiobutton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score = 0;

                if(numOneRadionGroup.getCheckedRadioButtonId() == R.id.name_radio){
                    score += 1;
                }

                if(numTwoRadionGroup.getCheckedRadioButtonId() == R.id.device_radio){
                    score += 1;
                }

                if(numFiveRadionGroup.getCheckedRadioButtonId() == R.id.stop_resume_radio){
                    score += 1;
                }

                String userAnswer = editText.getText().toString();
                if(userAnswer.equalsIgnoreCase("manifest")){
                    score += 1;
                }

                if(firstCheckbox.isChecked() && fourCheckbox.isChecked() && !thirdCheckbox.isChecked()
                && !secondCheckbox.isChecked()){
                    score += 1;
                }
                if(fiveCheckbox.isChecked() && sevenCheckBox.isChecked() && nineCheckBox.isChecked()
                        && tenCheckBox.isChecked()&& elevenCheckBox.isChecked()&& !sixCheckBox.isChecked()&& !eightCheckBox.isChecked()){
                    score += 1;
                }
                if(twelveCheckBox.isChecked() && !thirteenCheckBox.isChecked() && !fourteenCheckBox.isChecked()
                        && !fifteenCheckBox.isChecked()){
                    score += 1;
                }
                if(sixteenradioBox.getCheckedRadioButtonId() == R.id.seventeen_radiobutton){
                    score += 1;
                }
                if(eighteenradioBox.getCheckedRadioButtonId() == R.id.nineteen_radiobutton){
                    score += 1;
                }
            Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
            intent.putExtra("SCORE", score+"/9");
            startActivity(intent);

            }
        });


    }
}




