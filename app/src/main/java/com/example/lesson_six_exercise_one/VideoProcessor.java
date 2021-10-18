package com.example.lesson_six_exercise_one;

public class VideoProcessor {
    private final VideoCallback callback;
    public VideoProcessor(VideoCallback callback) {
        this.callback = callback;
    }
    void startVideoProcessing(){
        callback.onFinished();
    }
    interface VideoCallback{
        public void onFinished();
    }
}
