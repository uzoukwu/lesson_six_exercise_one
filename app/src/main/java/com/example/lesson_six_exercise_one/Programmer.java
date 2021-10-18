package com.example.lesson_six_exercise_one;

import android.util.Log;

public class Programmer extends Human{
    @Override
    void work(){
        Log.d("myLog", "Write Code...");
    }

    void eat(String food) {
        Log.d("myLog", "Favorite food: " + food);
    }
}
