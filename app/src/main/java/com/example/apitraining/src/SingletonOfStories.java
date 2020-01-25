package com.example.apitraining.src;

import java.util.ArrayList;

public class SingletonOfStories {
    private static SingletonOfStories single_instance = null;

    public ArrayList<HackerStory> arrayOfStories;
    private SingletonOfStories(){

    }
    public void addStory (HackerStory hackerStory){
        arrayOfStories.add(hackerStory);
    }
    public ArrayList<HackerStory> getStories(){
        return arrayOfStories;
    }

    public static SingletonOfStories getInstance(){
        if (single_instance==null){
            single_instance= new SingletonOfStories();
        }
        return single_instance;
    }
}
