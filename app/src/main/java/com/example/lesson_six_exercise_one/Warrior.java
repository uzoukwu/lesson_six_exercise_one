package com.example.lesson_six_exercise_one;

import android.util.Log;

public class Warrior implements Movable, Attacking{
    @Override
    public void attack() {
        Log.d("myLog", "attack");
    }

    @Override
    public void move() {
        Log.d("myLog", "move");
    }

    @Override
    public void stop() {
        Log.d("myLog", "stop");
    }

}
