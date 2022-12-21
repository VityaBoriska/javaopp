package com.example.javaopp;

import android.util.Log;

public abstract class Animal {
    int numberOfLegs;
    boolean isAlive;


    abstract public void draw();

    public String breathe(){
        //Log.i("Breathe()", "I can breathe");
        return "I can breathe";
    }
}

