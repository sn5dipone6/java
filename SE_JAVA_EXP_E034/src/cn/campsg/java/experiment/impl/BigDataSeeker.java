package cn.campsg.java.experiment.impl;

import cn.campsg.java.experiment.SeekJob;

public class BigDataSeeker implements SeekJob {
    private String name;
    private float[] scores;
    
    public BigDataSeeker(String name, float[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public BigDataSeeker() {
        name = "xiaoming";
        scores = new float[]{100.0f, 100.0f};
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScores(float[] scores) {
        this.scores = scores;
    }

    public float[] getScores() {
        return scores;
    }

    public float getSeekerAverage() {
        return scores[0] * 0.5f + scores[1] * 0.5f;
    }

}