package com.example.finalassignment;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class ScoreViewModelActivity extends ViewModel {
    public int teamAScore = 0 ;
    public int teamBScore = 0;
    public ScoreViewModelActivity(){
        super();
        Log.i("ScoreViewModelActivity", "ScoreViewModel created");
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("ScoreViewModelActivity", "ScoreViewModel destroyed");
    }

}
