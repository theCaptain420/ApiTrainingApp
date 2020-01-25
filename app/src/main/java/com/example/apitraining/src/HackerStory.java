package com.example.apitraining.src;

import java.lang.reflect.Array;

public class HackerStory {
    public String by;
    public int descendants;
    public int id;
    public int[] kids;
    public int score;
    public int time;
    public String title;
    public String type;
    public String url;


    public HackerStory(String by, int descendants, int id, int[] kids, int score, int time, String title, String type, String url) {
        this.by = by;
        this.descendants = descendants;
        this.id = id;
        this.kids = kids;
        this.score = score;
        this.time = time;
        this.title = title;
        this.type = type;
        this.url = url;
    }

    public String getBy() {
        return by;
    }

    public int getDescendants() {
        return descendants;
    }

    public int getId() {
        return id;
    }

    public int[] getKids() {
        return kids;
    }

    public int getScore() {
        return score;
    }

    public int getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}
