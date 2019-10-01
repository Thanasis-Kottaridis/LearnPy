package com.unipi.kottarido.learnpy.learnpy;

import android.content.Intent;

public class Tuple implements Comparable<Tuple> {
    public  String x;
    public  Integer y;
    public Tuple(String x, int y) {
        this.x = x;
        this.y = y;
    }

    // CONSTRUCTOR GIA TIN FRIEBASE

    public Tuple(){
    }

    public String getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public int compareTo(Tuple o) {
        return this.y.compareTo(o.getY());
    }
}
