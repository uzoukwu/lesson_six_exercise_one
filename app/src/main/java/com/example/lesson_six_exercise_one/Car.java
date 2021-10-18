package com.example.lesson_six_exercise_one;

public class Car {
    static String type = "Car";
    public int wheels = 4;

    static String getModel() {
        return "BMV";
    }

    public String getDriver(){
        return "John Wick";
    }

    Engine myengine = new Engine();



    private class Engine{
        public String model = "Engine-12";
        public int engineweight = 50;

        public void startEngine(){

        }
    }
}
