package com.example.lesson_six_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
        implements VideoProcessor.VideoCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String TEST;
        TEST = "hi";

        VideoProcessor processor = new VideoProcessor(this);
        processor.startVideoProcessing();


    Cat.getType();
    Cat cat = new Cat();
    String sound = cat.normalSound;
    cat.sleep();
    String extra = Cat.extraSound;

    Designer vasya = new Designer();
    Programmer lucas = new Programmer();

    vasya.work();
    lucas.work();

    Human anonymousHuman = new Human() {
        @Override
        void work() {
            Log.d("myLog", "Human working");
        }

        void eat(String food){
            Log.d("myLog", "Favorite food: " + food);

        }
    };
    anonymousHuman.work();
    vasya.eat("French fries");
    lucas.eat("Fish");
    anonymousHuman.eat("Noodles");

    Farmer farmer = new Farmer();
    farmer.build();


    }

    @Override
    public void onFinished() {

    }
}