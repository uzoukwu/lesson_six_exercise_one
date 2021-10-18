package com.example.lesson_six_exercise_one;

import android.util.Log;

public class DefenceTower implements Attacking{
    @Override
    public void attack() {
        Log.d("myLog", "attack");
    }
}
