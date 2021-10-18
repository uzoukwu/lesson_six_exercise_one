package com.example.lesson_six_exercise_one;

import android.util.Log;

public class Farmer implements Movable{
    @Override
    public void move() {
        Log.d("myLog", "move");
    }

    public void stop(){
        Log.d("myLog", "stop");
    }

    public void build() {
        Log.d("myLog", "build");
    }
}
